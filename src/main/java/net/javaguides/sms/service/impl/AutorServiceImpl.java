package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Autor;
import net.javaguides.sms.repository.AutorRepository;
import net.javaguides.sms.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{

	private AutorRepository autorRepository;
	
	public AutorServiceImpl(AutorRepository autorRepository) {
		super();
		this.autorRepository = autorRepository;
	}

	@Override
	public List<Autor> getAllAutores() {
		return autorRepository.findAll();
	}

	@Override
	public Autor saveAutor(Autor autor) {
		return autorRepository.save(autor);
	}

	@Override
	public Autor getAutorById(Long id) {
		return autorRepository.findById(id).get();
	}

	@Override
	public Autor updateAutor(Autor autor) {
		return autorRepository.save(autor);
	}

	@Override
	public void deleteAutorById(Long id) {
		autorRepository.deleteById(id);	
	}

}
