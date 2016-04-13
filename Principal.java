package arbolesBinarios;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ArbolBinario arbol = new ArbolBinario();
		Scanner key = new Scanner(System.in);
		while (true) {
			char option = menuPrincipal();
			switch (option) {
			case '1':
				arbol = File.leerArchivo();
				System.out.println("Arbol cargado....");
				break;
			case '2':
				arbol.raiz = null;
				System.out.print("Ingrese cantidad de nodos: ");
				int x = key.nextInt();
				for (int i = 0; i < x; i++) {
					Nodo n = new Nodo();
					n = n.crearNodo();
					arbol.insertarNodo(n);
				}
				System.out.println("Arbol creado....");
				break;
			case '3':
				if (arbol.raiz == null) {
					System.out.println("Arbol vacío...");
				} else {
					System.out.println(arbol);
				}
				break;
			case '4':
				if (arbol.raiz == null) {
					System.out.println("Arbol vacío...");
				} else {
					arbol.imprimirPreOrden(arbol.raiz);
				}
				break;
			case '5':
				if (arbol.raiz == null) {
					System.out.println("Arbol vacío...");
				} else {
					arbol.imprimirInOrden(arbol.raiz);
				}
				break;
			case '6':
				if (arbol.raiz == null) {
					System.out.println("Arbol vacío...");
				} else {
					arbol.imprimirPostOrden(arbol.raiz);
				}
				break;
			case '7':
				if (arbol.raiz == null) {
					System.out.println("Arbol vacío...");
				} else {
					System.out.print("Ingrese cedula: ");
					long num = key.nextLong();
					Nodo r = new Nodo();
					r = ArbolBinario.buscarNodo(num);
					if (r != null) {
						System.out.println("Resultado para '" + num + "': " + r.p.nombre);
					} else {
						System.out.println("No existe en arbol");
					}
				}
				break;
			default:
				key.close();
				System.out.println("\t\t\t***FIN PROGRAMA***");
				return;
			}
		}
	}

	public static char menuPrincipal() {
		System.out.println("\n\t\t\t****MENU PRINCIPAL****");
		System.out.print("" + "1. Crear arbol a partir de archivo\n" 
				+ "2. Crear arbol de forma manual\n"
				+ "3. Imprimir desde raiz (usa toString)\n" 
				+ "4. Imprimir de forma PreOrden\n"
				+ "5. Imprimir de forma InOrden\n"
				+ "6. Imprimir de forma PostOrden\n"
				+ "7. Buscar por cedula\n"
				+ "8. o cualquier otra tecla para salir\n" 
				+ "OPCION: ");
		Scanner key = new Scanner(System.in);
		char option = key.nextLine().charAt(0);
		System.out.println();
		
		return option;
	}
}