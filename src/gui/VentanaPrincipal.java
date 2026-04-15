package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controller.Coordinador;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private Coordinador miCoordinador;
	private JLabel lblTitulo;
	private JButton btnRegistrar, btnConsultar, btnAcercaDe;

	public VentanaPrincipal() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 350);
		setTitle("Sistema de Gestión IMC");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		lblTitulo = new JLabel("IMC", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 40));
		lblTitulo.setBounds(50, 30, 300, 50);
		add(lblTitulo);

		btnRegistrar = new JButton("Registrar Persona");
		btnRegistrar.setBounds(100, 110, 200, 40);
		btnRegistrar.addActionListener(this);
		add(btnRegistrar);

		btnConsultar = new JButton("Consultar Resultados");
		btnConsultar.setBounds(100, 170, 200, 40);
		btnConsultar.addActionListener(this);
		add(btnConsultar);

		btnAcercaDe = new JButton("Acerca De");
		btnAcercaDe.setBounds(100, 230, 200, 40);
		btnAcercaDe.addActionListener(this);
		add(btnAcercaDe);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			miCoordinador.mostrarVentanaRegistro();
		}
		
		if (e.getSource() == btnConsultar) {
			if (miCoordinador.getPersona() != null) {
				miCoordinador.mostrarVentanaConsulta();
			} else {
				JOptionPane.showMessageDialog(null, "No hay datos registrados.", "Advertencia", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		if (e.getSource() == btnAcercaDe) {
			miCoordinador.mostrarAcercaDe();
		}
	}
}