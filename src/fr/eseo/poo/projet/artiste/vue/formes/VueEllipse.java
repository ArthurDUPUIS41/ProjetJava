package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;

public class VueEllipse extends VueForme{
	
	public VueEllipse(Ellipse ellipse){
		super(ellipse);
	}
	
	
	
	@Override
	public void affiche(Graphics2D g2d) {
		Ellipse monEllipse = (Ellipse) this.forme;
		
		
		g2d.drawOval((int) monEllipse.getPosition().getAbscisse(), (int) monEllipse.getPosition().getOrdonnee(), (int) monEllipse.getLargeur(), (int) monEllipse.getHauteur());
		
	}	
	
	
}
