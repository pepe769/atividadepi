package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class indexController {

	@RequestMapping("/")
	public String index() {
		System.out.println();
		return "home";
		
	}
	
}
