package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Autor;
import net.javaguides.sms.repository.AutorRepository;
@SpringBootApplication
public class AutorManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AutorManagementSystemApplication.class, args);
	}

	@Autowired
	private AutorRepository autorRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		 Autor autor1 = new Autor("William", "Shakespeare", "12/04/1865");
		 autorRepository.save(autor1);
		  
		 Autor autor2 = new Autor("Cristiano", "Ronaldo", "23/11/1997");
		 autorRepository.save(autor2);
		 
		 Autor autor3 = new Autor("Gorka", "Sanz", "01/10/1980");
		 autorRepository.save(autor3);
	}
	

}
