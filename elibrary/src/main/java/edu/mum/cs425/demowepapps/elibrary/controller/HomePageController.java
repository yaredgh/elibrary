package edu.mum.cs425.demowepapps.elibrary.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	@GetMapping(value = {"/","/elibrary","/elibrary/home"})
	public String dieplayHomePage() {
		return "home/index";
	}
	

}
