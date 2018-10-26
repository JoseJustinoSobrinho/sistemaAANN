package br.senac.rn.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class HomeController {

	@GetMapping
	public String login(Model model) {
		return "login";
	}
	
}
