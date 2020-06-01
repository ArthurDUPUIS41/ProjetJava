package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.Color;

import javax.swing.SwingUtilities;
import javax.swing.*; 
//import java.awt.BorderLayout;

	
public class PanneauDessinTest{
	public PanneauDessinTest() {
		testConstructeurParDefaut();
		testConstructeur();
	}
	private void testConstructeurParDefaut(){		
		JFrame f1 = new JFrame("Etre un Artiste");	
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanneauDessin panneauDessin1 = new PanneauDessin();
		
		f1.getContentPane().add(panneauDessin1);
		f1.setLocationRelativeTo(null);
		f1.pack();
		f1.setVisible(true);
	}
	
	private void testConstructeur(){		
		JFrame f2 = new JFrame("Blues du Businessman");	
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanneauDessin panneauDessin2 = new PanneauDessin(720, 480, new Color(192, 192, 192));	
		
		f2.getContentPane().add(panneauDessin2);
		f2.setLocationRelativeTo(null);
		f2.pack();
		f2.setVisible(true);
	}
	
	
	
	
	public static void main(String [] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new PanneauDessinTest();
			}
		});
	}
}