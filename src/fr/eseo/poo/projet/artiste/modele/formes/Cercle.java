package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Cercle extends Ellipse {
	
	public Cercle() {
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT);
	}	
	public Cercle(Coordonnees coordonnees) {
		this(coordonnees, LARGEUR_PAR_DEFAUT);
	}	
	public Cercle(double taille) {
		this(new Coordonnees(), taille);
	}
		
	public Cercle(Coordonnees coordonnees, double taille) {
		super(coordonnees, taille, taille);
		if (taille < 0 ) throw new IllegalArgumentException("La taille doive être positive ");
	}
	
	public void setHauteur(double hauteur) {		
		super.setHauteur(hauteur);
		super.setLargeur(hauteur);
		if (hauteur < 0) throw new IllegalArgumentException("La hauteur doiv être positive ");
	}
	public void setLargeur(double largeur) {
		super.setLargeur(largeur);
		super.setHauteur(largeur);
		if (largeur < 0 ) throw new IllegalArgumentException("La largeur doive être positive ");
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.0#");	
		return "[Cercle] : pos ("
			+ df.format(this.getPosition().getAbscisse())	+ " , "
			+ df.format(this.getPosition().getOrdonnee())	+ ") dim "
			+ df.format(this.getLargeur())	+ " x "		
			+ df.format(this.getHauteur())	+ " périmètre : "
			+ df.format(this.perimetre())	+ " aire : "
			+ df.format(this.aire());	
										
//[Cercle] : pos (10,0 , 10,0) dim 25,0 x 15,0 périmètre : 63,82 aire : 294,52
	}

	@Override
	public double perimetre() {		
		return 2 * Math.PI * this.getLargeur() / 2;		
	}
	
	public boolean contient(Coordonnees coordonnees) {
		return super.contient(coordonnees);
	}
	
}
