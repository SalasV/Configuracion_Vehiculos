package interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Cliente;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class ModeloCoche extends JFrame {

	private JPanel contentPane;
	private JTextArea txtFdgdfgdas;

	/**
	 * Launch the application.
	 * 
	 * @param cliente
	 */
	public static void main(String args, Cliente cliente) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModeloCoche frame = new ModeloCoche(args, cliente);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModeloCoche(String userName, Cliente cliente) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 25, 115, 0, 0, 120, 68, 52, 121, 57 };
		gbl_contentPane.rowHeights = new int[] { 36, 70, 70, 70, 70, 70, 70, 37, 40, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0 };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		String nom = new String("seatibiza");
		String formato = new String(".jpg");
		ImageIcon[] Img = new ImageIcon[7];
		for (int i = 0; i < Img.length; i++) {
			Img[i] = new ImageIcon(nom + (i + 1) + formato);
		}
		ImageIcon[] Img2 = new ImageIcon[7];
		for (int i = 0; i < Img2.length; i++) {
			Img2[i] = new ImageIcon(nom + (i + 1) + (i + 1) + formato);
		}

		JLabel lblSeleccionarElModel = new JLabel("SELECCIONAR EL MODEL DE COCHE");
		lblSeleccionarElModel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSeleccionarElModel = new GridBagConstraints();
		gbc_lblSeleccionarElModel.gridwidth = 3;
		gbc_lblSeleccionarElModel.fill = GridBagConstraints.BOTH;
		gbc_lblSeleccionarElModel.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeleccionarElModel.gridx = 3;
		gbc_lblSeleccionarElModel.gridy = 0;
		contentPane.add(lblSeleccionarElModel, gbc_lblSeleccionarElModel);

		JLabel lblNewLabel = new JLabel("Usuario: " + userName);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 7;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(Img[0]);

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setIcon(Img[1]);

		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("seatibiza11.jpg"));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridheight = 3;
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 2;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setIcon(Img[2]);

		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 3;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.setIcon(Img[3]);

		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 4;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);

		JButton btnNewButton_4 = new JButton();
		btnNewButton_4.setIcon(Img[4]);

		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 5;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);

		JButton btnNewButton_5 = new JButton();
		btnNewButton_5.setIcon(Img[5]);

		txtFdgdfgdas = new JTextArea(
				"El SEAT Alhambra es el buque insignia \nde la gama SEAT por tamaño y capacidad de transporte");
		txtFdgdfgdas.setToolTipText("");
		GridBagConstraints gbc_txtFdgdfgdas = new GridBagConstraints();
		gbc_txtFdgdfgdas.insets = new Insets(0, 0, 5, 5);
		gbc_txtFdgdfgdas.gridwidth = 2;
		gbc_txtFdgdfgdas.fill = GridBagConstraints.BOTH;
		gbc_txtFdgdfgdas.gridheight = 2;
		gbc_txtFdgdfgdas.gridx = 6;
		gbc_txtFdgdfgdas.gridy = 5;
		contentPane.add(txtFdgdfgdas, gbc_txtFdgdfgdas);
		txtFdgdfgdas.setColumns(10);
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 6;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);

		JButton button = new JButton();
		button.setIcon(Img[6]);

		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridheight = 2;
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 1;
		gbc_button.gridy = 7;
		contentPane.add(button, gbc_button);

		JButton btnNewButton_6 = new JButton("Anterior");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Datos_Cliente pantalla_datos = new Datos_Cliente(cliente,userName);
				
				setVisible(false);
			}
		});

		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_6.gridx = 4;
		gbc_btnNewButton_6.gridy = 8;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("seatibiza11.jpg"));
				txtFdgdfgdas.setText(
						"El SEAT Alhambra es el buque insignia \nde la gama SEAT por tamaño y capacidad de transporte");
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("seatibiza22.jpg"));
				txtFdgdfgdas.setText(
						"El SEAT Arona es el primer crossover del segmento B de SEAT.\nSe trata de una versión crossover del SEAT Ibiza");
			}
		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("seatibiza33.jpg"));
				txtFdgdfgdas.setText(
						"El SEAT Ateca es el primer SUV de SEAT.\nEs un todocamino de tamaño mediano,\ncomparable al Audi Q3 o al Kia Sportage");
			}
		});

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("seatibiza44.jpg"));
				txtFdgdfgdas.setText("El SEAT Ibiza es el utilitario de SEAT, "
						+ "\nla opción del segmento B del fabricante español, "
						+ "\nun coche pequeño que es rival del Reanult Clio, del Peugeot 208, del Mazda2 o del Ford Fiesta");
			}
		});

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("seatibiza55.jpg"));
				txtFdgdfgdas.setText(
						"El SEAT León es un compacto de precio competitivo \ndisponible con carrocerías de 5 puertas, 3 puertas y carrocería familiar");
			}
		});

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("seatibiza66.jpg"));
				txtFdgdfgdas.setText(
						"El SEAT Panda es un automóvil utilitario (segmento A) diseñado por \nGiorgetto Giugiaro y producido por esta firma bajo licencia de Fiat");
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("seatibiza77.jpg"));
				txtFdgdfgdas.setText(
						"El SEAT Tarraco es un todocamino grande de hasta 7 plazas \nfabricado por SEAT, que se sitúa un escalón por encima del SEAT Ateca");
			}
		});

		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.insets = new Insets(0, 0, 0, 5);
		gbc_btnSiguiente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSiguiente.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnSiguiente.gridx = 7;
		gbc_btnSiguiente.gridy = 8;
		contentPane.add(btnSiguiente, gbc_btnSiguiente);

	}
}
