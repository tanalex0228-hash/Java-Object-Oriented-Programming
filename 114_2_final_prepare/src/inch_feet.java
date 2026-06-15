import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class inch_feet {

	private JFrame frame;
	private JTextField Text_feet;
	private JTextField Text_inch;
	private JLabel Label_cm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inch_feet window = new inch_feet();
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
	public inch_feet() {
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
		
		JLabel lblNewLabel_feet = new JLabel("feet:");
		lblNewLabel_feet.setBounds(63, 37, 61, 16);
		frame.getContentPane().add(lblNewLabel_feet);
		
		JLabel lblNewLabel_inch = new JLabel("inch:");
		lblNewLabel_inch.setBounds(63, 73, 61, 16);
		frame.getContentPane().add(lblNewLabel_inch);
		
		JLabel lblNewLabel_cm = new JLabel("cm:");
		lblNewLabel_cm.setBounds(63, 130, 61, 16);
		frame.getContentPane().add(lblNewLabel_cm);
		
		Text_feet = new JTextField();
		Text_feet.setBounds(136, 32, 130, 26);
		frame.getContentPane().add(Text_feet);
		Text_feet.setColumns(10);
		
		Text_inch = new JTextField();
		Text_inch.setBounds(136, 68, 130, 26);
		frame.getContentPane().add(Text_inch);
		Text_inch.setColumns(10);
		
		JButton btnNewButton = new JButton("計算");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double inch =Double.parseDouble(Text_inch.getText());
				double feet =Double.parseDouble(Text_feet.getText());

				double cm =feet * 30.48 +inch * 2.54;
				DecimalFormat df = new DecimalFormat("#.##");
				String s = df.format(cm);

				Label_cm.setText(s);
				
				
				
			}
		});
		btnNewButton.setBounds(327, 237, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		Label_cm = new JLabel("");
		Label_cm.setBounds(136, 130, 61, 16);
		frame.getContentPane().add(Label_cm);
	}
}
