package ar.edu.unju.fi.tp6.model;

public class RegistroAlquiler {
	protected String placa;
	protected String dni;
	protected String nombere;
	protected boolean estado;
	//protected Responsable responsable;
	
	
	public RegistroAlquiler(String placa, String dni, String nombere, boolean estado) {
		super();
		this.placa = placa;
		this.dni = dni;
		this.nombere = nombere;
		this.estado = estado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	//public abstract double precioAlquiler();
	
	@Override
	public String toString() {
		return " Placa: " + placa + ", DNI: " + dni + ", Nombere: " + nombere + ", Alquilado?(" + estado+")\n";
	}
}
