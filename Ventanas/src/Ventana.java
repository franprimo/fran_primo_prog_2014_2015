import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana {
	static JPanel panel = new JPanel();
	static JPanel panelChico = new JPanel();
	static JFrame ventana = new JFrame("Fran");
	static JButton boton1 = new JButton("Chico");
	static JButton boton2 = new JButton("Chica");
	static JButton boton3 = new JButton("Gay");
	
	public static void creaVentana(){
		panel.setBounds(0, 0, 300, 200);
		panel.setVisible(true);
		
		panelChico.setBounds(0, 0, 300, 200);
		
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(300, 200);
		ventana.setLocation(500, 100);
		ventana.add(panel);
		creaBotones();
		ventana.setVisible(true);
		
	}
	
	public static void creaBotones(){
		boton1.setBackground(Color.blue);
		//boton1.setLocation(130, 100);
		boton1.setBounds(130, 100, 50, 20);
		boton1.setVisible(true);
		panel.add(boton1);
		boton1.addActionListener(new ActionListener(){
			public void ActionPerfomed(ActionEvent arg){
				ventana.remove(panel);
				ventana.add(panelChico);
				panelChico.setVisible(true);
			}
		});
		
		boton2.setBackground(Color.pink);
		boton2.setBounds(190, 100, 50, 20);
		boton2.setVisible(true);
		panel.add(boton2);
		
		boton3.setBackground(Color.BLACK);
		boton3.setBounds(250, 100, 50, 20);
		boton3.setVisible(true);
		panel.add(boton3);
	}

	public static void main(String[] args) {
		creaVentana();
	}

}
