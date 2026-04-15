package controller;

import modelo.Procesos;
import modelo.Validaciones;
import modelo.dto.PersonaDTO;
import gui.*;

public class Coordinador {

	private Procesos miProcesos;
	private Validaciones miValidaciones;
	private PersonaDTO miPersona;
	private VentanaRegistro miVentanaRegistro;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaConsulta miVentanaConsulta;
	private AcercaDe miAcercaDe;

	public void setProcesos(Procesos miProcesos) { this.miProcesos = miProcesos; }
	public void setValidaciones(Validaciones miValidaciones) { this.miValidaciones = miValidaciones; }
	public void setVentanaRegistro(VentanaRegistro miVentanaRegistro) { this.miVentanaRegistro = miVentanaRegistro; }
	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) { this.miVentanaPrincipal = miVentanaPrincipal; }
	public void setVentanaConsulta(VentanaConsulta miVentanaConsulta) { this.miVentanaConsulta = miVentanaConsulta; }
	public void setAcercaDe(AcercaDe miAcercaDe) { this.miAcercaDe = miAcercaDe; }

	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
	}

	public void mostrarVentanaConsulta() {
		miVentanaConsulta.actualizarDatos();
		miVentanaConsulta.setVisible(true);
	}

	public void mostrarAcercaDe() {
		miAcercaDe.setVisible(true);
	}

	public boolean validarDatos(String n, String ed, String p, String es) {
		return miValidaciones.validarDatos(n, ed, p, es);
	}

	public void registrarPersona(String nombre, String edad, String peso, String estatura) {
		this.miPersona = miProcesos.armarPersona(nombre, edad, peso, estatura);
	}

	public PersonaDTO getPersona() {
		return miPersona;
	}
}