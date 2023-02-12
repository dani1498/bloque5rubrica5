package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}