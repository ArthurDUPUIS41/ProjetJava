package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Forme;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public abstract class OutilForme extends Outil{

		
	//copyright avec le prof
	public void mouseClicked(MouseEvent event) {				
		setDebut(new Coordonnees(event.getX(), event.getY()));
		setFin(new Coordonnees(getDebut().getAbscisse() + Forme.LARGEUR_PAR_DEFAUT, getDebut().getOrdonnee() + Forme.HAUTEUR_PAR_DEFAUT));
		
		if(event.getClickCount() == 2) {			
			this.getPanneauDessin().ajouterVueForme(creerVueForme());
			this.getPanneauDessin().repaint(); // Permet d'actualiser le panneau dessin
		}
		
	}
	
	//copyright avec Ewen
	public void mouseReleased(MouseEvent event){
		super.mouseReleased(event);
		if(super.getDebut().getOrdonnee() != this.getFin().getOrdonnee()		||	this.getDebut().getAbscisse() != this.getFin().getAbscisse()){
			this.getPanneauDessin().ajouterVueForme(creerVueForme());
			this.getPanneauDessin().repaint(); // Permet d'actualiser le panneau dessin
		}

		
	}
	
	public void mousePressed(MouseEvent even) {
		super.mousePressed(even);
	}
	
	protected abstract VueForme creerVueForme();
}
