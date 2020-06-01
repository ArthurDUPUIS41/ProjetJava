package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionEffacer extends AbstractAction{
	
	public static final String NOM_ACTION = null;
	
	public ActionEffacer(PanneauDessin panneauDessin){	
		super(NOM_ACTION);
	}
	
	public void actionPerformed(ActionEvent event) {
		final  optionPane = new ("Voulez vous tout effacer ?\n", NOM_ACTION, 
			    										JOptionPane.QUESTION_MESSAGE,
		    											JOptionPane.YES_NO_OPTION);	
		
	}
	
	
}
