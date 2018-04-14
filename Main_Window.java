package DoctorsAP; 

import java.sql.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;


import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JPanel;

import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;


public class Main_Window {

	public JFrame frame;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
			    { 
			        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
			    } 
			    catch(Exception e){ 
			    }	

				try {
					Main_Window window = new Main_Window();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	public Main_Window() {
		initialize();
	}

	public void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1003, 508);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 1029, 94);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBounds(693, 19, 111, 29);
		panel.add(btnAdmin);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Admin_Panel ob1 = new Admin_Panel();
				//ob1.main(null);
				frame.dispose();
			}
		});
		btnAdmin.setToolTipText("Press to Login");
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdmin.setBackground(new Color(0, 153, 153));
		
		JButton btnLogIn = new JButton("Sign-in");
		btnLogIn.setBounds(811, 19, 122, 29);
		panel.add(btnLogIn);
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblDoctorsap = new JLabel("DoctorsAP");
		lblDoctorsap.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
		lblDoctorsap.setBounds(34, 36, 231, 47);
		panel.add(lblDoctorsap);
		
		JLabel lblHome = new JLabel("home");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBounds(664, 59, 53, 27);
		panel.add(lblHome);
		
		JLabel lblAboutUs = new JLabel("about us");
		lblAboutUs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAboutUs.setBounds(727, 59, 59, 27);
		panel.add(lblAboutUs);
		
		JLabel lblContacts = new JLabel("contacts");
		lblContacts.setHorizontalAlignment(SwingConstants.CENTER);
		lblContacts.setBounds(796, 59, 59, 27);
		panel.add(lblContacts);
		
		JLabel lblDoctorsBlog = new JLabel("doctors blog");
		lblDoctorsBlog.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctorsBlog.setBounds(865, 59, 69, 27);
		panel.add(lblDoctorsBlog);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 91, 1014, 238);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSignup = new JButton("Sign-Up");
		btnSignup.setBounds(810, 198, 122, 29);
		panel_1.add(btnSignup);
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SignUp ob1 = new SignUp();
				ob1.main(null);
				frame.dispose();
				
			}
		});
		btnSignup.setToolTipText("Press to Login");
		btnSignup.setForeground(Color.WHITE);
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSignup.setBackground(new Color(0, 153, 153));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 51, 102));
		panel_2.setBounds(0, 328, 1014, 160);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblOurLocation = new JLabel("OUR LOCATION");
		lblOurLocation.setForeground(SystemColor.controlLtHighlight);
		lblOurLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblOurLocation.setBounds(215, 67, 132, 27);
		panel_2.add(lblOurLocation);
		
		JLabel lblSearchBy = new JLabel("SEARCH BY");
		lblSearchBy.setForeground(SystemColor.controlLtHighlight);
		lblSearchBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchBy.setBounds(434, 67, 114, 27);
		panel_2.add(lblSearchBy);
		
		JLabel lblCities = new JLabel("CITIES");
		lblCities.setForeground(SystemColor.controlLtHighlight);
		lblCities.setHorizontalAlignment(SwingConstants.CENTER);
		lblCities.setBounds(653, 67, 106, 27);
		panel_2.add(lblCities);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.text);
		separator.setBounds(242, 99, 78, 12);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(456, 99, 78, 12);
		panel_2.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(669, 99, 78, 12);
		panel_2.add(separator_2);
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LogIn_Page ob1 = new LogIn_Page();
				ob1.main(null);
				frame.dispose();
			}
		});

	}
}
