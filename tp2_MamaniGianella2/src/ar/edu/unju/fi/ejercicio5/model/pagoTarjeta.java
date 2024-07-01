package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class pagoTarjeta implements Pago{

	private String numTarjeta;
	private LocalDate fechaPago;
	private double montoPago;
	
	
	
	public pagoTarjeta(String numTarjeta, LocalDate fechaPago, double montoPago) {
		super();
		this.numTarjeta = numTarjeta;
		this.fechaPago = fechaPago;
		this.montoPago = montoPago;
	}
	
	public pagoTarjeta() {
		// TODO Auto-generated constructor stub
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	public double getMontoPago() {
		return montoPago;
	}
	public void setMontoPago(double montoPago) {
		this.montoPago = montoPago;
	}
	
	@Override
	public void realizarPago(double monto) {
		// TODO Auto-generated method stub
		montoPago = 1.15 * monto;
	}
	@Override
	public void imprimirRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Numero de Tarjeta: "+numTarjeta);
		System.out.println("Fecha de Pago: "+fechaPago);
		System.out.println("Monto Pagado: "+montoPago);
	}
}
