package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.fi.ejercicio4.constantes.posicion;

public class jugador {

	private String nombre;
	private String apellido;
	private LocalDate fecNac;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private posicion posicion;
	
	public jugador() {
		// TODO Auto-generated constructor stub
	}
	
	

	public jugador(String nombre, String apellido, LocalDate fecNac, String nacionalidad, double estatura, double peso, posicion posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecNac = fecNac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
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

	public LocalDate getFecNac() {
		return fecNac;
	}

	public void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(posicion posicion) {
		this.posicion = posicion;
	}
	
	
}
