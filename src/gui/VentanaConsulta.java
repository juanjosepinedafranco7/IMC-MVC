package gui;

import java.awt.Font;
import javax.swing.*;
import controller.Coordinador;
import modelo.dto.PersonaDTO;

public class VentanaConsulta extends JFrame {

	private Coordinador miCoordinador;
	private JLabel lblNombre, lblEdad, lblPeso, lblEstatura, lblIMC, lblEstado;

	public VentanaConsulta() {
		setSize(400, 400);
		setTitle("Consulta de IMC");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		JLabel lblT = new JLabel("RESULTADOS", SwingConstants.CENTER);
		lblT.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblT.setBounds(50, 20, 300, 30);
		add(lblT);

		lblNombre = new JLabel("Nombre: "); lblNombre.setBounds(40, 70, 300, 25); add(lblNombre);
		lblEdad = new JLabel("Edad: "); lblEdad.setBounds(40, 100, 300, 25); add(lblEdad);
		lblPeso = new JLabel("Peso: "); lblPeso.setBounds(40, 130, 300, 25); add(lblPeso);
		lblEstatura = new JLabel("Estatura: "); lblEstatura.setBounds(40, 160, 300, 25); add(lblEstatura);
		
		lblIMC = new JLabel("IMC: "); 
		lblIMC.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblIMC.setBounds(40, 200, 300, 25); add(lblIMC);

		lblEstado = new JLabel("Estado: "); 
		lblEstado.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblEstado.setBounds(40, 230, 300, 25); add(lblEstado);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(140, 300, 100, 30);
		btnCerrar.addActionListener(e -> setVisible(false));
		add(btnCerrar);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public void actualizarDatos() {
		PersonaDTO p = miCoordinador.getPersona();
		if (p != null) {
			lblNombre.setText("Nombre: " + p.getNombre());
			lblEdad.setText("Edad: " + p.getEdad());
			lblPeso.setText("Peso: " + p.getPeso() + " kg");
			lblEstatura.setText("Estatura: " + p.getEstatura() + " m");
			lblIMC.setText("IMC: " + String.format("%.2f", p.getImc()));
			lblEstado.setText("Estado: " + p.getClasificacion());
		}
	}
}