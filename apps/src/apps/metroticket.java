package apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroticket {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticket window = new metroticket();
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
	public metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 759, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HYD METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(165, 11, 403, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(70, 108, 88, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(198, 108, 181, 28);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(70, 178, 88, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "paradise", "paredground", "miyapur", "begumpet"}));
		c1.setBounds(198, 178, 181, 30);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setBounds(70, 250, 55, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "sulthan bazar", "narayanguda", "sec railwaystation", "paradise"}));
		c2.setBounds(198, 250, 181, 30);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_4 = new JLabel("TICKETS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_4.setBounds(70, 306, 88, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox t2 = new JComboBox();
		t2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		t2.setBounds(198, 306, 181, 29);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String t=(String) t2.getSelectedItem();
				int ticket=Integer.parseInt(t);
				int bill=ticket*40;
				if(fs=="paradise"&& ts=="paradise")
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid");
				}
				else if(fs=="paradise"&& ts=="sulthan bazar")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "from: "+fs+ "to:" +ts+ "tickets" +t+ "your bill:"+bill);
				}
				else if (fs=="paradise"&& ts=="narayanguda")
				{
					bill=ticket*20;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "from: "+fs+ "to:" +ts+ "tickets" +t+ "your bill:"+bill);
				}
				else if(fs=="paradise"&& ts=="sec railwaystation")
				{
					bill=ticket*10;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "from: "+fs+ "to:" +ts+ "tickets" +t+ "your bill:"+bill);
				}
				else if(fs=="sulthan bazar"&& ts=="paradise")
				{
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "from: "+fs+ "to:" +ts+ "tickets" +t+ "your bill:"+bill);
				}
				else if(fs=="sulthan bazar"&& ts=="narayanguda")
				{
					bill=ticket*20;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "from: "+fs+ "to:" +ts+ "tickets" +t+ "your bill:"+bill);
				}
				else if(fs=="sulthan bazar"&& ts=="sec railwaysttation")
				{
					bill=ticket*10;
					JOptionPane.showMessageDialog(btnNewButton, "hello" +name+ "from: "+fs+ "to:" +ts+ "tickets" +t+ "your bill:"+bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(328, 384, 137, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
