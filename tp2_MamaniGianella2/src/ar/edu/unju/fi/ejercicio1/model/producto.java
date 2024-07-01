package ar.edu.unju.fi.ejercicio1.model;

import ar.edu.unju.fi.ejercicio1.model.constantes.paises;
import ar.edu.unju.fi.ejercicio1.model.constantes.categoria;

public class producto {

	private String codigo;
	private String descripcion;
	private int preunitario;
	private paises origen;
	private categoria categoria;

	public producto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPreunitario() {
		return preunitario;
	}

	public void setPreunitario(int preunitario) {
		this.preunitario = preunitario;
	}

	public paises getOrigen() {
		return origen;
	}

	public void setOrigen(paises origen) {
		this.origen = origen;
	}

	public categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}

	
	@Override
	public String toString() {
		return "producto []";
	}
	
}
