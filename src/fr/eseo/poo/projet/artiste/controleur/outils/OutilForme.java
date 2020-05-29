package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

public abstract class OutilForme extends Outil{

		
	
	public void mouseClicked(MouseEvent event) {
		if(event.getClickCount() == 2) {
			this.getPanneauDessin().ajouterVueForme(creerVueForme());
			this.getPanneauDessin().repaint(); // Permet d'actualiser le panneau dessin
		}
		
	}
	
	
	public void mouseReleased(MouseEvent event){
		super.mouseReleased(event);
		if(this.getDebut().getOrdonnee() != this.getFin().getOrdonnee()		||	this.getDebut().getAbscisse() != this.getFin().getAbscisse()){
			this.getPanneauDessin().ajouterVueForme(creerVueForme());
			this.getPanneauDessin().repaint(); // Permet d'actualiser le panneau dessin
		}

		
	}
	protected abstract VueForme creerVueForme();
}
