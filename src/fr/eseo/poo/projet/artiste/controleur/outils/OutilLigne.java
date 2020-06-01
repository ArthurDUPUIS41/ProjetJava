package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;
import fr.eseo.poo.projet.artiste.vue.formes.VueLigne;

public class OutilLigne extends OutilForme{

	protected VueForme creerVueForme(){		
		
		double largeur =  this.getFin().getAbscisse() - this.getDebut().getAbscisse();
		double hauteur =  this.getFin().getOrdonnee() - this.getDebut().getOrdonnee();
				
		Ligne ligne	= new Ligne(this.getDebut(), largeur, hauteur);		
		VueLigne vueLigne	= new VueLigne(ligne);
		return vueLigne;
	}
	
	
}
