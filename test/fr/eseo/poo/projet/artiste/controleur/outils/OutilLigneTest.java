package fr.eseo.poo.projet.artiste.controleur.outils;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilLigneTest {

	
	public OutilLigneTest() {
		creationPanel();			
	}
	
	private void creationPanel() {
		JFrame f1 = new JFrame("Blues du Businessman");	
		
		PanneauDessin panneauDessin1 = new PanneauDessin();			
		OutilLigne outilLigne1 = new OutilLigne();
		
		panneauDessin1.associerOutil(outilLigne1);		
			
		f1.add(panneauDessin1);		
		f1.pack();
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);		
	}
	
	
	

	public static void main(String [] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new OutilLigneTest();
			}
		});
	}
	
	
	
}
