package question8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcomescreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcomescreen frame = new Welcomescreen();
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
	public Welcomescreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pic = new JLabel("New label");
		pic.setBounds(0, 0, 780, 445);
		contentPane.add(pic);
		ImageIcon img = new ImageIcon("E:\\Images\\sports.png");
		pic.setIcon(img);
		
		
		
		JButton btnNewButton_1 = new JButton("continue");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new Registrationform().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		btnNewButton_1.setBounds(347, 455, 99, 31);
		contentPane.add(btnNewButton_1);
		
	}
}
