package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Autor;
import net.javaguides.sms.service.AutorService;

@Controller
public class AutorController {
	
	private AutorService autorService;

	public AutorController(AutorService autorService) {
		super();
		this.autorService = autorService;
	}
	
	@GetMapping("/autores")
	public String listAutores(Model model) {
		model.addAttribute("autores", autorService.getAllAutores());
		return "autores";
	}
	
	@GetMapping("/autores/new")
	public String createAutorForm(Model model) {
		
		
		Autor autor = new Autor();
		model.addAttribute("autor", autor);
		return "create_autor";
		
	}
	
	@PostMapping("/autores")
	public String saveAutor(@ModelAttribute("autor") Autor autor) {
		autorService.saveAutor(autor);
		return "redirect:/autores";
	}
}
