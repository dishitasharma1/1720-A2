package WhatClass_nonmvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class WhatClass extends JFrame implements ActionListener, MouseListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterWhatClass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhatClass frame = new WhatClass();
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
	public WhatClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(10, 0, 492, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WHAT CLASS?");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("OCR A Extended", Font.PLAIN, 40));
		lblNewLabel.setBounds(0, 0, 492, 83);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 94, 492, 184);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtEnterWhatClass = new JTextField();
		txtEnterWhatClass.setForeground(new Color(192, 192, 192));
		txtEnterWhatClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterWhatClass.setText("Enter What Class ID");
		txtEnterWhatClass.setBounds(152, 11, 242, 34);
		panel_1.add(txtEnterWhatClass);
		txtEnterWhatClass.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID : ");
		lblNewLabel_1.setFont(new Font("OCR A Extended", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(82, 8, 87, 38);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Enter!");
		
		btnNewButton.setBounds(221, 56, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PLAY!");
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("OCR A Extended", Font.PLAIN, 20));
		btnNewButton_1.setBounds(190, 289, 119, 34);
		contentPane.add(btnNewButton_1);
	}
	
	public void actionPerformed (ActionEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
