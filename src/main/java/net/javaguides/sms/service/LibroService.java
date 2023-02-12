package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Libro;

public interface LibroService {
	List<Libro> getAllLibros();
	
	Libro saveLibro(Libro libro);
	
	Libro getLibroById(Long id);
	
	Libro updateLibro(Libro libro);
	
	void deleteLibroById(Long id);
}