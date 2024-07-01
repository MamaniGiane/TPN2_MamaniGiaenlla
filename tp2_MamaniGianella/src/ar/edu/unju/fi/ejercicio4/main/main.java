package ar.edu.unju.fi.ejercicio4.main;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.posicion;
import ar.edu.unju.fi.ejercicio4.model.jugador;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        ArrayList<jugador> jugadores = new ArrayList<>();
        int opcion = 0;
        
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Alta de jugador");
            System.out.println("2. Mostrar todos los jugadores");
            System.out.println("3. Modificar la posición de un jugador");
            System.out.println("4. Eliminar un jugador");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                    	altaJugador(jugadores, scanner);
                        break;
                    case 2:
                    	mostrarJugadores(jugadores, scanner);
                        break;
                    case 3:
                    	modificarPosicion(jugadores, scanner);
                        break;
                    case 4:
                    	eliminarJugador(jugadores, scanner);
                        break;
                    case 5:
                        System.out.println("fin del programa");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        } while (opcion != 5);
        
	}

	
	
	private static void eliminarJugador(ArrayList<jugador> jugadores, Scanner scanner) {
		
		System.out.println("Ingrese nombre y apellido del jugador a eliminar: ");
		String nom = scanner.nextLine();
		String ape = scanner.nextLine();
		
		for(int i =0; i < jugadores.size() ; i ++) {
			
			jugador jugadorEliminado = jugadores.get(i);
			if(jugadorEliminado.getNombre().equals(nom) && jugadorEliminado.getApellido().equals(ape)) {
				jugadores.remove(jugadorEliminado);
				System.out.println("Se elimino el jugador");
			}
		}
		
	}

	private static void modificarPosicion(ArrayList<jugador> jugadores, Scanner scanner) {
		
		System.out.println("Ingrese nombre y apellido del jugador a modificar: ");
		String nom = scanner.nextLine();
		String ape = scanner.nextLine();
		
		for(int i =0; i < jugadores.size() ; i ++) {
			
			jugador jugadorModificado = jugadores.get(i);
			if(jugadorModificado.getNombre().equals(nom) && jugadorModificado.getApellido().equals(ape)) {
				System.out.println("Selecione nuva posicion del jugador: ");
				System.out.println("1- Delantero");
		    	System.out.println("2- Medio");
		    	System.out.println("3- Defensa");
		    	System.out.println("4- Arquero");
		    	
		    	int opcion = scanner.nextInt();
		    	switch(opcion) {
		    	case 1:
		    		jugadorModificado.setPosicion(posicion.Delantero);
		    		break;
		    	case 2:
		    		jugadorModificado.setPosicion(posicion.Medio);
		    		break;
		    	case 3:
		    		jugadorModificado.setPosicion(posicion.Defensa);
		    		break;
		    	case 4:
		    		jugadorModificado.setPosicion(posicion.Arquero);
		    		break;
		    	}
		    	System.out.println("Posicion modificada");
			}
			return;
		}
	}

	private static void mostrarJugadores(ArrayList<jugador> jugadores, Scanner scanner) {
		
		System.out.println("Jugadores: ");
    	for (int i =0; i < jugadores.size() ; i ++) {
    		
    		if (i >= 0 && i < jugadores.size()) {
    		
    		jugador jugadorListado = jugadores.get(i);
			System.out.println("Nombre: " + jugadorListado.getNombre());
    		System.out.println("Apellido: " + jugadorListado.getApellido());
    		System.out.println("Fecha de Nacimiento: " + jugadorListado.getFecNac());
    		System.out.println("Edad: " + calcularEdad(jugadorListado));
    		System.out.println("Nacionalidad: " + jugadorListado.getNacionalidad());
    		System.out.println("Estatura: " + jugadorListado.getEstatura());
    		System.out.println("Peso: " + jugadorListado.getPeso());
    		System.out.println("Posicion: " + jugadorListado.getPosicion());
    		System.out.println();
    		
    		} else {
    		    System.out.println("Índice fuera de los límites del ArrayList.");
    		}
    		
    		}
	}

	private static void altaJugador(ArrayList<jugador> jugadores, Scanner scanner) {
		jugador nuevoJugador = new jugador();
		
		System.out.println("Ingrese nombre: ");
		nuevoJugador.setNombre(scanner.nextLine());
		System.out.println("Ingrese apellido: ");
    	nuevoJugador.setApellido(scanner.nextLine());
    	System.out.println("Ingrese fecha de nacimiento (AAAA/MM/DD): ");
    	nuevoJugador.setFecNac(fechaIngresada(scanner));
    	System.out.println("Ingrese nacionalidad: ");
    	nuevoJugador.setNacionalidad(scanner.nextLine());
    	System.out.println("Ingrese estatura: ");
    	nuevoJugador.setEstatura(scanner.nextDouble());
    	System.out.println("Ingrese peso: ");
    	nuevoJugador.setPeso(scanner.nextDouble());
    	System.out.println("Seleccione posicion: ");
    	System.out.println("1- Delantero");
    	System.out.println("2- Medio");
    	System.out.println("3- Defensa");
    	System.out.println("4- Arquero");
    	
    	int opcion = scanner.nextInt();
    	switch(opcion) {
    	case 1:
    		nuevoJugador.setPosicion(posicion.Delantero);
    		break;
    	case 2:
    		nuevoJugador.setPosicion(posicion.Medio);
    		break;
    	case 3:
    		nuevoJugador.setPosicion(posicion.Defensa);
    		break;
    	case 4:
    		nuevoJugador.setPosicion(posicion.Arquero);
    		break;
    	}
    	
    	jugadores.add(nuevoJugador);

	}
	
	private static LocalDate fechaIngresada(Scanner scanner) {
		LocalDate fecha=null;

		String fcn = scanner.nextLine();
		fecha = LocalDate.parse(fcn);
	
		return fecha;
	}
	
	private static int calcularEdad(jugador jugador) {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(jugador.getFecNac(), hoy);
		return periodo.getYears();
	}
	
	
}
