package ar.edu.unju.fij.modulo;

public class Cliente {
	private String documento;
	private String nombre;
	
	
	public Cliente(String documento, String nombre) {
		super();
		this.documento = documento;
		this.nombre = nombre;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
