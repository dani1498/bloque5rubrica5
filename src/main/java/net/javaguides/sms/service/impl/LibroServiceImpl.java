package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Libro;
import net.javaguides.sms.repository.LibroRepository;
import net.javaguides.sms.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{

	private LibroRepository libroRepository;
	
	public LibroServiceImpl(LibroRepository libroRepository) {
		super();
		this.libroRepository = libroRepository;
	}

	@Override
	public List<Libro> getAllLibros() {
		return libroRepository.findAll();
	}

	@Override
	public Libro saveLibro(Libro libro) {
		return libroRepository.save(libro);
	}

	@Override
	public void deleteLibroById(Long id) {
		libroRepository.deleteById(id);	
	}

    @Override
    public Libro getLibroById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Libro updateLibro(Libro libro) {
        // TODO Auto-generated method stub
        return null;
    }

}