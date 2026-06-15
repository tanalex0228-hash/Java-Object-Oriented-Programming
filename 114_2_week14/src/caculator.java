import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class caculator {

	private JFrame frame;
	private JTextField txtFeet;
	private JTextField txtInch;
	private JTextField txtCm;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caculator window = new caculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public caculator() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Feet Label
		JLabel lblFeet = new JLabel("Feet");
		lblFeet.setBounds(30, 30, 80, 25);
		frame.getContentPane().add(lblFeet);

		// Feet TextField
		txtFeet = new JTextField();
		txtFeet.setBounds(120, 30, 100, 25);
		frame.getContentPane().add(txtFeet);

		// Inch Label
		JLabel lblInch = new JLabel("Inch");
		lblInch.setBounds(30, 70, 80, 25);
		frame.getContentPane().add(lblInch);

		// Inch TextField
		txtInch = new JTextField();
		txtInch.setBounds(120, 70, 100, 25);
		frame.getContentPane().add(txtInch);

		// CM Label
		JLabel lblCm = new JLabel("Centimeter");
		lblCm.setBounds(30, 110, 80, 25);
		frame.getContentPane().add(lblCm);

		// CM TextField
		txtCm = new JTextField();
		txtCm.setBounds(120, 110, 100, 25);
		frame.getContentPane().add(txtCm);

		// Ft/In -> Cm
		JButton btnToCm = new JButton("Ft/In -> Cm");
		btnToCm.setBounds(260, 30, 150, 30);
		frame.getContentPane().add(btnToCm);

		// Cm -> Ft/In
		JButton btnToFt = new JButton("Cm -> Ft/In");
		btnToFt.setBounds(260, 80, 150, 30);
		frame.getContentPane().add(btnToFt);

		btnToCm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double feet =
						Double.parseDouble(txtFeet.getText());

				double inch =
						Double.parseDouble(txtInch.getText());

				double cm =
						(feet * 12 + inch) * 2.54;

				txtCm.setText(
						String.format("%.2f", cm));
			}
		});

		btnToFt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double cm =
						Double.parseDouble(txtCm.getText());

				double totalInch = cm / 2.54;

				int feet =
						(int)(totalInch / 12);

				double inch =
						totalInch % 12;

				txtFeet.setText(
						String.valueOf(feet));

				txtInch.setText(
						String.format("%.2f", inch));
			}
		});
	}
}