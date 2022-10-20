package ar.edu.unju.fij.modulo;

public class Vehiculo {
	private String placa;
	private Camion camion;
	private Tractor tractor;
	private Integer tipoVehiculo;
	
	
	public Vehiculo(String placa, Camion camion) {
		super();
		this.placa = placa;
		this.camion = camion;
		this.tipoVehiculo = 1;
	}
	
	public Vehiculo(String placa, Tractor tractor) {
		super();
		this.placa = placa;
		this.tractor = tractor;
		this.tipoVehiculo = 2;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Camion getCamion() {
		return camion;
	}

	public void setCamion(Camion camion) {
		this.camion = camion;
	}

	public Tractor getTractor() {
		return tractor;
	}

	public void setTractor(Tractor tractor) {
		this.tractor = tractor;
	}

	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	
}
