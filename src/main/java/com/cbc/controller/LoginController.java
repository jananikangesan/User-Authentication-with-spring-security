package com.cbc.controller;


import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String homepPage() {
		return "home";
	}
	
	
//	@GetMapping("/loginForm")
//	public String login() {
//		return "login";
//	}
//	
	
	@GetMapping("/index")
    public String index() {
        return "index"; 
    }

}
