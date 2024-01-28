package com.website.insight;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/main")
    public String main() {
        return "MainCard";
    }
	
	@GetMapping("/study")
	public String study() {
		return "Study";
	}
	
	@GetMapping("/activity")
	public String activity() {
		return "Activity.html";
	}
	
	@GetMapping("/project")
	public String project() {
		return "Project";
	}
	
}
