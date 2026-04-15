package controller;

import gui.*;
import modelo.*;

public class Relaciones {

	public void iniciar() {
		Coordinador miCoordinador = new Coordinador();
		Procesos miProcesos = new Procesos();
		Validaciones miValidaciones = new Validaciones();
		VentanaPrincipal miPrincipal = new VentanaPrincipal();
		VentanaRegistro miRegistro = new VentanaRegistro();
		VentanaConsulta miConsulta = new VentanaConsulta();
		AcercaDe miAcerca = new AcercaDe();

		miPrincipal.setCoordinador(miCoordinador);
		miRegistro.setCoordinador(miCoordinador);
		miConsulta.setCoordinador(miCoordinador);
		miAcerca.setCoordinador(miCoordinador);

		miCoordinador.setVentanaPrincipal(miPrincipal);
		miCoordinador.setVentanaRegistro(miRegistro);
		miCoordinador.setVentanaConsulta(miConsulta);
		miCoordinador.setAcercaDe(miAcerca);
		miCoordinador.setProcesos(miProcesos);
		miCoordinador.setValidaciones(miValidaciones);

		miPrincipal.setVisible(true);
	}
}