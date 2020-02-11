package com.uniovi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Professor {
	private String nombre, apellidos, categoria;
	@Id
	@GeneratedValue
	private int dni;
	public Professor(String nombre, String apellidos, String categoria, int dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.dni = dni;
	}
	public Professor() {};
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

}
