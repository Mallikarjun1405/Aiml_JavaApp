package Metro_TB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Metro Train Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(151, 11, 225, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(33, 60, 87, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(33, 96, 81, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(33, 138, 81, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ticket");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(28, 180, 86, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(106, 47, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox f1 = new JComboBox();
		f1.setModel(new DefaultComboBoxModel(new String[] {"select", "Kphp", "jntuh", "myp"}));
		f1.setBounds(116, 86, 65, 25);
		frame.getContentPane().add(f1);
		
		JComboBox t2 = new JComboBox();
		t2.setModel(new DefaultComboBoxModel(new String[] {"select", "x", "y", "z"}));
		t2.setBounds(124, 133, 55, 25);
		frame.getContentPane().add(t2);
		
		JComboBox t3 = new JComboBox();
		t3.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4"}));
		t3.setBounds(124, 180, 68, 21);
		frame.getContentPane().add(t3);
		
		JLabel lblNewLabel_5 = new JLabel("Do u Want to book a cab");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(20, 216, 233, 34);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String f=(String) f1.getSelectedItem();
				String t=(String) t2.getSelectedItem();
				String tt=(String) t3.getSelectedItem();
				int bill=Integer.parseInt(tt)*40;
				JOptionPane.showMessageDialog(btnNewButton,"Hello"+n+" \n From:"+f+"\n To:"+t+"\n Ticket:"+tt+"\n your bill"+bill);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(197, 223, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(309, 223, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}

