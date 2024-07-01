package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class pagoEfectivo implements Pago{

	private double montoPago;
	private LocalDate fechaPago;
	
	
	public pagoEfectivo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public pagoEfectivo(double montoPago, LocalDate fechaPago) {
		super();
		this.montoPago = montoPago;
		this.fechaPago = fechaPago;
	}


	public double getMontoPago() {
		return montoPago;
	}


	public void setMontoPago(double montoPago) {
		this.montoPago = montoPago;
	}


	public LocalDate getFechaPago() {
		return fechaPago;
	}


	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	
	
	
}
