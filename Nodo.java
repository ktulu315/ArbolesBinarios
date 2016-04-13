package arbolesBinarios;

import java.util.Scanner;

public class Nodo {
	Persona p;
	Nodo izq;
	Nodo der;

	public Nodo(Persona p) {
		this.p = p;
		this.izq = null;
		this.der = null;
	}

	public Nodo() {
		this.p = null;
		this.izq = null;
		this.der = null;
	}

	public Nodo crearNodo() {
		Scanner key = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = key.next();
		System.out.print("Cedula: ");
		long cedula = key.nextLong();
		Nodo n = new Nodo(new Persona(cedula, nombre));
		return n;
	}

	public String toString() {
		return p + "{" + izq + ", " + der + "}";
	}

}
