package arbolesBinarios;

import java.io.*;

class File {
	public static ArbolBinario leerArchivo() {
		try {
			// Abrimos el archivo
			FileInputStream fstream = new FileInputStream("C:/Users/David/Dropbox/1. Administracion de sistemas/WorkSpace/Estructuras/Corte2/arbolesBinarios/Entrada.csv");
			// Creamos el objeto de entrada
			DataInputStream entrada = new DataInputStream(fstream);
			// Creamos el Buffer de Lectura
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			String strLinea;
			ArbolBinario arbol = new ArbolBinario();
			// Leer el archivo linea por linea
			while ((strLinea = buffer.readLine()) != null) {
				String[] datos = strLinea.split(";");
				String nombre = datos[0];
				long cedula = (long)Integer.parseInt(datos[1]);
				Nodo n = new Nodo(new Persona(cedula, nombre));
				arbol.insertarNodo(n);				
			}
			// Cerramos el archivo
			entrada.close();
			return arbol;
		} catch (Exception e) { // Catch de excepciones
			System.err.println("Ocurrio un error: " + e.getMessage());
			return null;
		}
	}
}