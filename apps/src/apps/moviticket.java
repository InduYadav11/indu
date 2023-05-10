package apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class moviticket {

	private JFrame frame;
	private JTextField t1;
	protected JComboBox c2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					moviticket window = new moviticket();
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
	public moviticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 740, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("movie tickect booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(195, 11, 331, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(108, 129, 164, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("movie");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(108, 190, 107, 48);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("tickets");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(108, 258, 107, 39);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(223, 142, 175, 25);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String m= c1.getSelectedItem();
				String t1=(String) c2.getSelectedItem();
		
				int bill=0;
				int tickets=Integer.parseInt(t1);
				//Object movie;
				if(m.equals("a"))
				{
					bill=400*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "\n selected movir:" +m+ "\n ticket" +t1+  "\n total bill" +bill);
				}
				if(m.equals("b"))
				{
					bill=120*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "\n selected movir:" +m+ "\n ticket" +t1+ "\n total bill" +bill);
				}
				if(m.equals("c"))
				{
					bill=150*tickets;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "\n selected movir:" +m+ "\n ticket" +t1+  "\n total bill" +bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		btnNewButton.setBounds(239, 345, 89, 39);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "a", "b", "c"}));
		c1.setBounds(225, 206, 173, 25);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5"}));
		c2.setBounds(225, 258, 173, 39);
		frame.getContentPane().add(c2);
	}
}
