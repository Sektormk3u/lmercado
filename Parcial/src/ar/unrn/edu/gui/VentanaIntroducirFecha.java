package ar.unrn.edu.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.unrn.edu.modelo.RepositorioDeVentas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaIntroducirFecha extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDia;
	private JTextField textFieldMes;
	private JTextField textFieldA�o;
	private JLabel lblDia_1;
	private JTextField textFieldDia_1;
	private JLabel lblMes_1;
	private JTextField textFieldMes_1;
	private JTextField textFieldA�o_1;
	private JLabel lblA�o_1;
	private JLabel lblFechaInicio;
	private JLabel lblFechaFin;

	private RepositorioDeVentas repo;

	public VentanaIntroducirFecha(RepositorioDeVentas repo) {
		this.repo = repo;
	}

	public void mostrarVentana() {
		setupVentana();
		this.setVisible(true);
	}

	private void setupVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(10, 21, 46, 14);
		contentPane.add(lblDia);
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(10, 49, 46, 14);
		contentPane.add(lblMes);
		JLabel lblA�o = new JLabel("A\u00F1o");
		lblA�o.setBounds(10, 74, 46, 14);
		contentPane.add(lblA�o);
		textFieldDia = new JTextField();
		textFieldDia.setBounds(52, 18, 46, 20);
		contentPane.add(textFieldDia);
		textFieldDia.setColumns(10);
		textFieldMes = new JTextField();
		textFieldMes.setColumns(10);
		textFieldMes.setBounds(52, 46, 46, 20);
		contentPane.add(textFieldMes);
		textFieldA�o = new JTextField();
		textFieldA�o.setColumns(10);
		textFieldA�o.setBounds(52, 71, 46, 20);
		contentPane.add(textFieldA�o);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(30, 111, 89, 23);
		contentPane.add(btnAceptar);

		lblDia_1 = new JLabel("Dia");
		lblDia_1.setBounds(135, 21, 46, 14);
		contentPane.add(lblDia_1);

		textFieldDia_1 = new JTextField();
		textFieldDia_1.setColumns(10);
		textFieldDia_1.setBounds(177, 18, 46, 20);
		contentPane.add(textFieldDia_1);

		lblMes_1 = new JLabel("Mes");
		lblMes_1.setBounds(135, 49, 46, 14);
		contentPane.add(lblMes_1);

		textFieldMes_1 = new JTextField();
		textFieldMes_1.setColumns(10);
		textFieldMes_1.setBounds(177, 46, 46, 20);
		contentPane.add(textFieldMes_1);

		textFieldA�o_1 = new JTextField();
		textFieldA�o_1.setColumns(10);
		textFieldA�o_1.setBounds(177, 71, 46, 20);
		contentPane.add(textFieldA�o_1);

		lblA�o_1 = new JLabel("A\u00F1o");
		lblA�o_1.setBounds(135, 74, 46, 14);
		contentPane.add(lblA�o_1);

		lblFechaInicio = new JLabel("Fecha de inicio");
		lblFechaInicio.setBounds(41, 0, 89, 14);
		contentPane.add(lblFechaInicio);

		lblFechaFin = new JLabel("Fecha fin");
		lblFechaFin.setBounds(177, 0, 69, 14);
		contentPane.add(lblFechaFin);
		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int dia1 = Integer.parseInt(textFieldDia.getText());
					int mes1 = Integer.parseInt(textFieldMes.getText());
					int a�o1 = Integer.parseInt(textFieldA�o.getText());
					int dia2 = Integer.parseInt(textFieldDia_1.getText());
					int mes2 = Integer.parseInt(textFieldMes_1.getText());
					int a�o2 = Integer.parseInt(textFieldA�o_1.getText());
					LocalDateTime fechaInicio = LocalDateTime.of(a�o1, mes1, dia1, 1, 1);
					LocalDateTime fechaFin = LocalDateTime.of(a�o2, mes2, dia2, 1, 1);
					if (fechaInicio.isBefore(fechaFin)) {
						VentanaVentas ventana = new VentanaVentas(repo, fechaInicio, fechaFin);
						ventana.mostrarVentana();
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(btnAceptar, "Verifique los campos ingresados");
				}
			}
		});

	}

}
