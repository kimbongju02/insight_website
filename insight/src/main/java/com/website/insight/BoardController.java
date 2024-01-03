package com.website.insight;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
 
import java.io.IOException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
//@RequestMapping("/post")
@Controller
public class BoardController {
	
	private final org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final FileService fileService;
	
    public BoardController(FileService fileService) {
        this.fileService = fileService;
    }
	
	@GetMapping("/file")
	public String file_page() {
		return "fileAttach";
	}
	
	@PostMapping("/fileUpload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = fileService.storeFile(file);
 
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();
        return "fileAttach";
        //return new FileUploadDTO(fileName, fileDownloadUri, file.getContentType(), file.getSize());
    }
	
	@GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // 파일을 Resource타입으로 받아온다.
        Resource resource = fileService.loadFileAsResource(fileName);
 
        // 파일 content type 확인 (jpg, png 등..)
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            log.info("Could not determine file type.");
        }
 
        // 파일 타입을 알 수 없는 경우의 기본값
        if(contentType == null) {
            contentType = "application/octet-stream";
        }
 
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
  