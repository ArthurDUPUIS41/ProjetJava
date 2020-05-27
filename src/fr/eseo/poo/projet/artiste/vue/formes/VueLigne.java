package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;

public class VueLigne extends VueForme{
	
	protected final Ligne ligne;

	public VueLigne(Ligne ligne){
		this.ligne = ligne;		
	}

	@Override
	public void affiche(Graphics2D g2d) {		
		
		Graphics2D g2 = (Graphics2D)g2d.create();		
		
		int x1 = (int)(getForme().getPosition().getAbscisse());
		int y1 = (int)(getForme().getPosition().getOrdonnee());;
		int x2 = (int)(getForme().getPosition().getAbscisse() + getForme().getLargeur());;
		int y2 = (int)(getForme().getPosition().getAbscisse() + getForme().getHauteur());;
		
		g2.drawLine(x1, y1, x2, y2);
		g2.dispose();
		
	}	
	
}
