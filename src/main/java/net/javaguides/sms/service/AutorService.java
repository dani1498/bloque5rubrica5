package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Autor;

public interface AutorService {
	List<Autor> getAllAutores();
	
	Autor saveAutor(Autor autor);
	
	Autor getAutorById(Long id);
	
	Autor updateAutor(Autor autor);
	
	void deleteAutorById(Long id);
}
