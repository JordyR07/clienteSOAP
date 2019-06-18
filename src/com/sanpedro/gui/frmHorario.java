package com.sanpedro.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sanpedro.model.xsd.HorarioMedico;
import com.sanpedro.servicio.ServicioHorarioMedicoPortTypeProxy;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmHorario extends JFrame {

	private JPanel contentPane;
	private JTextField txtDni;
	private JScrollPane scrollPane;
	private static JTable tablaHorario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmHorario frame = new frmHorario();
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
	public frmHorario() {
		setTitle("Horario Medicos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDni = new JTextField();
		txtDni.setBounds(219, 21, 123, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(163, 24, 46, 14);
		contentPane.add(lblDni);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 94, 438, 145);
		contentPane.add(scrollPane);
		tablaHorario = new JTable();
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
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = txtDni.getText().trim();

				lista2(dni);
			}
		});
		btnBuscar.setBounds(253, 64, 89, 23);
		contentPane.add(btnBuscar);
	}
	
public static void lista2(String dni){
		
		((DefaultTableModel)tablaHorario.getModel()).setRowCount(0);
		try{
			ServicioHorarioMedicoPortTypeProxy proxy = new ServicioHorarioMedicoPortTypeProxy();
			
			
			HorarioMedico[] lista = proxy.listado(dni);
			
			for (HorarioMedico h : lista) {
				Object[] fila = {	
					h.getDescripcion(),
					h.getHora_ini(),
					h.getHora_fin(),
					h.getTurno(),

				};			
				((DefaultTableModel)tablaHorario.getModel()).addRow(fila);			
			}

		}catch(Exception ex){
			ex.printStackTrace();
		}


	}
}
