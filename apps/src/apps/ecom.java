package apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;
    int i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 741, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(302, 23, 210, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\w2.jpg"));
		lblNewLabel_2.setBounds(52, 94, 105, 155);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\w3.jpg"));
		lblNewLabel_3.setBounds(495, 94, 129, 155);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS.2,000");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(52, 241, 83, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS.3,000");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(253, 244, 97, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rs.3,400");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(505, 235, 83, 30);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "TYPE", "DURATION", "REVIEW"}));
		comboBox.setBounds(40, 276, 95, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "TYPE", "DURABILITY", "REVIEW"}));
		comboBox_1.setBounds(253, 275, 76, 24);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "TYPE", "DURABILITY", "REVIEW "}));
		comboBox_2.setBounds(495, 276, 93, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\W4.jpg"));
		lblNewLabel_1.setBounds(266, 120, 111, 113);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel LB = new JLabel("cart:0");
		LB.setFont(new Font("Tahoma", Font.BOLD, 18));
		LB.setBounds(562, 26, 95, 41);
		frame.getContentPane().add(LB);
		
		JButton btnNewButton = new JButton("add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			//int i=0;
			public void actionPerformed(ActionEvent e) {
				i++;
				LB.setText("CART :"+i);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(40, 326, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
		//int j=0;
			public void actionPerformed(ActionEvent e) {
				i++;
				LB.setText("CART :"+i);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(237, 328, 105, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			//int v=0;
			public void actionPerformed(ActionEvent e) {
				i++;
				LB.setText("CART :"+i);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setBounds(482, 327, 120, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
