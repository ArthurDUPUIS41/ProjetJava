package fr.eseo.poo.projet.artiste.modele.formes;


// La class Ligne est un extends de la class Forme

import java.text.DecimalFormat;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ligne extends Forme{
	
	
	public static final double EPSILON = 1e-1d;
	
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
		return this.getPosition();
	}
	// Retourne la position de la deuxième  extrémité de la ligne
	public Coordonnees getC2(){		
		return (new Coordonnees(this.getC1().getAbscisse()+this.getLargeur(), this.getC1().getOrdonnee() + this.getHauteur()));			
	}
	// Ne déplace que la première extrémité de la ligne	
	public void setC1(Coordonnees coordonnees){
        this.setLargeur(this.getC2().getAbscisse() - coordonnees.getAbscisse());
        this.setHauteur(this.getC2().getOrdonnee() - coordonnees.getOrdonnee());
        this.setPosition(coordonnees);
    }
	
	
	// Ne déplace que la deuxième extrémité de la ligne
	public void setC2(Coordonnees coordonnees){
		this.setLargeur(coordonnees.getAbscisse() - this.getC1().getAbscisse());
		this.setHauteur(coordonnees.getOrdonnee() - this.getC1().getOrdonnee());		
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
				+ df.format(this.getC1().distanceVers(	this.getC2()))	+ " angle : "
				+ df.format(this.getC2().angleVers(		this.getC1())*180/Math.PI +180)	+ "°" ;	
	}
	
	// Retourne 0, par définition des lignes n'ont pas d'aire
	@Override
	public double aire() {		
		return 0;
	}	

	// Retourne la distance entre C1 et C2
	@Override
	public double perimetre() {		
		return this.getC1().distanceVers(this.getC2());
	}
	
	
	
	public boolean contient(Coordonnees coordonnees) {
				
		double distanceC1_C =	Math.sqrt(	Math.pow(coordonnees.getAbscisse() 	- this.getC1().getAbscisse(),	 2) 
										+ 	Math.pow(coordonnees.getOrdonnee() 	- this.getC1().getOrdonnee(),	 2));
		
		double distanceC2_C =	Math.sqrt(	Math.pow(coordonnees.getAbscisse()  - this.getC2().getAbscisse(),	 2) 
										+ 	Math.pow(coordonnees.getOrdonnee()  - this.getC2().getOrdonnee(),	 2));
		
		double distanceC1_C2 =	Math.sqrt(	Math.pow(this.getC1().getAbscisse() - this.getC2().getAbscisse(),	 2) 
										+ 	Math.pow(this.getC1().getOrdonnee() - this.getC2().getOrdonnee(),	 2));
		
		//return (distanceC1_C + distanceC2_C) - distanceC1_C2;
		if( (distanceC1_C + distanceC2_C) - distanceC1_C2 <=  EPSILON ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	
}
