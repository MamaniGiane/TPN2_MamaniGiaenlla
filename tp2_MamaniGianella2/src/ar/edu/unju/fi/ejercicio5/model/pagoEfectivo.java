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


	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub
		montoPago = 0.90 * monto;
	}


	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Fecha de Pago: "+ fechaPago);
		System.out.println("Monto Pagado: "+ montoPago);
	}
	
	
	
}
