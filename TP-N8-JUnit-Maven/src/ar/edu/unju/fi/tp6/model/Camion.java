package ar.edu.unju.fi.tp6.model;

import java.time.LocalDate;

public class Camion extends RegistroAlquiler {

	private static double precioKilometro = 100;
	private Integer kilometrajeInicial;
	private Integer kilometrajeFinal;
	private double precioC;

	
	public Camion(String placa, String dni, String nombere, boolean estado, Integer kilometrajeInicial,
			Integer kilometrajeFinal, double precioC) {
		super(placa, dni, nombere, estado);
		this.kilometrajeInicial = kilometrajeInicial;
		this.kilometrajeFinal = kilometrajeFinal;
		this.precioC = precioC;
		
	}
	
	public Integer getKilometrajeFinal() {
		return kilometrajeFinal;
	}

	public Integer getKilometrajeInicial() {
	return kilometrajeInicial;
	}

	public void setKilometrajeInicial(Integer kilometrajeInicial) {
	this.kilometrajeInicial = kilometrajeInicial;
}

	public void setKilometrajeFinal(Integer kilometrajeFinal) {
		this.kilometrajeFinal = kilometrajeFinal;
	}
	
	public double getPrecioC() {
		return precioC;
	}

	public void setPrecioC(double precioC) {
		this.precioC = precioC;
	}



	public double precioAlquilerCamion(double kilometrajeFinal) {
		precioC = precioKilometro * (kilometrajeFinal - kilometrajeInicial);
		return precioC;
	}

	@Override
	public String toString() {
		return "Camion: " + super.toString() + "KM-Inicial: " + kilometrajeInicial 
				+ " kms, KM-Final: " + kilometrajeFinal + " kms, Precio a pagar: $" + this.precioC;
	}
}