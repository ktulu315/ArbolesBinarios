package arbolesBinarios;
public class Persona {
	long cedula;
	String nombre;

	public Persona(long ced, String name) {
		this.cedula = ced;
		this.nombre = name;
	}

	public Persona() {
		this.cedula = 0;
		this.nombre = "NuevoNombre";
	}

	public String toString(){
		return "["+this.cedula+", "+this.nombre+"]";
	}
}