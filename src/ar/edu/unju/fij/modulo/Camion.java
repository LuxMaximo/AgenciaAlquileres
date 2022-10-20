package ar.edu.unju.fij.modulo;

public class Camion {
	private Integer inicioKm;
	private Integer finKm;
	private Double precioXkm;
	
	
	
	public Camion(Integer inicioKm, Integer finKm, Double precioXkm) {
		super();
		this.inicioKm = inicioKm;
		this.finKm = finKm;
		this.precioXkm = precioXkm;
	}

	
	public Double calcularPrecioKm() {
		Integer resultado = inicioKm - finKm;
		return resultado*precioXkm;
	}


	
	
	
	
	
	public Integer getInicioKm() {
		return inicioKm;
	}



	public void setInicioKm(Integer inicioKm) {
		this.inicioKm = inicioKm;
	}



	public Integer getFinKm() {
		return finKm;
	}



	public void setFinKm(Integer finKm) {
		this.finKm = finKm;
	}



	public Double getPrecioXkm() {
		return precioXkm;
	}



	public void setPrecioXkm(Double precioXkm) {
		this.precioXkm = precioXkm;
	}
	
	
}
