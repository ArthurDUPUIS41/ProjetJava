package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionEffacer extends AbstractAction{
	
	private static final long serialVersionUID = 1L;
	public static final String NOM_ACTION = "Effacer dessin";
	private PanneauDessin panneauMain;
	
	public ActionEffacer(PanneauDessin panneauDessin){	
		super(NOM_ACTION);
		this.panneauMain = panneauDessin;
	}
	
	public void actionPerformed(ActionEvent event) {
		int optionPane = JOptionPane.showConfirmDialog(panneauMain, "Voulez vous tout effacer ?\n", NOM_ACTION, JOptionPane.YES_NO_OPTION);
		
		//Si l'utilisateur appuie sur le bouton OUI 
		if(optionPane == 0) {						
			panneauMain.getVueFormes().clear();
			this.panneauMain.repaint();
		}		
	}
	
	
}
