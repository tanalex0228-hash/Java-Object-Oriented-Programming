import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Test {

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
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 435, 251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Text_bmi = new JLabel("");
		Text_bmi.setBounds(156, 142, 61, 16);
		frame.getContentPane().add(Text_bmi);
		
		JButton btn_bmi = new JButton("Click to get your BMI");
		btn_bmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double height = (Double.parseDouble(Text_height.getText()))*.01;  //將Text_height替換成你的身高文字框
				double weight = (Double.parseDouble(Text_weight.getText()));  //將Text_weight替換成你的體重文字框
				double bmi=weight/(height*height);
				DecimalFormat df = new DecimalFormat("#.##");
				String s=df.format(bmi);
				Text_bmi.setText(s);  //將Text_bmi替換成你要輸出計算結果的Label
			}
		});
		btn_bmi.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		btn_bmi.setBounds(241, 176, 183, 41);
		frame.getContentPane().add(btn_bmi);
		
		JLabel lblNewLabel = new JLabel("身高（公分）");
		lblNewLabel.setBounds(77, 24, 92, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BMI值");
		lblNewLabel_1.setBounds(77, 130, 92, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("體重（公斤）");
		lblNewLabel_1_1.setBounds(77, 77, 92, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		Text_height = new JTextField();
		Text_height.setBounds(156, 31, 113, 26);
		frame.getContentPane().add(Text_height);
		Text_height.setColumns(10);
		
		Text_weight = new JTextField();
		Text_weight.setColumns(10);
		Text_weight.setBounds(156, 84, 113, 26);
		frame.getContentPane().add(Text_weight);
		
		
	}
}
