package DoctorsAP;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LogIn_Page {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn_Page window = new LogIn_Page();
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
	public LogIn_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 302, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogInAsDoc = new JButton("");
		btnLogInAsDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LogIn_Doctors ob1 = new LogIn_Doctors();
				ob1.main(null);
				frame.dispose();
				
			}
		});
		btnLogInAsDoc.setBounds(44, 124, 199, 88);
		frame.getContentPane().add(btnLogInAsDoc);
		
		JButton btnLogInAsPat = new JButton("");
		btnLogInAsPat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LogIn_Patients ob1 = new LogIn_Patients();
				ob1.main(null);
				frame.dispose();
				
			}
		});
		
		JLabel lblLogInAs = new JLabel("Log In as a Doctor");
		lblLogInAs.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogInAs.setBounds(44, 213, 199, 32);
		frame.getContentPane().add(lblLogInAs);
		btnLogInAsPat.setBounds(44, 270, 199, 88);
		btnLogInAsPat.setIcon(new ImageIcon(Main_Window.class.getResource("/Photos/LoginLogo.png")));
		btnLogInAsDoc.setIcon(new ImageIcon(Main_Window.class.getResource("/Photos/LoginLogo.png")));
		frame.getContentPane().add(btnLogInAsPat);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main_Window window = new Main_Window();
				window.frame.setVisible(true);
				window.frame.setResizable(false);
        		frame.dispose();
			}
		});
		
		JLabel lblPatients_1 = new JLabel("Log In as a Patient");
		lblPatients_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatients_1.setBounds(44, 360, 199, 32);
		frame.getContentPane().add(lblPatients_1);
		btnBack.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblPatients = new JLabel("");
		lblPatients.setBounds(0, 0, 306, 552);
		//label.setIcon(new ImageIcon(Main_Window.class.getResource("/Photos/back2.jpg")));
		frame.getContentPane().add(lblPatients);
	}
}
