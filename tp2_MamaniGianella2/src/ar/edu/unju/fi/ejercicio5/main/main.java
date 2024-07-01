package ar.edu.unju.fi.ejercicio5.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.producto;
import ar.edu.unju.fi.ejercicio1.model.constantes.categoria;
import ar.edu.unju.fi.ejercicio1.model.constantes.paises;
import ar.edu.unju.fi.ejercicio5.model.pagoEfectivo;
import ar.edu.unju.fi.ejercicio5.model.pagoTarjeta;

public class main {

	private static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<producto> productos = precargaProductos();
        
        
        int opcion = scanner.nextInt();
        do {
        	menu();
        	
        	switch(opcion) {
        	case 1:
        		mostrarProductos(productos);
        		break;
        	case 2:
        		realizarCompra();
        		break;
        	case 3:
        		System.out.println("Fin del Programa");
        		break;
        	}
        	
        	
        }while(opcion != 3);
        
	}

	private static void realizarCompra() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número del producto que desea comprar: ");
        int numeroProducto = scanner.nextInt();
        ArrayList<producto> listaProductos = precargaProductos();
        if (numeroProducto >= 1 && numeroProducto <= listaProductos.size()) {
            
			producto productoSeleccionado = listaProductos.get(numeroProducto - 1);
            if (productoSeleccionado.isEstado()) {
            	System.out.println("Opciones de Pago: ");
            	System.out.println("1- Pago en efectivo");
            	System.out.println("2- Pago con tarjeta");
            	int op = scanner.nextInt();
            	if (op == 1) {
                    pagoEfectivo pagoEfectivo = new pagoEfectivo();
                    pagoEfectivo.realizarPago(numeroProducto);
                    pagoEfectivo.imprimirRecibo();
                } else {
                	pagoTarjeta pagoTarjeta = new pagoTarjeta();
                    System.out.print("Ingrese el numero de tarjeta: ");
                    pagoTarjeta.setNumTarjeta(scanner.nextLine());
                    pagoTarjeta.realizarPago(numeroProducto);
                    pagoTarjeta.imprimirRecibo();
                }
                System.out.println("Compra realizada");
            } else {
                System.out.println("El producto no está disponible en stock.");
            }
        } else {
            System.out.println("Número de producto inválido.");
        }
		
	}

	private static void mostrarProductos(ArrayList<producto> productos) {
		System.out.println("Productos: ");
    	for (int i =0; i < productos.size() ; i ++) {

    		if (i >= 0 && i < productos.size()) {

    		producto productoListado = productos.get(i);
			System.out.println("Nombre: " + productoListado.getDescripcion());
    		System.out.println("Codigo: " + productoListado.getCodigo());
    		System.out.println("Precio Unitario: " + productoListado.getPreunitario());
    		System.out.println("Categoria: " + productoListado.getCategoria());
    		System.out.println("Pais de origen: " + productoListado.getOrigen());
    		System.out.println();

    		} else {
    		    System.out.println("Índice fuera de los límites del ArrayList.");
    		}

    		}
		
	}

	private static ArrayList<producto> precargaProductos() {
		
		ArrayList<producto> productos = new ArrayList<>();
        productos.add(new producto("1", "Celular ", 20000, paises.Argentina , categoria.Telefonia, true));
        productos.add(new producto("2", "Computadora", 50000, paises.Brasil , categoria.Informatica, false));
        productos.add(new producto("3", "Heladera", 70000, paises.Uruguay , categoria.Electro_hogar, true));
        productos.add(new producto("4", "Impresora", 30000, paises.China, categoria.Informatica, true));
        productos.add(new producto("5", "Microhondas", 40000, paises.Brasil , categoria.Electro_hogar, true));
        productos.add(new producto("6", "Televisor", 60000, paises.Argentina , categoria.Electro_hogar, false));
        productos.add(new producto("7", "Licuadora", 10000, paises.China , categoria.Electro_hogar, false));
        productos.add(new producto("8", "Telefono", 10000, paises.Uruguay , categoria.Telefonia, true));
        productos.add(new producto("9", "Tablet", 20000, paises.China , categoria.Informatica, false));
        productos.add(new producto("10", "Taladro", 10000, paises.Brasil, categoria.Herramientas, true));
        productos.add(new producto("11", "Amoladora", 20000, paises.Argentina, categoria.Herramientas, true));
        productos.add(new producto("12", "Batidora", 20000, paises.Argentina , categoria.Electro_hogar, true));
        productos.add(new producto("13", "Ventilador", 50000, paises.Uruguay , categoria.Electro_hogar, false));
        productos.add(new producto("14", "Secadora", 30000, paises.China, categoria.Electro_hogar, false));
        productos.add(new producto("15", "Parlante",50000, paises.Brasil , categoria.Electro_hogar, true));
        return productos;
	}
	
	private static void menu() {
		System.out.println("Menú de opciones:");
        System.out.println("1 - Mostrar productos");
        System.out.println("2 - Realizar compra");
        System.out.println("3 - Salir");
	}
	
}
