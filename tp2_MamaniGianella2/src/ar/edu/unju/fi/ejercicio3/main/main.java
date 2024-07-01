package ar.edu.unju.fi.ejercicio3.main;

import java.util.ArrayList;

import ar.edu.unju.fi.ejercicio3.constantes.provincia;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<provincia> provincias = new ArrayList<>();

		for (provincia provincia : provincias) {
            System.out.println("Provincia: " + provincia.name());
            System.out.println("Población: " + provincia.getCantPoblacion());
            System.out.println("Superficie: " + provincia.getSuperficie());
            System.out.println("Densidad poblacional: " + provincia.densidadPoblacional());
            System.out.println();
        }


	}
}
