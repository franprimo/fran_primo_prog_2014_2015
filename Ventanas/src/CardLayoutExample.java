import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class CardLayoutExample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutExample frame = new CardLayoutExample();
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
	public CardLayoutExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel Superior = new JPanel();
		contentPane.add(Superior);
		Superior.setLayout(new BoxLayout(Superior, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("Panel1");
		Superior.add(btnNewButton);
		btnNewButton.addActionListener(new actionListener() {
			public void actionPerformed(actionEvent arg0){
				CardLayout c = (CardLayout) Inferior.getLayout();
				c.show(Inferior, "Panel1");
			}
		});
		
		JButton btnNewButton_1 = new JButton("Panel2");
		Superior.add(btnNewButton_1);
		
		JPanel Inferior = new JPanel();
		contentPane.add(Inferior);
		Inferior.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		Inferior.add(panel1, "Panel1");
		panel1.setLayout(null);
		
		JLabel lblPanel = new JLabel("Panel 1");
		lblPanel.setBounds(6, 16, 61, 16);
		panel1.add(lblPanel);
		
		JButton button = new JButton(">>");
		button.setBounds(6, 40, 117, 29);
		panel1.add(button);
		
		JPanel panel2 = new JPanel();
		Inferior.add(panel2, "Panel2");
		panel2.setLayout(null);
		
		JLabel lblPanel_1 = new JLabel("Panel 2");
		lblPanel_1.setBounds(16, 20, 61, 16);
		panel2.add(lblPanel_1);
		
		JButton button_1 = new JButton("<<");
		button_1.setBounds(16, 44, 117, 29);
		panel2.add(button_1);
	}
}
