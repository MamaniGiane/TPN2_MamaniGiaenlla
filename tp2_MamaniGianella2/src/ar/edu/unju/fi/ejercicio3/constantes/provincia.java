package ar.edu.unju.fi.ejercicio3.constantes;

public enum provincia {

	Jujuy(1000000, 5325.6), Salta(1500000, 7500.2), 
	Tucuman(800000, 4000.0), Catamarca(500000, 3000.8), 
	La_Rioja(300000, 2500.5), Santiago_Del_Estero(1200000, 6000.7);

	private int cantPoblacion;
	private double superficie;

	private provincia(int cantPoblacion, double superficie) {
		 this.cantPoblacion = cantPoblacion;
	     this.superficie = superficie;
	}

	public int getCantPoblacion() {
		return cantPoblacion;
	}

	public void setCantPoblacion(int cantPoblacion) {
		this.cantPoblacion = cantPoblacion;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double densidadPoblacional() {
		return cantPoblacion / superficie;
	}
}
