package ar.edu.unju.fi.ejercicio1;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.producto;
import ar.edu.unju.fi.ejercicio1.model.constantes.categoria;
import ar.edu.unju.fi.ejercicio1.model.constantes.paises;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Menú");
            System.out.println("1 - Crear Producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar producto");
            System.out.println("4 - Salir");
            System.out.print("Elija una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        crearProducto(productos, scanner);
                        break;
                    case 2:
                        mostrarProductos(productos);
                        break;
                    case 3:
                        modificarProducto(productos, scanner);
                        break;
                    case 4:
                        System.out.println("fin del programa");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                scanner.nextLine();
            }
        } while (opcion != 4);
    }

    private static void crearProducto(ArrayList<producto> productos, Scanner scanner) {
    	
    	producto nuevoProducto = new producto();
    	
    	System.out.println("Ingrese codigo de producto: ");
		nuevoProducto.setCodigo(scanner.nextLine());
    	System.out.println("Descripcion del producto: ");
    	nuevoProducto.setDescripcion(scanner.nextLine());
    	System.out.println("Ingrese precio unitario: ");
    	nuevoProducto.setPreunitario(scanner.nextInt());
    	System.out.println("--Origen de fabricacion--");
    	System.out.println("1-Argentina");
    	System.out.println("2-China");
    	System.out.println("3-Brasil");
    	System.out.println("4-Uruguay");
    	System.out.println("Elija opcion: ");

    	int opcion =scanner.nextInt();
    	switch(opcion) {
    		case 1: 
    			nuevoProducto.setOrigen(paises.Argentina);
    		break;
    		case 2: 
    			nuevoProducto.setOrigen(paises.China);
    		break;
    		case 3: 
    			nuevoProducto.setOrigen(paises.Brasil);
    		break;
    		case 4: 
    			nuevoProducto.setOrigen(paises.Uruguay);
    		break;
    	}
    	
    	System.out.println("--Categoria--");
    	System.out.println("1-Telefonia");
    	System.out.println("2-Informatica");
    	System.out.println("3-Electro hogar");
    	System.out.println("4-Herramientas");
    	System.out.println("Elija opcion: ");
    	int cat = scanner.nextInt();
    	switch(cat) {
    		case 1: 
    			nuevoProducto.setCategoria(categoria.Telefonia);
    		break;
    		case 2: 
    			nuevoProducto.setCategoria(categoria.Informatica);
    		break;
    		case 3: 
    			nuevoProducto.setCategoria(categoria.Electro_hogar);
    		break;
    		case 4: 
    			nuevoProducto.setCategoria(categoria.Herramientas);
    		break;
    	}
    	
    	productos.add(nuevoProducto);
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

    private static void modificarProducto(ArrayList<producto> productos, Scanner scanner) {
    	System.out.println("Ingrese el codigo del producto a modificar: ");
    	String n = scanner.nextLine();
    	
    	for (int i =0; i < productos.size() ; i ++) {
    		producto prodMod = productos.get(i);
            if (prodMod.getCodigo().equals(n)) {
                
                System.out.println("Ingrese nueva descripción: ");
                prodMod.setDescripcion(scanner.nextLine());
                System.out.println("Ingrese nuevo precio: ");
                prodMod.setPreunitario(scanner.nextInt());
                System.out.println("Seleccione nuevo pais de origen: ");
                System.out.println("1-Argentina");
            	System.out.println("2-China");
            	System.out.println("3-Brasil");
            	System.out.println("4-Uruguay");
            	System.out.println("Elija opcion: ");
            	int opcion =scanner.nextInt();
            	switch(opcion) {
            		case 1: 
            			prodMod.setOrigen(paises.Argentina);
            		break;
            		case 2: 
            			prodMod.setOrigen(paises.China);
            		break;
            		case 3: 
            			prodMod.setOrigen(paises.Brasil);
            		break;
            		case 4: 
            			prodMod.setOrigen(paises.Uruguay);
            		break;
            	}
                
            	System.out.println("Seleccione nueva categoria: ");
            	System.out.println("1-Telefonia");
            	System.out.println("2-Informatica");
            	System.out.println("3-Electro hogar");
            	System.out.println("4-Herramientas");
            	System.out.println("Elija opcion: ");
            	scanner.nextLine();
            	int cat = scanner.nextInt();
            	switch(cat) {
            		case 1: 
            			prodMod.setCategoria(categoria.Telefonia);
            		break;
            		case 2: 
            			prodMod.setCategoria(categoria.Informatica);
            		break;
            		case 3: 
            			prodMod.setCategoria(categoria.Electro_hogar);
            		break;
            		case 4: 
            			prodMod.setCategoria(categoria.Herramientas);
            		break;
            	}

                return;
            }
    	}
	}
}
