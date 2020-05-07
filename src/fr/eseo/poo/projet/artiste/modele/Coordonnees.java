package fr.eseo.poo.projet.artiste.modele;

import java.text.DecimalFormat;

public class Coordonnees {
	
	public static final double ABSCISSE_PAR_DEFAUT = 0.0;
	public static final double ORDONNEE_PAR_DEFAUT = 0.0;
	
	private double abscisse;
	private double ordonnee;	
	
	public Coordonnees(){		
		this.abscisse=0;
		this.ordonnee=0;
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
		this.abscisse = this.abscisse + deltaX;
		this.ordonnee = this.ordonnee + deltaY;
		//System.out.println("deplacerDe x: " + this.x + " y: " + this.y);
	}	
	
	public void deplacerVers(double abscisse, double ordonnee){
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	
	public double distanceVers(Coordonnees coord){			
		 return Math.sqrt(Math.pow(coord.getAbscisse() - this.getAbscisse(), 2) 
	 					+ Math.pow(coord.getOrdonnee() - this.getOrdonnee(), 2));
	}
	
	public double angleVers(Coordonnees coord){
		return -Math.atan2(this.getOrdonnee() - coord.getOrdonnee(), 
						coord.getAbscisse() - this.getAbscisse());
	}		
	
	public String toString()
	{
		return "(" + new DecimalFormat("##0.0#").format(this.getAbscisse()) + " , " + new DecimalFormat("##0.0#").format(this.getOrdonnee()) + ")";		
	}
}
