package fr.eseo.poo.projet.artiste.modele.formes;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public abstract class Forme {

	public static final double LARGEUR_PAR_DEFAUT=100;
	public static final double HAUTEUR_PAR_DEFAUT=180;
	
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
		this(position, LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}	
	public Forme(Coordonnees position, double largeur, double hauteur) {
		this.position = position;
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
		if(getPosition().getAbscisse() < getLargeur()+getPosition().getAbscisse()) {
			return getPosition().getAbscisse();
		}
		else {
			return getLargeur() + getPosition().getAbscisse();
		}		
	}
	
	public double getCadreMinY() {			
		if(getPosition().getOrdonnee() < getHauteur()+getPosition().getOrdonnee()) {
			return getPosition().getOrdonnee();
		}
		else {			
			return getHauteur()+getPosition().getOrdonnee();
		}	
	}
	
	public double getCadreMaxX() {
		if(getPosition().getAbscisse() < getLargeur()+getPosition().getAbscisse()) {
			return getLargeur() + getPosition().getAbscisse();
		}
		else {
			return getPosition().getAbscisse();
		}		
	}
	
	public double getCadreMaxY() {
		if(getPosition().getOrdonnee() < getHauteur()+getPosition().getOrdonnee()) {
			return getHauteur()+getPosition().getOrdonnee();
		}
		else {
			return getPosition().getOrdonnee();
		}	
	}
		
		
	public void setPosition(Coordonnees position){
		this.position.setAbscisse(position.getAbscisse());
		this.position.setOrdonnee(position.getOrdonnee());
	}		
	
	public void setLargeur(double largeur){
		this.largeur=largeur;
	}	
	
	public void setHauteur(double hauteur){
		this.hauteur=hauteur;
	}
	
	public void deplacerDe(double deltaX, double deltaY){
		this.deplacerVers(this.getPosition().getAbscisse() + deltaX, this.getPosition().getOrdonnee() + deltaY);
	}
	
	public void deplacerVers(double x, double y){
		this.getPosition().setAbscisse(x);
        this.getPosition().setOrdonnee(y);		
	}	
	
	
	public abstract double aire();
	public abstract double perimetre();
	
	
}
