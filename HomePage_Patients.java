package DoctorsAP;

import java.awt.EventQueue;

import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Image;

public class HomePage_Patients {

	protected static final JOptionPane JSPINNER_ID = null;
	JFrame frame;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage_Patients  window = new HomePage_Patients ();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JScrollPane scrollPane;
	private JButton btnSave;
	private JTextField txt_P_ID;
	private JTextField txt_P_Name;
	private JTextField txt_P_Number;
	private JTextField txt_A_Address;
	private JPanel panel;
	private JTextField txt_search;
	private JButton button;
	private JTabbedPane tabbedPane;
	private JPanel panel_appointment;
	private JPanel panel_profile;
	private JTextField txt_D_Name;
	private JTextField txt_D_ID;
	JLabel labelforProfile;
	
	/**
	 * Create the application.
	 */

	public void refreshTable(){
		try {
			String query= "select * from p_registration";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	// Function To Resize The Image To Fit Into JLabel
    public ImageIcon ResizeImage(String ImagePath, byte[] pic)
   {
       ImageIcon MyImage = null;
       if(ImagePath != null)
       {
          MyImage = new ImageIcon(ImagePath);
       }else
       {
           MyImage = new ImageIcon(pic);
       }
       Image img = MyImage.getImage();
       Image newImg = img.getScaledInstance(labelforProfile.getWidth(), labelforProfile.getHeight(), Image.SCALE_SMOOTH);
       ImageIcon image = new ImageIcon(newImg);
       return image;
   }
	
    
    
	HomePage_Patients () {
		
		connection = SQLconnection.dbConnector();
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 560);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1073, 485);
		frame.getContentPane().add(tabbedPane);
		
		panel_appointment = new JPanel();
		tabbedPane.addTab("Appointment", null, panel_appointment, null);
		panel_appointment.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 60, 248, 289);
		panel_appointment.add(panel);
		panel.setBorder(new TitledBorder(null, "Patient's Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(null);
		
		JLabel lblPhoneNo = new JLabel();
		lblPhoneNo.setBounds(10, 217, 94, 25);
		panel.add(lblPhoneNo);
		lblPhoneNo.setText("Phone No :");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNo.setForeground(Color.BLACK);
		
		JLabel lblP_Name = new JLabel();
		lblP_Name.setBounds(10, 64, 94, 25);
		panel.add(lblP_Name);
		lblP_Name.setText("Patient's Name :");
		lblP_Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lblP_Name.setForeground(Color.BLACK);
		
		JLabel lblP_ID = new JLabel();
		lblP_ID.setBounds(10, 28, 94, 25);
		panel.add(lblP_ID);
		lblP_ID.setText("Patient's ID :");
		lblP_ID.setHorizontalAlignment(SwingConstants.RIGHT);
		lblP_ID.setForeground(Color.BLACK);
		
		txt_P_ID = new JTextField();
		txt_P_ID.setBounds(114, 28, 113, 25);
		panel.add(txt_P_ID);
		txt_P_ID.setToolTipText("Please type ur current log in ID");
		txt_P_ID.setText("");
		
		txt_P_Name = new JTextField();
		txt_P_Name.setBounds(114, 64, 113, 25);
		panel.add(txt_P_Name);
		txt_P_Name.setToolTipText("Please input your full name");
		txt_P_Name.setText("");
		
		txt_P_Number = new JTextField();
		txt_P_Number.setBounds(114, 217, 113, 25);
		panel.add(txt_P_Number);
		txt_P_Number.setToolTipText("Please input your mobile number");
		txt_P_Number.setText("");
		
		txt_A_Address = new JTextField();
		txt_A_Address.setBounds(114, 253, 113, 25);
		panel.add(txt_A_Address);
		txt_A_Address.setToolTipText("Please input your full adress");
		txt_A_Address.setText("");
		
		JLabel lblAdress = new JLabel();
		lblAdress.setBounds(20, 253, 80, 25);
		panel.add(lblAdress);
		lblAdress.setText("Address :");
		lblAdress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdress.setForeground(Color.BLACK);
		
		txt_D_Name = new JTextField();
		txt_D_Name.setToolTipText("Please input your full name");
		txt_D_Name.setText("");
		txt_D_Name.setBounds(114, 100, 113, 25);
		panel.add(txt_D_Name);
		
		JLabel lblDoctorsName = new JLabel();
		lblDoctorsName.setText("Doctor's Name :");
		lblDoctorsName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorsName.setForeground(Color.BLACK);
		lblDoctorsName.setBounds(10, 100, 94, 25);
		panel.add(lblDoctorsName);
		
		txt_D_ID = new JTextField();
		txt_D_ID.setToolTipText("Please input your full name");
		txt_D_ID.setText("");
		txt_D_ID.setBounds(114, 136, 113, 25);
		panel.add(txt_D_ID);
		
		JLabel lblDoctorsId = new JLabel();
		lblDoctorsId.setText("Doctor's ID :");
		lblDoctorsId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDoctorsId.setForeground(Color.BLACK);
		lblDoctorsId.setBounds(10, 136, 94, 25);
		panel.add(lblDoctorsId);
		
		button = new JButton("<<");
		button.setBounds(10, 11, 130, 25);
		panel_appointment.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HomePageCustomer window = new HomePageCustomer();
				//window.frame.setVisible(true);
				//window.frame.setResizable(false);
        		frame.dispose();
				
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1072, 439);
		panel_appointment.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(null);
		
		JButton btnclear = new JButton("Clear");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt_P_ID.setText(null);
				txt_P_Name.setText(null);
				txt_P_Number.setText(null);
				txt_A_Address.setText(null);
			}
		});
		
		JLabel label_photo = new JLabel("");		
		label_photo.setBounds(711, 67, 281, 281);
		panel_1.add(label_photo);
		label_photo.setOpaque(true);
		label_photo.setBackground(Color.GRAY);
		panel_1.add(label_photo);
		btnclear.setBounds(185, 365, 70, 38);
		panel_1.add(btnclear);
		
		btnSave = new JButton("Confirm Appointment");
		btnSave.setBounds(10, 365, 165, 38);
		panel_1.add(btnSave);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 65, 435, 283);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					
					int row = table.getSelectedRow();
					String NAME_D=(table.getModel().getValueAt(row, 0)).toString();
					String query= "select * from p_registration where NAME_P='"+NAME_D+"'  ";
					
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					
					while (rs.next())
					{
						txt_D_Name.setText(rs.getString("NAME_P"));
						txt_D_ID.setText(rs.getString("ID_P"));
						//label_photo.setIcon(new ImageIcon(rs.getBytes("PHOTO_P")));
						label_photo.setIcon(ResizeImage(null, rs.getBytes("PHOTO_P")));
						
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblSearch = new JLabel();
		lblSearch.setBounds(489, 29, 70, 25);
		panel_1.add(lblSearch);
		lblSearch.setText("Search");
		lblSearch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSearch.setForeground(Color.BLACK);
		
		txt_search = new JTextField();
		txt_search.setToolTipText("Search by model name");
		txt_search.setBounds(571, 17, 130, 34);
		panel_1.add(txt_search);
		txt_search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				
				try {
					
					String query= "select * from service where NAME_D=? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txt_search.getText());
					ResultSet rs = pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					//while (rs.next())
					//{
						
					//	pst.close();
					//}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
			}
		});
		txt_search.setColumns(10);
		
		panel_profile = new JPanel();
		tabbedPane.addTab("Profile", null, panel_profile, null);
		panel_profile.setLayout(null);
		
		labelforProfile = new JLabel("");
		labelforProfile.setOpaque(true);
		
		

		
		
		
		labelforProfile.setBackground(Color.GRAY);
		labelforProfile.setBounds(10, 11, 333, 281);
		panel_profile.add(labelforProfile);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String query= "insert into test_drive(Customer_ID,Car_No,Customer_Name,Phone_No,Address) values(?,?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, txt_P_ID.getText());
					//pst.setString(2, txt_carNo.getText());
					pst.setString(3, txt_P_Name.getText());
					pst.setString(4, txt_P_Number.getText());
					pst.setString(5, txt_A_Address.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "data saved");
					
					pst.close();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				refreshTable();
				
			}
		});
		refreshTable();
	}
}