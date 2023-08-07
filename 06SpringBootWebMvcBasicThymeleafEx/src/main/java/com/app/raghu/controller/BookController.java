package com.app.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	@GetMapping("/show")
	public String showPages(Model model) {
		model.addAttribute("message", "Birthday Special");
		return"BookPage";
	}
	@GetMapping("/data")
	public String showData()
	{
		return "BookData";
	}

}
