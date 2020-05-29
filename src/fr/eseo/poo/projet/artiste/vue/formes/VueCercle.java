package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Cercle;

public class VueCercle extends VueEllipse{
	
	public VueCercle(Cercle cercle){
		super(cercle);
	}
	
	
	
	@Override
	public void affiche(Graphics2D g2d) {
		Cercle monCercle = (Cercle) this.forme;	
		
		g2d.drawOval((int) monCercle.getPosition().getAbscisse(), (int) monCercle.getPosition().getOrdonnee(), (int) monCercle.getLargeur(), (int) monCercle.getHauteur());
		
	}	
	
	
}
