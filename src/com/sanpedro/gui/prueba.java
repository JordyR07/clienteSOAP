package com.sanpedro.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.sanpedro.model.xsd.HorarioMedico;
import com.sanpedro.servicio.ServicioHorarioMedicoPortTypeProxy;



import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class prueba {

	private JFrame frmSistemaClinicaSan;
	private JPanel escritorio;
	private JTextField txtDni;
	private JPanel panelResultados;
	private JLabel lblDni;
	private JScrollPane scrollPane;
	private static JTable tablaHorario;
	private JButton btnBuscar;
	private static JLabel lblFechaI;
	private JLabel lblHasta;
	private static JLabel lblFechaF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frmSistemaClinicaSan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaClinicaSan = new JFrame();
		frmSistemaClinicaSan.setTitle("Sistema Clinica San Pedro");
		frmSistemaClinicaSan.setBounds(100, 100, 800, 420);
		frmSistemaClinicaSan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaClinicaSan.getContentPane().setLayout(null);
		
		escritorio = new JPanel();
		escritorio.setBounds(0, 0, 774, 381);
		frmSistemaClinicaSan.getContentPane().add(escritorio);
		escritorio.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\gitProyecto\\logoSP.png"));
		label.setBounds(409, 16, 355, 354);
		escritorio.add(label);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ingrese su DNI:", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel.setBounds(10, 11, 390, 134);
		escritorio.add(panel);
		panel.setLayout(null);
		
		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDni.setBounds(176, 42, 46, 14);
		panel.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(122, 67, 145, 20);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String dni = txtDni.getText().trim();
				panelResultados.setVisible(true);
				lista2(dni);
				
				
				
			}
		});
		btnBuscar.setBounds(149, 98, 89, 23);
		panel.add(btnBuscar);
		
		panelResultados = new JPanel();
		panelResultados.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Resultados:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panelResultados.setBounds(10, 156, 389, 214);
		escritorio.add(panelResultados);
		panelResultados.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 31, 358, 134);
		tablaHorario = new JTable();
		tablaHorario.setBackground(new Color(255, 255, 255));
		tablaHorario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaHorario.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Dia", "Hora Inicio", "Hora Fin", "Turno"
				}
			) {				
				private static final long serialVersionUID = 1L;			
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			});
		tablaHorario.getColumnModel().getColumn(0).setResizable(false);
		tablaHorario.getColumnModel().getColumn(2).setResizable(false);
//		ajustarAnchoColumnas();
		scrollPane.setViewportView(tablaHorario);
		
		
		
		panelResultados.add(scrollPane);
		
		JLabel lblSemana = new JLabel("Semana del ");
		lblSemana.setBounds(10, 183, 72, 14);
		panelResultados.add(lblSemana);
		
		lblFechaI = new JLabel("");
		lblFechaI.setBounds(90, 183, 83, 14);
		panelResultados.add(lblFechaI);
		
		lblHasta = new JLabel("hasta");
		lblHasta.setBounds(168, 183, 46, 14);
		panelResultados.add(lblHasta);
		
		lblFechaF = new JLabel("");
		lblFechaF.setBounds(205, 183, 83, 14);
		panelResultados.add(lblFechaF);
		panelResultados.setVisible(false);
		
	
	}
	
public static void lista2(String dni){
		
		((DefaultTableModel)tablaHorario.getModel()).setRowCount(0);
		try{
			ServicioHorarioMedicoPortTypeProxy proxy = new ServicioHorarioMedicoPortTypeProxy();
			
			
			HorarioMedico[] lista = proxy.listado(dni);
			
			for (HorarioMedico h : lista) {
				String fechaI = h.getFecha_ini();
				String fechaF = h.getFecha_fin();
				
				
				Object[] fila = {	
					h.getDescripcion(),
					h.getHora_ini(),
					h.getHora_fin(),
					h.getTurno(),

				};			
				((DefaultTableModel)tablaHorario.getModel()).addRow(fila);
				lblFechaI.setText(fechaI);
				lblFechaF.setText(fechaF);
			}

		}catch(Exception ex){
			ex.printStackTrace();
		}


	}

}
