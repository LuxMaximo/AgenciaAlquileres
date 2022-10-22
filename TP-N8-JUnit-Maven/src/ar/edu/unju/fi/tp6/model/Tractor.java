package ar.edu.unju.fi.tp6.model;

import java.time.LocalDate;
import java.time.Period;

public class Tractor extends RegistroAlquiler{

	private static double precioDia = 2000;
	private LocalDate fechaInicio;
	private LocalDate fechaFinal;
	private double precioT;
	private int dia;
	
	public Tractor(String placa, String dni, String nombere, boolean estado, LocalDate fechaInicio,
			LocalDate fechaFinal, double precioT) {
		super(placa, dni, nombere, estado);
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.precioT = precioT;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	public double getPrecioT() {
		return precioT;
	}

	public void setPrecioT(double precioT) {
		this.precioT = precioT;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	public int diasAlq() {
		Period periodo = Period.between(fechaInicio, LocalDate.now());
		dia = periodo.getDays();
		return dia;
	}
	
	public double precioAlquilerTractor(LocalDate fechaFinal) {
		Period periodo = Period.between(fechaInicio, fechaFinal);
		int dias = periodo.getDays();
		precioT = dias * precioDia;
		return precioT;
	}

	@Override
	public String toString() {
		return "Tractor: " + super.toString() + "Fecha de Alquiler: " + fechaInicio + ", Fecha de Devolucion: " + fechaFinal 
				+ ", Precio a pagar: $" + this.precioT;
	}
}