package fr.eseo.poo.projet.artiste.modele.formes;


// La class Ligne est un extends de la class Forme

import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ligne extends Forme{
	
		 
	public Ligne() {
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}	
	public Ligne(Coordonnees coordonnees) {
		this(coordonnees, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	public Ligne(double largeur, double hauteur) {
		this(new Coordonnees(), largeur, hauteur);
	}	
	public Ligne(Coordonnees coordonnees, double largeur, double hauteur) {
		super(coordonnees, largeur, hauteur);
	}
	
	
	// Retourne la position de la ligne
	public Coordonnees getC1(){
		return getPosition();
	}
	// Retourne la position de la deuxième  extrémité de la ligne
	public Coordonnees getC2(){		
		return (new Coordonnees(getPosition().getAbscisse()+getLargeur(), getPosition().getOrdonnee() + getHauteur()));			
	}
	// Ne déplace que la première extrémité de la ligne
	public void setC1(Coordonnees coordonnees){
		super.setPosition(coordonnees);
		super.setLargeur(this.getC2().getAbscisse() - super.getPosition().getAbscisse());
		super.setHauteur(this.getC2().getOrdonnee() - super.getPosition().getOrdonnee());			
	}
	// Ne déplace que la deuxième extrémité de la ligne
	public void setC2(Coordonnees coordonnees){
		super.setLargeur(coordonnees.getAbscisse() - this.getC1().getAbscisse());
		super.setHauteur(coordonnees.getOrdonnee() - this.getC1().getOrdonnee());		
	}
	
	// Retourne une représentation textuelle de Ligne telle que ci dessous :
	// Voir pdf page 10
	public String toString()
	{		
		DecimalFormat df = new DecimalFormat("##0.0#");		
		return "[Ligne] c1 : ("  
				+ df.format(this.getC1().getAbscisse())	+ " , " 
				+ df.format(this.getC1().getOrdonnee())	+ ") c2 : ("
				+ df.format(this.getC2().getAbscisse())	+ " , " 
				+ df.format(this.getC2().getOrdonnee())	+ ") longueur : "
				+ df.format(this.getC1().distanceVers(this.getC2()))	+ " angle : "
				+ df.format(this.getC2().angleVers(this.getC1())*180/Math.PI +180)	+ "°" ;	
	}
	
	// Retourne 0, par définition des lignes n'ont pas d'aire
	@Override
	public double aire() {		
		return 0;
	}	

	// Retourne la distance entre C1 et C2
	@Override
	public double perimetre() {		
		return getC1().distanceVers(getC2());
	}
	
}
