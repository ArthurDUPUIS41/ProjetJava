package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import fr.eseo.poo.projet.artiste.vue.formes.VueLigne;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilLigneTest {

	
	public OutilLigneTest() {
		creationPanel();
		//creationLigne();		
	}
	
	private void creationPanel() {
		JFrame f2 = new JFrame("Blues du Businessman");	
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanneauDessin panneauDessin2 = new PanneauDessin(720, 480, new Color(192, 192, 192));	
		
		
		/*OutilLigne 
		
		Ligne ligne1	= new Ligne();		
		VueLigne vueLigne1	= new VueLigne(ligne1);
		panneauDessin2.ajouterVueForme(vueLigne1);*/
		Outil.mousePressed(MOUSE_PRESSED);
		
		
		
		f2.getContentPane().add(panneauDessin2);
		f2.setLocationRelativeTo(null);
		f2.pack();
		f2.setVisible(true);
		
	}
	
	
	private void creationLigne() {
		
		
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
