package arbolesBinarios;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ArbolBinario arbol = new ArbolBinario();
		arbol = File.leerArchivo();
		System.out.print("Buscar: ");
		Scanner key = new Scanner(System.in);
		long x = key.nextLong();
		Nodo r = new Nodo();
		r = ArbolBinario.buscarNodo(x);
		if (r != null) {
			System.out.println("Resultado para '" + x + "': " + r.p.nombre);
		} else {
			System.out.println("No existe en arbol");
		}
	}

	public static void llenarArbol() {
		Scanner key = new Scanner(System.in);
		ArbolBinario arbol = new ArbolBinario();
		System.out.print("Ingrese cantidad de nodos: ");
		int x = key.nextInt();
		for (int i = 0; i < x; i++) {
			Nodo n = new Nodo();
			n = n.crearNodo();
			arbol.insertarNodo(n);
		}
		System.out.println(arbol);
	}

}