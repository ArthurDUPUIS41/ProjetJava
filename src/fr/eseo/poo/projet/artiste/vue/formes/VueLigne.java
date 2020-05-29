package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;



public class VueLigne extends VueForme{	

	public VueLigne(Ligne ligne){
		super(ligne);
	}
	
	
	
	@Override
	public void affiche(Graphics2D g2d) {
		Ligne maLigne = (Ligne) this.forme;
		g2d.drawLine((int) maLigne.getC1().getAbscisse(), (int) maLigne.getC1().getOrdonnee(), (int) maLigne.getC2().getAbscisse(), (int) maLigne.getC2().getOrdonnee());
		
	}	
	
}
