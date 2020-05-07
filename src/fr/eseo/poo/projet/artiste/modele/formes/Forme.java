package fr.eseo.poo.projet.artiste.modele.formes;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public abstract class Forme {

	public static final double LARGEUR_PAR_DEFAUT=10;
	public static final double HAUTEUR_PAR_DEFAUT=10;
	
	private double largeur, hauteur;
	private Coordonnees position;
	
	//////////////////////////////////////////////////////////////////////
	//Constructeur : 
	public Forme()	{
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}	
	public Forme(double largeur, double hauteur) {
		this(new Coordonnees(), largeur, hauteur);
	}	
	public Forme(Coordonnees position) {
		this(position,LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}	
	public Forme(Coordonnees position, double largeur, double hauteur) {
		setPosition(position);
		setLargeur(largeur);
		setHauteur(hauteur);		
	}
	
	
	public Coordonnees getPosition(){
		return this.position;
	}	
	public double getLargeur(){
		return this.largeur;
	}	
	public double getHauteur(){
		return this.hauteur;
	}
	
	
	public double getCadreMinX() {				
		return getPosition().getAbscisse();
	}
	public double getCadreMinY() {			
		return getPosition().getOrdonnee();
	}
	public double getCadreMaxX() {		
		return this.position.getAbscisse() + this.largeur;
	}
	public double getCadreMaxY() {		
		return getPosition().getOrdonnee() + this.hauteur;
	}
		
		
	public void setPosition(Coordonnees position){
		this.position=position;
	}		
	
	public void setLargeur(double largeur){
		this.largeur=largeur;
	}	
	
	public void setHauteur(double hauteur){
		this.hauteur=hauteur;
	}
	
	public void deplacerDe(double deltaX, double deltaY){
		getPosition().deplacerDe(deltaX,deltaY);
	}
	
	public void deplacerVers(double x, double y){
		getPosition().deplacerVers(x,y);
	}	
	
	
	public abstract double aire();
	public abstract double perimetre();
	
	
}
