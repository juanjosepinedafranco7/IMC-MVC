package gui;

import java.awt.Font;
import javax.swing.*;
import controller.Coordinador;

public class AcercaDe extends JDialog {

    private Coordinador miCoordinador;

    public AcercaDe() {
        setSize(400, 300);
        setTitle("Información del Sistema");
        setLayout(null);
        setModal(true);
        setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("DATOS DEL DESARROLLADOR", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 14));
        lblTitulo.setBounds(50, 20, 300, 30);
        add(lblTitulo);

        JLabel lblAutor = new JLabel("Autor: Juan José Pineda");
        lblAutor.setBounds(40, 70, 300, 25); add(lblAutor);

        JLabel lblFicha = new JLabel("Programa: ADSO - SENA");
        lblFicha.setBounds(40, 100, 300, 25); add(lblFicha);

        JTextArea txtDesc = new JTextArea("Aplicación desarrollada bajo el patrón MVC para el cálculo y gestión de IMC en memoria.");
        txtDesc.setLineWrap(true);
        txtDesc.setWrapStyleWord(true);
        txtDesc.setEditable(false);
        txtDesc.setBackground(getBackground());
        txtDesc.setBounds(40, 140, 300, 60);
        add(txtDesc);

        JButton btnOk = new JButton("Entendido");
        btnOk.setBounds(140, 210, 100, 30);
        btnOk.addActionListener(e -> dispose());
        add(btnOk);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
}