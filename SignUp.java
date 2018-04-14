package DoctorsAP;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SignUp {

	private JFrame frame;
	private JTextField id_P;
	private JTextField Name_P;
	private JTextField password_P;
	private JButton BTNforPatient;
	Connection connection = null;
	private JLabel lblSignUp;
	private JLabel lblCreateAFree;
	private JTextField Address_P;
	private JTextField Phone_P;
	private JTextField id_D;
	private JTextField Name_D;
	private JTextField password_D;
	private JTextField Address_D;
	private JTextField Phone_D;
	private JTextField Photo_D;
	private JTextField Catagory_D;
	private JLabel label_6;
	String s;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	SignUp() {
		
		connection = SQLconnection.dbConnector();
		frame = new JFrame();
		frame.setBounds(100, 100, 598, 566);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 0, 0, 100));
		panel.setBounds(10, 125, 558, 352);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Patient's ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 38, 161, 29);
		panel.add(lblNewLabel);
		
		Name_P = new JTextField();
		Name_P.setBounds(106, 78, 133, 25);
		panel.add(Name_P);
		Name_P.setColumns(10);
		
		password_P = new JTextField();
		password_P.setBounds(106, 114, 133, 25);
		panel.add(password_P);
		password_P.setColumns(10);
		
		id_P = new JTextField();
		id_P.setBounds(106, 42, 133, 25);
		panel.add(id_P);
		id_P.setColumns(10);
		
		JLabel lblUser = new JLabel("Patient's Name");
		lblUser.setForeground(Color.WHITE);
		lblUser.setBounds(10, 74, 161, 29);
		panel.add(lblUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(10, 114, 161, 29);
		panel.add(lblPassword);
			
		BTNforPatient = new JButton("Create Account");
		BTNforPatient.setBounds(106, 268, 133, 29);
		panel.add(BTNforPatient);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(10, 154, 161, 29);
		panel.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setBounds(10, 188, 161, 29);
		panel.add(lblPhone);
		
		JLabel lblPhoto = new JLabel("photo");
		lblPhoto.setForeground(Color.WHITE);
		lblPhoto.setBounds(10, 228, 161, 29);
		panel.add(lblPhoto);
		
		Address_P = new JTextField();
		Address_P.setColumns(10);
		Address_P.setBounds(106, 158, 133, 25);
		panel.add(Address_P);
		
		Phone_P = new JTextField();
		Phone_P.setColumns(10);
		Phone_P.setBounds(106, 194, 133, 25);
		panel.add(Phone_P);
		
		JLabel lblDoctorsId = new JLabel("Doctor's ID");
		lblDoctorsId.setForeground(Color.WHITE);
		lblDoctorsId.setBounds(258, 38, 161, 29);
		panel.add(lblDoctorsId);
		
		id_D = new JTextField();
		id_D.setColumns(10);
		id_D.setBounds(354, 42, 133, 25);
		panel.add(id_D);
		
		JLabel lblDoctorsName = new JLabel("Doctor's Name");
		lblDoctorsName.setForeground(Color.WHITE);
		lblDoctorsName.setBounds(258, 74, 161, 29);
		panel.add(lblDoctorsName);
		
		Name_D = new JTextField();
		Name_D.setColumns(10);
		Name_D.setBounds(354, 78, 133, 25);
		panel.add(Name_D);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(258, 114, 161, 29);
		panel.add(label_2);
		
		password_D = new JTextField();
		password_D.setColumns(10);
		password_D.setBounds(354, 114, 133, 25);
		panel.add(password_D);
		
		JLabel label_3 = new JLabel("Address");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(258, 154, 161, 29);
		panel.add(label_3);
		
		Address_D = new JTextField();
		Address_D.setColumns(10);
		Address_D.setBounds(354, 158, 133, 25);
		panel.add(Address_D);
		
		JLabel label_4 = new JLabel("Phone");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(258, 188, 161, 29);
		panel.add(label_4);
		
		Phone_D = new JTextField();
		Phone_D.setColumns(10);
		Phone_D.setBounds(354, 194, 133, 25);
		panel.add(Phone_D);
		
		JLabel label_5 = new JLabel("photo");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(258, 271, 161, 29);
		panel.add(label_5);
		
		Photo_D = new JTextField();
		Photo_D.setColumns(10);
		Photo_D.setBounds(354, 273, 133, 25);
		panel.add(Photo_D);
		
		
		
		
		
		JButton browse = new JButton("browse");
		browse.setToolTipText("Browse for photos");
		browse.setBounds(106, 237, 133, 23);
		panel.add(browse);
		browse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				JFileChooser fileChooser = new JFileChooser();
		         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
		         fileChooser.addChoosableFileFilter(filter);
		         int result = fileChooser.showSaveDialog(null);
		         if(result == JFileChooser.APPROVE_OPTION){
		             File selectedFile = fileChooser.getSelectedFile();
		             String path = selectedFile.getAbsolutePath();
		             //lblNoImage.setIcon(ResizeImage(path, null));
		             s = path;
		              }
		         else if(result == JFileChooser.CANCEL_OPTION){
		             System.out.println("No Data");
		         }
		     }
		    });
		
		
		
		
		
		
		JButton BTNforDoctors = new JButton("Create Account");
		BTNforDoctors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {					
					String query= "insert into d_registration(NAME_D, ID_D,  PASSWORD_D, ADDRESS_D, PHONE_D, PHOTO_D, CATAGORY_D) values(?,?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.setString(1, Name_D.getText());
					pst.setString(2, id_D.getText());
					pst.setString(3, password_D.getText());
					pst.setString(4, Catagory_D.getText());
					pst.setString(5, Phone_D.getText());
					pst.setString(6, Address_D.getText());
					pst.setString(7, Photo_D.getText());
					
				
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "data saved");
					
					pst.close();
					
				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Use different ID");
				}
				
				
				
				
				
			}
		});
		BTNforDoctors.setBounds(354, 311, 133, 29);
		panel.add(BTNforDoctors);
		
		Catagory_D = new JTextField();
		Catagory_D.setColumns(10);
		Catagory_D.setBounds(354, 232, 133, 25);
		panel.add(Catagory_D);
		
		label_6 = new JLabel("Catagory");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(258, 228, 161, 29);
		panel.add(label_6);
		BTNforPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				try {
	
					
					String query= "insert into p_registration(NAME_P, ID_P,  PASSWORD_P, ADDRESS_P, PHONE_P, PHOTO_P) values(?,?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.setString(1, Name_P.getText());
					pst.setString(2, id_P.getText());
					pst.setString(3, password_P.getText());
					pst.setString(4, Address_P.getText());
					pst.setString(5, Phone_P.getText());
					
					InputStream img = new FileInputStream(new File(s));
					
					pst.setBlob(6,img);
					
					 if(pst.executeUpdate() == 1)
		                {
		                    JOptionPane.showMessageDialog(null, "data Inserted");
		                }
					 else{
						 	JOptionPane.showMessageDialog(null, "No Image Selected");
					 }
					 
					pst.close();
					
				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Use different ID");
				}
				
			}
		});
		
		JButton button = new JButton("<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main_Window window = new Main_Window();
				window.frame.setVisible(true);
				window.frame.setResizable(false);
        		frame.dispose();
			}
		});
		button.setBounds(10, 11, 130, 25);
		frame.getContentPane().add(button);
		
		lblCreateAFree = new JLabel("Create a free Account");
		lblCreateAFree.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAFree.setForeground(Color.WHITE);
		lblCreateAFree.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblCreateAFree.setBounds(10, 65, 558, 63);
		frame.getContentPane().add(lblCreateAFree);
		lblSignUp = new JLabel("");
		lblSignUp.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSignUp.setBackground(new Color(51, 0, 102));
		//lblSignUp.setIcon(new ImageIcon(LogIn_window.class.getResource("/Photos/SignUp.jpg")));
		lblSignUp.setBounds(0, 0, 659, 543);
		frame.getContentPane().add(lblSignUp);
	}
}
