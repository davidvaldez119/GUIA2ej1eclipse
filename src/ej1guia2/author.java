package ej1guia2;


public class author {
	private String nombre;
	private String Apellido;
	private String email;
	private char genero;
	
	public author(String nombre, String apellido, String email, char genero) {
	
		this.nombre = nombre;
		this.Apellido = apellido;
		this.email = email;
		this.genero = genero;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "author [nombre=" + nombre + ", Apellido=" + Apellido + ", email=" + email + ", genero=" + genero + "]";
	}

}
