package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Cercle;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;


public class VueCercleTest {
	
	
	public VueCercleTest() {
		creationPanel();
		creationLigne();		
	}
	
	private void creationPanel() {
		JFrame f2 = new JFrame("Blues du Businessman");	
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanneauDessin panneauDessin2 = new PanneauDessin(720, 480, new Color(192, 192, 192));	
		// Creation d'un cercle avec constructeur vide 
		Cercle 		cercle1		= new Cercle();		
		VueCercle 	vueCercle1	= new VueCercle(cercle1);
		panneauDessin2.ajouterVueForme(vueCercle1);
		
		// Creation d'un cercle avec seulement la coordonnes
		Coordonnees c1 			= new Coordonnees(50, 50);
		Cercle 		cercle2		= new Cercle(c1);		
		VueCercle 	vueCercle2	= new VueCercle(cercle2);
		panneauDessin2.ajouterVueForme(vueCercle2);
		
		// Creation d'un cercle avec constructeur coordonnes, hauteur et largeur 
		Cercle 		cercle3		= new Cercle(c1, 200);		
		VueCercle 	vueCercle3	= new VueCercle(cercle3);
		panneauDessin2.ajouterVueForme(vueCercle3);
		
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
				new VueCercleTest();
			}
		});
	}
	
	
	
}
