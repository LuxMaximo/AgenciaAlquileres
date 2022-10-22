package ar.edu.unju.fi.tp6.manager;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unju.fi.tp6.model.Camion;
import ar.edu.unju.fi.tp6.model.RegistroAlquiler;
import ar.edu.unju.fi.tp6.model.Tractor;

public class LibroAlquiler {
	private ArrayList<RegistroAlquiler> registros;
	
	public LibroAlquiler(ArrayList<RegistroAlquiler> registros) {
		super();
		this.registros = registros;
		this.registros = new ArrayList<>();
	}
	
	//up casting
	public void registrarAlquiler(RegistroAlquiler r) {
		this.registros.add(r);
	}
	
	public void mostrarArray(String tipo) {
		System.out.println("\n\n**************************Mostrando registros de "+tipo+"******************************");
		if(tipo.equals("Camion")) {
			for (RegistroAlquiler registroAlquiler : registros) {
				if(registroAlquiler instanceof Camion) {
					if(registroAlquiler.isEstado()==true) {
						System.out.println(registroAlquiler);
					}
				}
			}
		}else {
			if(tipo.equals("Tractor")) {
				for (RegistroAlquiler registroAlquiler : registros) {
					if(registroAlquiler instanceof Tractor) {
						if(registroAlquiler.isEstado()==true) {
							System.out.println(registroAlquiler);
						}	
					}
				}
			}else {
				System.out.println("Tipo de Vehiculo Incorrecto");
			}
		}
	}
	
	public RegistroAlquiler devolver(RegistroAlquiler encontrado) {
		encontrado.setEstado(false);
		return encontrado;
	}
	
	public void facturarCamion(String placa , Integer kmf) {
		System.out.println("\n\n**************************(Factura de Camion)******************************\n");
		RegistroAlquiler encontrado = null;
		for (RegistroAlquiler registroAlquiler : registros) {
			if(registroAlquiler.getPlaca().equals(placa) && (registroAlquiler.isEstado() == true)) {
				encontrado = registroAlquiler;
				devolver(encontrado);
				if(registroAlquiler instanceof Camion) {
					((Camion) registroAlquiler).setKilometrajeFinal(kmf);
					((Camion) registroAlquiler).precioAlquilerCamion(kmf);
					System.out.println("Devolviendo un "+encontrado);
				}	
			}
		}
		if(encontrado==null) {
			System.out.println("No se pudo encontrar el Registro!!");
		}
	}
	
	public void facturarTractor(String placa , LocalDate fchf) {
		System.out.println("\n\n**************************(Factura de Tractor)******************************\n");
		RegistroAlquiler encontrado = null;
		for (RegistroAlquiler registroAlquiler : registros) {
			if(registroAlquiler.getPlaca().equals(placa) && (registroAlquiler.isEstado() == true)) {
				encontrado = registroAlquiler;
				devolver(encontrado);
				if(registroAlquiler instanceof Tractor) {
					((Tractor) registroAlquiler).setFechaFinal(fchf);
					((Tractor) registroAlquiler).precioAlquilerTractor(fchf);
					System.out.println("Devolviendo un "+encontrado);
				}
			}
		}
		if(encontrado==null) {
			System.out.println("No se pudo encontrar el Registro!!");
		}
	}
	
	public void recaudacion() {
		System.out.println("\n\n***************************(Recaudacion del Dia)*****************************");
		double acu = 0;
		for (RegistroAlquiler registroAlquiler : registros) {
			if(registroAlquiler instanceof Camion) {
				acu += ((Camion) registroAlquiler).getPrecioC();
			}
		}
		for (RegistroAlquiler registroAlquiler : registros) {
			if(registroAlquiler instanceof Tractor) {
				acu += ((Tractor) registroAlquiler).getPrecioT();
			}
		}
		System.out.println("Total: $"+acu);
	}
	
	//----------------------------------------------------- TP8 new implements
	
	public void buscarDisponible(String tipo, boolean libre) {
		System.out.println("\n\n***************************(Buscar Vehiculo Disponible)*****************************\n");
		boolean search = false;
		for (RegistroAlquiler registroAlquiler : registros) {
			if(tipo.equals("Camion")) {
				if(registroAlquiler.isEstado()==false) {
					search = true;
					System.out.println("Tipo "+registroAlquiler.toString());
				}
			}else {
				if(tipo.equals("Tractor")) {
					if(registroAlquiler.isEstado()==false) {
						search = true;
						System.out.println("Tipo "+registroAlquiler.toString());
					}	
				}
			}
		}
		if(search == false) {
			System.out.println("No Hay Vehiculos Disponibles!!");
		}
	}
	
	public void alquilerMayorDos() {
		System.out.println("\n\n********************(Alquiler de Tractor que superan los 2 dias)**********************\n");
		for (RegistroAlquiler registroAlquiler : registros) {
			if(registroAlquiler instanceof Tractor){
				if(((Tractor) registroAlquiler).diasAlq() >= 2 ) {
					System.out.println("---> "+registroAlquiler+"\n");
				}
			}
		}
	}
	
	
}