package com.website.insight;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class HomeController {
	
	@GetMapping("/") 
	public String main_page() { 
		return "main_page"; 
	}
	
	@GetMapping("/post")
	public String board_page() {
		return "post";
	}
	
	@GetMapping("/clubintro")
	public String club_intro() {
		return "main_page";
	}
	
	@GetMapping("/clubrecruit")
	public String club_recruit() {
		return "club_recruit";
	}
}
