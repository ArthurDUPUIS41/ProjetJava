package fr.eseo.poo.projet.artiste.modele.formes;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import java.text.DecimalFormat;

public class Ellipse extends Forme {
	
	public Ellipse() {
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}	
	public Ellipse(Coordonnees coordonnees) {
		this(coordonnees, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	public Ellipse(double largeur, double hauteur) {
		this(new Coordonnees(), largeur, hauteur);
	}	
	public Ellipse(Coordonnees coordonnees, double largeur, double hauteur) {
		super(coordonnees, largeur, hauteur);
	}
	
	public void setHauteur(double hauteur) {
		super.setHauteur(hauteur);
	}
	public void setLargeur(double largeur) {
		super.setLargeur(largeur);
	}	
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.0#");	
		return "[Ellipse] : ("
			+ df.format(this.getPosition().getAbscisse())	+ " , "
			+ df.format(this.getPosition().getOrdonnee())	+ ") dim "
			+ df.format(this.getLargeur())	+ " x "		
			+ df.format(this.getHauteur())	+ " périmètre : "
			+ df.format(this.perimetre())	+ " aire : "
			+ df.format(this.aire());	
										
//[Ellipse] : pos (10,0 , 10,0) dim 25,0 x 15,0 périmètre : 63,82 aire : 294,52
	}

	@Override
	public double aire() {
		double a = this.getHauteur() / 2;
		double b = this.getLargeur() / 2;		
		return Math.PI * a * b;		 
	}

	@Override
	public double perimetre() {
		double a;
		double b;
		if(this.getLargeur() < this.getHauteur()) {
			a = super.getLargeur() / 2;
			b = super.getHauteur() / 2;
		}
		else {
			a = super.getHauteur() / 2;
			b = super.getLargeur() / 2;
		}		
		
		double h = Math.pow(((a-b)/(a+b)), 2);
		return Math.PI*(a + b)*(1 + (3*h / (10 + Math.sqrt(4 - 3*h))));
	}

}
