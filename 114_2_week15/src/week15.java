import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class week15 {

	private JFrame frame;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					week15 window = new week15();
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
	public week15() {
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
		
		textField = new JTextField();
		textField.setBounds(6, 6, 319, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser(); //´≈ßifilechooser 
				File selectedFile=null;
				int returnValue = fileChooser.showOpenDialog(null); //•s•Xfilechooser 
				if (returnValue == JFileChooser.APPROVE_OPTION){ //ßP¬_¨Oß_øÔæ‹¿…Æ◊ 
					selectedFile = fileChooser.getSelectedFile();//´¸¨£µπFile 
					System.out.println(selectedFile.getName()); //¶L•X¿…¶W 
					textField.setText(selectedFile.getName());
				}
					
				FileReader fr =  null;
				
				try {
					fr = new FileReader(selectedFile);
				}catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				BufferedReader br = new BufferedReader(fr);
				// Data Handling
				String line , all=" ";
				try {
					while ((line=br.readLine()) != null) {
						line+="\n";
						all+=line;
					}
				}catch (IOException e1) {
					e1.printStackTrace();
				}
				textArea.setText(all);

			}
		});
		btnNewButton.setBounds(327, 6, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(6, 37, 438, 229);
		frame.getContentPane().add(textArea);
		
		//JTextArea textArea = new JTextArea();
		//textArea.setBounds(109, 127, 203, 88);
		//frame.getContentPane().add(textArea);
	}
}
