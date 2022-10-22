package ar.edu.unju.fi.tp6.model;

public class Responsable {
	private String dni;
	private String nombere;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombere() {
		return nombere;
	}
	public void setNombere(String nombere) {
		this.nombere = nombere;
	}
	
	public Responsable(String dni, String nombere) {
		super();
		this.dni = dni;
		this.nombere = nombere;
	}
	
	

}
