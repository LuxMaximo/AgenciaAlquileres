package ar.edu.unju.fij.modulo;

import java.util.ArrayList;
import java.util.List;

public class Alquiler {
	private boolean isAlquiled;
	private List<Alquiler> list = new ArrayList<>();
	private Vehiculo vehiculo;
	private Cliente cliente;
	private List registro = new ArrayList();
	private Double montoTotal;
	
	public Alquiler(Vehiculo vehiculo, Cliente cliente) {
		super();
		this.isAlquiled = true;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
	}
	
	public void agregarVehiculoAlquilado(Alquiler al) {
		list.add(al);
	}
	
	public Double buscarXmatricula(String matricula) {
		Double cami =0.d;
		Double tra = 0.d;
		Double resultado=0.d;
		for (Alquiler alq : list) {
			if (alq.getVehiculo().getPlaca() == matricula) {
				alq.setAlquiled(false);
				 cami = alq.getVehiculo().getCamion().calcularPrecioKm();
				 tra = alq.getVehiculo().getTractor().calcularPrecioDia();
				 resultado = cami + tra;
				 registro.add(alq);
				 montoTotal = montoTotal + resultado;
				 list.remove(alq);
			}	
		}
		return resultado;
	}

		
	public void mostrarVehiculoNoDevuletos(Integer tipoVehiculo) {
		for (Alquiler alquiler : list) {
			if (tipoVehiculo == alquiler.getVehiculo().getTipoVehiculo() || alquiler.isAlquiled) {
				System.out.println(alquiler);
			}
		}
	}
	
	
	
	public boolean isAlquiled() {
		return isAlquiled;
	}

	public void setAlquiled(boolean isAlquiled) {
		this.isAlquiled = isAlquiled;
	}

	public List<Alquiler> getList() {
		return list;
	}

	public void setList(List<Alquiler> list) {
		this.list = list;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
}
