import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class VentanaConversor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the frame.
	 */
	public VentanaConversor(float valorConversor) {
		setTitle("€ to $");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblIntroduceElValor = new JLabel("Introduce el valor en euros €");
		lblIntroduceElValor.setBounds(6, 25, 188, 16);
		panel.add(lblIntroduceElValor);
		
		textField = new JTextField();
		textField.setBounds(6, 42, 200, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblValorEnDolares = new JLabel("Valor en dolares $");
		lblValorEnDolares.setBounds(6, 82, 128, 16);
		panel.add(lblValorEnDolares);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 99, 200, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float euros;
				euros = Float.parseFloat(textField.getText());
				textField_1.setText(String.valueOf(euros * valorConversor));
				
			}
		});
		btnConvertir.setBounds(242, 43, 117, 29);
		panel.add(btnConvertir);
	}
}
