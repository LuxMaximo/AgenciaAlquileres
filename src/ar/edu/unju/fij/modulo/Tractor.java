package ar.edu.unju.fij.modulo;

public class Tractor {
	private Integer inicioDia;
	private Integer finDia;
	private Double precioXdia;
	
	
	
	public Tractor(Integer inicioDia, Integer finDia, Double precioXdia) {
		super();
		this.inicioDia = inicioDia;
		this.finDia = finDia;
		this.precioXdia = precioXdia;
	}


	public Double calcularPrecioDia() {
		Integer resultado = inicioDia - finDia;
		return resultado * precioXdia;
	}

	public Integer getInicioDia() {
		return inicioDia;
	}



	public void setInicioDia(Integer inicioDia) {
		this.inicioDia = inicioDia;
	}



	public Integer getFinDia() {
		return finDia;
	}



	public void setFinDina(Integer finDia) {
		this.finDia = finDia;
	}



	public Double getPrecioXdia() {
		return precioXdia;
	}



	public void setPrecioXdia(Double precioXdia) {
		this.precioXdia = precioXdia;
	}
	
	

	
}
