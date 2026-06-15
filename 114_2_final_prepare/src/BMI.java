import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BMI {

	private JFrame frame;
	private JTextField Text_height;
	private JTextField Text_weight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI window = new BMI();
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
	public BMI() {
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
		
		JLabel lblNewLabel = new JLabel("請輸入您的身高（公分）：");
		lblNewLabel.setBounds(47, 49, 190, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("請輸入您的體重（公斤）：");
		lblNewLabel_1.setBounds(47, 77, 190, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblbmi = new JLabel("這是一個BMI計算機");
		lblbmi.setBounds(47, 6, 119, 16);
		frame.getContentPane().add(lblbmi);
		
		Text_height = new JTextField();
		Text_height.setBounds(223, 44, 130, 26);
		frame.getContentPane().add(Text_height);
		Text_height.setColumns(10);
		
		Text_weight = new JTextField();
		Text_weight.setColumns(10);
		Text_weight.setBounds(223, 72, 130, 26);
		frame.getContentPane().add(Text_weight);
		
		JLabel lblNewLabel_1_1 = new JLabel("BMI結果為：");
		lblNewLabel_1_1.setFont(new Font("Apple Braille", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(47, 143, 119, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel Text_bmi = new JLabel("");
		Text_bmi.setBounds(162, 143, 190, 16);
		frame.getContentPane().add(Text_bmi);
		
		JButton btnNewButton = new JButton("計算");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double height = (Double.parseDouble(Text_height.getText()))*0.01;
				double weight = (Double.parseDouble(Text_weight.getText()));
				
				double bmi = weight/(height*height);
				DecimalFormat df = new DecimalFormat("#.##");
				String s=df.format(bmi);
				
				Text_bmi.setText(s);
				
				
				
			}
		});
		btnNewButton.setBounds(327, 237, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
