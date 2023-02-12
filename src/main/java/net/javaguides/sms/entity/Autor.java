package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "fnac")
	private String fnac;
	
	public Autor() {
		
	}
	
	public Autor(String nombre, String apellido, String fnac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fnac = fnac;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFnac() {
		return fnac;
	}
	public void setFnac(String fnac) {
		this.fnac = fnac;
	}
}
