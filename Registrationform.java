package question8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Registrationform extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField rno;
	private JTextField pno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrationform frame = new Registrationform();
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
	public Registrationform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SPORTS REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(220, 10, 427, 84);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name : ");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(25, 113, 72, 46);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(217, 123, 267, 31);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Roll number : ");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(25, 174, 110, 46);
		contentPane.add(lblNewLabel_1_1);
		
		rno = new JTextField();
		rno.setColumns(10);
		rno.setBounds(217, 184, 200, 31);
		contentPane.add(rno);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Choose your sport :-");
		lblNewLabel_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(25, 241, 157, 46);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox sport = new JComboBox();
		sport.setModel(new DefaultComboBoxModel(new String[] {"", "Basketball", "Volleyball", "Badminton", "Tennis", "Table tennis"}));
		sport.setBounds(217, 251, 142, 31);
		contentPane.add(sport);
		
		JCheckBox dp = new JCheckBox("Double participation");
		dp.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		dp.setBounds(403, 245, 157, 40);
		contentPane.add(dp);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Phone number : ");
		lblNewLabel_1_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(26, 319, 130, 46);
		contentPane.add(lblNewLabel_1_1_2);
		
		pno = new JTextField();
		pno.setColumns(10);
		pno.setBounds(220, 329, 200, 31);
		contentPane.add(pno);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(name.getText().length()==0)
					JOptionPane.showMessageDialog(name, "Please enter your name");
				else if (rno.getText().length()==0)
					JOptionPane.showMessageDialog(rno, "Entering rollnumber is mandatory");
				
				else if(sport.getSelectedIndex()==0)
					JOptionPane.showMessageDialog(sport, "Choose your sport !!");
				else if(pno.getText().length()==0)
					JOptionPane.showMessageDialog(pno, "Enter your phonenumber");
				else if(pno.getText().length()!=10)
					JOptionPane.showMessageDialog(pno, "Please enter a valid phone number");
				else
				{
					try
					{
					FileWriter fw = new FileWriter("E:\\Sample\\sports_Q8.doc" , true);
					fw.append("Student name : " + name.getText()+"\n");
					fw.append("student roll number : "+ rno.getText() + "\n");
					fw.append("Selected sports : " + sport.getSelectedItem().toString() +"\n");
					if(dp.isSelected())
						fw.append("*Double participation*\n");
					fw.append("phone number : " + pno.getText()+"\n");
					fw.append("\n\n");
					fw.close();
					JOptionPane.showMessageDialog(register, "Registration completed successfully");
					
					
					}
					 catch(FileNotFoundException E)
					{
						 System.out.println("Error. File not found ");
					}
					catch(IOException E)
					{
						System.out.println(E.getMessage());
					}
					
				}
			}
		});
		register.setBounds(279, 410, 85, 21);
		contentPane.add(register);
	}
}
