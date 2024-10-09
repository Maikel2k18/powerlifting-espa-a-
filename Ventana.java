package Ventana;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
		private JPanel miPanel;
		public Ventana() {
			setSize(1000,800);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.darkGray);
			empezarPanel();
		}
		private void empezarPanel() {
			 miPanel = new JPanel();
			 miPanel.setLayout(null); 
			 getContentPane().add(miPanel);
			 getContentPane().setBackground(Color.black);
			 JLabel etiqueta = new JLabel("POWERLIFTING ESPAÑA");
		        etiqueta.setBounds(400, 0, 200, 40); // Ajusta el ancho para que el texto quepa
		        etiqueta.setForeground(Color.red);
		        miPanel.add(etiqueta);
		     JLabel etiqueta2 = new JLabel("Marcas minimas");
		     etiqueta2.setBounds(100, 100, 200, 40); // Ajusta el ancho para que el texto quepa
		     etiqueta2.setForeground(Color.GRAY);
		     miPanel.add(etiqueta2);
		} 		
}
