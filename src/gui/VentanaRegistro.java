package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controller.Coordinador;

public class VentanaRegistro extends JFrame implements ActionListener {

	private Coordinador miCoordinador;
	private JTextField txtNombre, txtEdad, txtPeso, txtEstatura;
	private JButton btnGuardar, btnCancelar;

	public VentanaRegistro() {
		setSize(350, 400);
		setTitle("Registro de Datos");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);

		JLabel lblNom = new JLabel("Nombre:"); lblNom.setBounds(30, 50, 80, 25); add(lblNom);
		txtNombre = new JTextField(); txtNombre.setBounds(130, 50, 150, 25); add(txtNombre);

		JLabel lblEd = new JLabel("Edad:"); lblEd.setBounds(30, 100, 80, 25); add(lblEd);
		txtEdad = new JTextField(); txtEdad.setBounds(130, 100, 150, 25); add(txtEdad);

		JLabel lblPe = new JLabel("Peso (kg):"); lblPe.setBounds(30, 150, 80, 25); add(lblPe);
		txtPeso = new JTextField(); txtPeso.setBounds(130, 150, 150, 25); add(txtPeso);

		JLabel lblEs = new JLabel("Estatura (m):"); lblEs.setBounds(30, 200, 100, 25); add(lblEs);
		txtEstatura = new JTextField(); txtEstatura.setBounds(130, 200, 150, 25); add(txtEstatura);

		btnGuardar = new JButton("Registrar");
		btnGuardar.setBounds(50, 280, 110, 30);
		btnGuardar.addActionListener(this);
		add(btnGuardar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(180, 280, 110, 30);
		btnCancelar.addActionListener(this);
		add(btnCancelar);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == btnGuardar) {
		if (miCoordinador.validarDatos(txtNombre.getText(), txtEdad.getText(), txtPeso.getText(), txtEstatura.getText())) {
			miCoordinador.registrarPersona(txtNombre.getText(), txtEdad.getText(), txtPeso.getText(), txtEstatura.getText());
			JOptionPane.showMessageDialog(null, "Registro exitoso", "Información", JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Error en los datos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
}