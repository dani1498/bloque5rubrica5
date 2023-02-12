package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Libro;
import net.javaguides.sms.service.LibroService;

@Controller
public class LibroController {
	
	private LibroService libroService;

	public LibroController(LibroService libroService) {
		super();
		this.libroService = libroService;
	}
	
	@GetMapping("/libros")
	public String listLibros(Model model) {
		model.addAttribute("libros", libroService.getAllLibros());
		return "libros";
	}
	
	@GetMapping("/libros/new")
	public String createLibroForm(Model model) {
		
		
		Libro libro = new Libro();
		model.addAttribute("libro", libro);
		return "create_libro";
		
	}
	
	@PostMapping("/libros")
	public String saveLibro(@ModelAttribute("libro") Libro libro) {
		libroService.saveLibro(libro);
		return "redirect:/libros";
	}
}
