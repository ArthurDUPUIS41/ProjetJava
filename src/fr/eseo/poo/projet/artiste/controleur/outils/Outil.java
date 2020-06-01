package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;
import javax.swing.event.MouseInputListener;

public abstract class Outil implements MouseInputListener{

	
	private Coordonnees debut;
	private Coordonnees fin;
	private PanneauDessin panneauDessin;
	
	
	public Coordonnees getDebut() {		
		return this.debut;
	}
	
	
	public Coordonnees getFin() {		
		return this.fin;
	}
	
	
	public void setDebut(Coordonnees debut) {
		this.debut = debut;
	}
	
	
	public void setFin(Coordonnees fin) {
		this.fin = fin;
	}
		
	
	public PanneauDessin getPanneauDessin() {		
		return panneauDessin;
	}
	
	
	public void setPanneauDessin(PanneauDessin panneauDessin) {
		this.panneauDessin = panneauDessin;		
	}
	
	
	public void mouseClicked(MouseEvent event) {
		
	}
	
	
	public void mouseDragged(MouseEvent event) {		
		
	}
	
	
	public void mouseEntered(MouseEvent event) {
				
	}
	
	
	public void mouseExited(MouseEvent event) {
						
	}
	
	
	public void mouseMoved(MouseEvent event) {
		//Coordonnees coordonnees = new Coordonnees((double) event.getX(), (double) event.getY());
		
	}
	
	
	public void mousePressed(MouseEvent event) {		
		Coordonnees coordonnees = new Coordonnees((double) event.getX(), (double) event.getY());	
		setDebut(coordonnees);				
	}
	
	
	public void mouseReleased(MouseEvent event) {
		Coordonnees coordonnees = new Coordonnees((double) event.getX(), (double) event.getY());		
		setFin(coordonnees);
	}
	
	
	
	
	
}
