package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Cercle;
import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;


public class VueEllipseTest {
	
	
	public VueEllipseTest() {
		creationPanel();
		creationLigne();		
	}
	
	private void creationPanel() {
		JFrame f2 = new JFrame("Blues du Businessman");	
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanneauDessin panneauDessin2 = new PanneauDessin(720, 480, new Color(192, 192, 192));	
		
		Ellipse ellipse1	= new Ellipse();		
		VueEllipse vueEllipse1	= new VueEllipse(ellipse1);
		panneauDessin2.ajouterVueForme(vueEllipse1);
		
		// Creation d'une ellipse avec seulement la coordonnes
		Coordonnees c1 			= new Coordonnees(50, 50);
		Ellipse 	ellipse2	= new Ellipse(c1);		
		VueEllipse 	vueEllipse2	= new VueEllipse(ellipse2);
		panneauDessin2.ajouterVueForme(vueEllipse2);
		
		// Creation d'une ellipse avec constructeur coordonnes, hauteur et largeur 
		Ellipse 	ellipse3	= new Ellipse(c1, 300, 200);		
		VueEllipse 	vueEllipse3	= new VueEllipse(ellipse3);
		panneauDessin2.ajouterVueForme(vueEllipse3);
		
		
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
				new VueEllipseTest();
			}
		});
	}
	
	
	
}
