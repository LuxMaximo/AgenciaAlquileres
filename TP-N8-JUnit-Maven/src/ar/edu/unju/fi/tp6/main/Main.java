package ar.edu.unju.fi.tp6.main;

import java.time.LocalDate;
import ar.edu.unju.fi.tp6.manager.LibroAlquiler;
import ar.edu.unju.fi.tp6.model.Camion;
import ar.edu.unju.fi.tp6.model.Tractor;

public class Main {
	public static void main(String[] args) {
		LibroAlquiler unLibro = new LibroAlquiler(null);
		unLibro.registrarAlquiler(new Tractor("aa123","323232", "Franco",true,LocalDate.parse("2022-10-01"), null,0));
		unLibro.registrarAlquiler(new Tractor("xc148","873232", "Emmanuel",true,LocalDate.parse("2022-10-11"), null,0));
		unLibro.registrarAlquiler(new Camion("dd545", "45446", "Pedro",true, 1500, null, 0));
		unLibro.registrarAlquiler(new Camion("kjk545", "65987", "Jose",true, 3000, null, 0));
		unLibro.registrarAlquiler(new Tractor("DD13","4544232", "Mario",true,LocalDate.parse("2022-10-20"), null,0));
		unLibro.registrarAlquiler(new Camion("RTX1000", "235487", "Elias", true, 800, null, 0));
		unLibro.facturarCamion("dd545",2000);
		unLibro.facturarTractor("aa123", LocalDate.parse("2022-10-30"));
		unLibro.mostrarArray("Tractor");
		unLibro.mostrarArray("Camion");
		unLibro.recaudacion();
		unLibro.buscarDisponible("Tractor", false);
		unLibro.alquilerMayorDos();
	}
}