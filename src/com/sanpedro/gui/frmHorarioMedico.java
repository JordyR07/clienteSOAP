package com.sanpedro.gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class frmHorarioMedico extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmHorarioMedico frame = new frmHorarioMedico();
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
	public frmHorarioMedico() {
		setTitle("Horario Medico");
		setBounds(10, 10, 390, 164);

	}

}
