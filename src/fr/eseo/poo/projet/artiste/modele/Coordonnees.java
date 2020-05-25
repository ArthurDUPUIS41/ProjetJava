package fr.eseo.poo.projet.artiste.modele;

import java.text.DecimalFormat;

public class Coordonnees {
	
	public static final double ABSCISSE_PAR_DEFAUT = 0.0;
	public static final double ORDONNEE_PAR_DEFAUT = 0.0;
	
	private double abscisse;
	private double ordonnee;	
	
	public Coordonnees(){		
		this.abscisse= ABSCISSE_PAR_DEFAUT;
		this.ordonnee= ORDONNEE_PAR_DEFAUT;
	}
	
	public Coordonnees(double abscisse, double ordonnee){				
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;		
	}
	
	public double getAbscisse(){
		return this.abscisse;
	}
	
	public double getOrdonnee(){
		return this.ordonnee;
	}	
	
	public void setAbscisse(double abcisse){
		this.abscisse = abcisse;
	}
	
	public void setOrdonnee(double ordonne){
		this.ordonnee = ordonne;
	}	
	
	public void deplacerDe(double deltaX, double deltaY){
		this.deplacerVers(this.getAbscisse() + deltaX, this.getOrdonnee() + deltaY);
		//System.out.println("deplacerDe x: " + this.x + " y: " + this.y);
	}	
	
	public void deplacerVers(double abscisse, double ordonnee){
		this.setAbscisse(abscisse);
        this.setOrdonnee(ordonnee);
	}
	
	public double distanceVers(Coordonnees coordonnees){			
		 return Math.sqrt(Math.pow(coordonnees.getAbscisse() - this.getAbscisse(), 2) 
	 					+ Math.pow(coordonnees.getOrdonnee() - this.getOrdonnee(), 2));
	}
	
	public double angleVers(Coordonnees coordonnees){
		return -Math.atan2(this.getOrdonnee() - coordonnees.getOrdonnee(), 
				coordonnees.getAbscisse() - this.getAbscisse());
	}		
	
	public String toString()
	{
		return "(" + new DecimalFormat("##0.0#").format(this.getAbscisse()) + " , " + new DecimalFormat("##0.0#").format(this.getOrdonnee()) + ")";		
	}
}
