package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
//import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Datos_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField campo_Nombre;
	private JTextField campo_PrimerApellido;
	private JTextField campo_Correo;
	private JTextField campo_Direccion;
	private JTextField campo_SegundoApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos_Cliente frame = new Datos_Cliente();
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
	public Datos_Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{176, 112, 36, 12, 56, 42, 126, 0};
		gbl_contentPane.rowHeights = new int[]{39, 20, 20, 21, 20, 21, 23, 21, 34, 39, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("DATOS DEL CIENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 4;
		gbc_lblUsuario.gridy = 0;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		JLabel lblNombre = new JLabel("Nombre *");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		campo_Nombre = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 3;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		contentPane.add(campo_Nombre, gbc_textField);
		campo_Nombre.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido *");
		GridBagConstraints gbc_lblPrimerApellido = new GridBagConstraints();
		gbc_lblPrimerApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPrimerApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerApellido.gridx = 1;
		gbc_lblPrimerApellido.gridy = 2;
		contentPane.add(lblPrimerApellido, gbc_lblPrimerApellido);
		
		campo_PrimerApellido = new JTextField();
		campo_PrimerApellido.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 2;
		contentPane.add(campo_PrimerApellido, gbc_textField_1);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido *");
		GridBagConstraints gbc_lblSegundoApellido = new GridBagConstraints();
		gbc_lblSegundoApellido.fill = GridBagConstraints.BOTH;
		gbc_lblSegundoApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoApellido.gridx = 1;
		gbc_lblSegundoApellido.gridy = 3;
		contentPane.add(lblSegundoApellido, gbc_lblSegundoApellido);
		
		campo_SegundoApellido = new JTextField();
		campo_SegundoApellido.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.NORTH;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridwidth = 3;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 3;
		contentPane.add(campo_SegundoApellido, gbc_textField_4);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n *");
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 1;
		gbc_lblDireccin.gridy = 4;
		contentPane.add(lblDireccin, gbc_lblDireccin);
		
		campo_Direccion = new JTextField();
		campo_Direccion.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 4;
		contentPane.add(campo_Direccion, gbc_textField_2);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico *");
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.fill = GridBagConstraints.BOTH;
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 1;
		gbc_lblCorreoElectrnico.gridy = 5;
		contentPane.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		
		campo_Correo = new JTextField();
		campo_Correo.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.NORTH;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridwidth = 3;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 5;
		contentPane.add(campo_Correo, gbc_textField_3);
		
		JLabel lblGnero = new JLabel("G\u00E9nero");
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.anchor = GridBagConstraints.WEST;
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 1;
		gbc_lblGnero.gridy = 6;
		contentPane.add(lblGnero, gbc_lblGnero);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		GridBagConstraints gbc_rdbtnHombre = new GridBagConstraints();
		gbc_rdbtnHombre.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnHombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnHombre.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnHombre.gridx = 2;
		gbc_rdbtnHombre.gridy = 6;
		contentPane.add(rdbtnHombre, gbc_rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		GridBagConstraints gbc_rdbtnMujer = new GridBagConstraints();
		gbc_rdbtnMujer.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnMujer.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnMujer.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMujer.gridx = 3;
		gbc_rdbtnMujer.gridy = 6;
		contentPane.add(rdbtnMujer, gbc_rdbtnMujer);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("No determinado");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnHombre.setSelected(false);
				rdbtnMujer.setSelected(false);
			}
		});
		
		rdbtnMujer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnHombre.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
			}
		});
		
		rdbtnHombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMujer.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
			}
		});
		
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.NORTH;
		gbc_rdbtnNewRadioButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 4;
		gbc_rdbtnNewRadioButton.gridy = 6;
		contentPane.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
		
		gbc_lblFechaNacimiento.fill = GridBagConstraints.BOTH;
		gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNacimiento.gridx = 1;
		gbc_lblFechaNacimiento.gridy = 7;
		contentPane.add(lblFechaNacimiento, gbc_lblFechaNacimiento);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.anchor = GridBagConstraints.SOUTH;
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.gridwidth = 3;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 7;
		//contentPane.add(dateChooser, gbc_dateChooser);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.fill = GridBagConstraints.BOTH;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 9;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!campo_Nombre.getText().isEmpty() 
						|| !campo_PrimerApellido.getText().isEmpty() 
						|| !campo_Correo.getText().isEmpty() 
						|| !campo_Direccion.getText().isEmpty() 
						|| !campo_SegundoApellido.getText().isEmpty()) {
				}
			}
		});
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.insets = new Insets(0, 0, 0, 5);
		gbc_btnSiguiente.anchor = GridBagConstraints.WEST;
		gbc_btnSiguiente.fill = GridBagConstraints.BOTH;
		gbc_btnSiguiente.gridx = 4;
		gbc_btnSiguiente.gridy = 9;
		contentPane.add(btnSiguiente, gbc_btnSiguiente);
	}
}
