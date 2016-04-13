package arbolesBinarios;

import java.io.*;

class File {
	public static ArbolBinario leerArchivo() {
		try {
			// Abre archivo
			FileInputStream fstream = new FileInputStream(
					"C:/Users/David/Dropbox/1. Administracion de sistemas/WorkSpace/Estructuras/Corte2/arbolesBinarios/Entrada.csv");
			// Objeto para entrada
			DataInputStream entrada = new DataInputStream(fstream);
			// Creamos el Buffer de Lectura
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			String strLinea;
			ArbolBinario arbol = new ArbolBinario();
			/* convierte cada linea en un String[] separado por el token ";" 
			   se crea nodo con los datos y se inserta al arbol creado*/
			while ((strLinea = buffer.readLine()) != null) {
				String[] datos = strLinea.split(";");
				String nombre = datos[0];
				long cedula = (long) Integer.parseInt(datos[1]);
				Nodo n = new Nodo(new Persona(cedula, nombre));
				arbol.insertarNodo(n);
			}
			// Se cierra archivo
			entrada.close();
			return arbol;
		} catch (Exception e) { // Catch de excepciones
			System.err.println("Ocurrio un error: " + e.getMessage());
			return null;
		}
	}
}