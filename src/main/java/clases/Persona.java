package clases;

public class Persona {
	
	private Integer edad;
	private String nombre;
	private String dni;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(Integer edad, String nombre, String dni) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
