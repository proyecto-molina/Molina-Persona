/**
 *Constructor
*/
public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
/**
*Getter
 *@return devuelve el valor
*/
	public String getNombre() {
		return nombre;
	}
/**
 *Setter
 *@param nombre parametro de entrada
*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 *Getter
 *@return devuelve el valor
*/
	public String getApellidos() {
		return apellidos;
	}
/**
 *Setter
 *@param apellidos parametro de entrada
*/
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
/**
 *Getter
 *@return devuelve el valor
*/
	public int getEdad() {
		return edad;
	}
/**
 *Setter
 *@param edad parametro de entrada
*/
	public void setEdad(int edad) {
		this.edad = edad;
	}
/**
 *Constructor
 *@param nombre parametro de entrada
 *@param apellidos parametro de entrada
 *@param edad parametro de entrada
*/
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	
}
