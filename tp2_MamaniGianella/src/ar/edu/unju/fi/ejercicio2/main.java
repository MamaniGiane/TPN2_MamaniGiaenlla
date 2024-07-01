package ar.edu.unju.fi.ejercicio2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.contantes.meses;
import ar.edu.unju.fi.ejercicio2.model.efemeride;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<efemeride> efemerides = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Menú");
            System.out.println("1 - Crear efemeride");
            System.out.println("2 - Mostrar efemerides");
            System.out.println("3 - Eliminar efemeride");
            System.out.println("4 - Modificar eemeride");
            System.out.println("5 - Salir");
            System.out.print("Elija una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                    	crearEfemeride(efemerides, scanner);
                        break;
                    case 2:
                        mostrarEfemeride(efemerides);
                        break;
                    case 3:
                        eliminarEfemeride(efemerides, scanner);
                        break;
                    case 4:
                        modificarEfemeride(efemerides, scanner);
                        break;
                    case 5:
                        System.out.println("fin del programa");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                scanner.nextLine();
            }
        } while (opcion != 5);
        
	}
        
        
		private static void crearEfemeride(ArrayList<efemeride> efemerides, Scanner scanner) {
        	
        	efemeride nuevaEfemeride = new efemeride();
        	
        	System.out.println("Ingrese codigo: ");
    		nuevaEfemeride.setCodigo(scanner.nextLine());
    		System.out.println("Ingrese detalle: ");
        	nuevaEfemeride.setDetalle(scanner.nextLine());
        	System.out.println("Ingrese mes en numeros (1-12): ");
        	int m =scanner.nextInt();
        	switch(m) {
        		case 1: 
        			nuevaEfemeride.setMes(meses.Enero);
        		break;
        		case 2: 
        			nuevaEfemeride.setMes(meses.Febrero);
        		break;
        		case 3: 
        			nuevaEfemeride.setMes(meses.Marzo);
        		break;
        		case 4: 
        			nuevaEfemeride.setMes(meses.Abril);
        		break;
        		case 5: 
        			nuevaEfemeride.setMes(meses.Mayo);
        		break;
        		case 6: 
        			nuevaEfemeride.setMes(meses.Junio);
        		break;
        		case 7: 
        			nuevaEfemeride.setMes(meses.Julio);
        		break;
        		case 8: 
        			nuevaEfemeride.setMes(meses.Agosto);
        		break;
        		case 9: 
        			nuevaEfemeride.setMes(meses.Septiembre);
        		break;
        		case 10: 
        			nuevaEfemeride.setMes(meses.Octubre);
        		break;
        		case 11: 
        			nuevaEfemeride.setMes(meses.Noviembre);
        		break;
        		case 12: 
        			nuevaEfemeride.setMes(meses.Diciembre);
        		break;
        	}
        	
        	System.out.println("Ingrese el dia: ");
        	nuevaEfemeride.setDia(scanner.nextInt());
        	
        	
        	efemerides.add(nuevaEfemeride);
        }    
        
        
		private static void modificarEfemeride(ArrayList<efemeride> efemerides, Scanner scanner) {
		
			System.out.println("Ingrese codigo de la efemeride a modificar: ");
	    	String n = scanner.nextLine();
	    	scanner.nextLine();
	    	
	    	for (int i =0; i < efemerides.size() ; i ++) {
	    		efemeride efemerideModificada = efemerides.get(i);
	            
	    		if(efemerideModificada.getCodigo().equals(n))
	                System.out.println("Ingrese nuevo detalle: ");
	    			efemerideModificada.setDetalle(scanner.nextLine());
	            	System.out.println("Ingrese nuevo mes (1-12): ");
	            	int m =scanner.nextInt();
	            	switch(m) {
	            		case 1: 
	            			efemerideModificada.setMes(meses.Enero);
	            		break;
	            		case 2: 
	            			efemerideModificada.setMes(meses.Febrero);
	            		break;
	            		case 3: 
	            			efemerideModificada.setMes(meses.Marzo);
	            		break;
	            		case 4: 
	            			efemerideModificada.setMes(meses.Abril);
	            		break;
	            		case 5: 
	            			efemerideModificada.setMes(meses.Mayo);
	            		break;
	            		case 6: 
	            			efemerideModificada.setMes(meses.Junio);
	            		break;
	            		case 7: 
	            			efemerideModificada.setMes(meses.Julio);
	            		break;
	            		case 8: 
	            			efemerideModificada.setMes(meses.Agosto);
	            		break;
	            		case 9: 
	            			efemerideModificada.setMes(meses.Septiembre);
	            		break;
	            		case 10: 
	            			efemerideModificada.setMes(meses.Octubre);
	            		break;
	            		case 11: 
	            			efemerideModificada.setMes(meses.Noviembre);
	            		break;
	            		case 12: 
	            			efemerideModificada.setMes(meses.Diciembre);
	            		break;
	            	}
	            	
	            	System.out.println("Ingrese nuevo dia: ");
	            	efemerideModificada.setDia(scanner.nextInt());
	            	System.out.println("Efemeride modificada");
	            	return;
	            }
	    	
	            
	}

		private static void mostrarEfemeride(ArrayList<efemeride> efemerides) {
		
			System.out.println("Efemerides: ");
	    	for (int i =0; i < efemerides.size() ; i ++) {
	    		
	    		if (i >= 0 && i < efemerides.size()) {
	    		
	    		efemeride efemerideListada = efemerides.get(i);
				System.out.println("Codigo: " + efemerideListada.getCodigo());
	    		System.out.println("Dia: " + efemerideListada.getDia());
	    		System.out.println("Mes: " + efemerideListada.getMes());
	    		System.out.println("Detalle: " + efemerideListada.getDetalle());
	    		System.out.println();
	    		
	    		} else {
	    		    System.out.println("Índice fuera de los límites del ArrayList.");
	    		}
	    		
	    		}
		
	}
		
		private static void eliminarEfemeride(ArrayList<efemeride> efemerides, Scanner scanner) {
		
			System.out.println("Ingrese el codigo de la efemeride a eliminar: ");
			String codigo = scanner.nextLine();
			
			for(int i =0; i < efemerides.size() ; i ++) {
				
				efemeride efemerideEliminada = efemerides.get(i);
				if(efemerideEliminada.getCodigo().equals(codigo)) {
					efemerides.remove(efemerideEliminada);
					System.out.println("Se elimino la efemeride");
				}
			}

			
}
}

