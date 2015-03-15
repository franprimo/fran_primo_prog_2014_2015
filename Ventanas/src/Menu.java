import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtInformacin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnLista = new JMenu("Lista");
		menuBar.add(mnLista);
		
		JMenuItem mntmItem = new JMenuItem("Item 1");
		mntmItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtInformacin.setText("He tecleado información.");
			}
		});
		mnLista.add(mntmItem);
		
		JMenuItem mntmItem_1 = new JMenuItem("Item 2");
		mnLista.add(mntmItem_1);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		//Añadir separador entre los items del menu.
		mnLista.addSeparator();
		
		JMenuItem mntmItem_2 = new JMenuItem("Nuevo 1");
		mnLista.add(mntmItem_2);
		
		JMenu mnSubmenu = new JMenu("Submenu");
		mnLista.add(mnSubmenu);
		
		JMenuItem mntmSubmenu = new JMenuItem("Submenu 1");
		mnSubmenu.add(mntmSubmenu);
		
		mnLista.addSeparator();
		
		JCheckBoxMenuItem chckbxmntmCheck = new JCheckBoxMenuItem("Check");
		mnLista.add(chckbxmntmCheck);
		
		JRadioButtonMenuItem rdbtnmntmRadio = new JRadioButtonMenuItem("Radio 1");
		rdbtnmntmRadio.setSelected(true);
		mnLista.add(rdbtnmntmRadio);
		
		JRadioButtonMenuItem rdbtnmntmRadio_1 = new JRadioButtonMenuItem("Radio 2");
		mnLista.add(rdbtnmntmRadio_1);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtInformacin = new JTextField();
		txtInformacin.setEditable(false);
		txtInformacin.setText("Información");
		contentPane.add(txtInformacin, BorderLayout.SOUTH);
		txtInformacin.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
	}

}
