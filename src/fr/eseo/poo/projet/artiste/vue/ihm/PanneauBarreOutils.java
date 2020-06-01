package fr.eseo.poo.projet.artiste.vue.ihm;

import javax.swing.JPanel;

import fr.eseo.poo.projet.artiste.controleur.actions.ActionEffacer;

import javax.swing.JButton;


public class PanneauBarreOutils extends JPanel{

	private static final long serialVersionUID = 1L;
	private PanneauDessin panneauDessin;
	
	public PanneauBarreOutils(PanneauDessin panneauDessin) {			
		this.panneauDessin = panneauDessin;
		initComponents();
	}
	
	public void initComponents(){		
		JButton boutonEffacer = new  JButton(new ActionEffacer(panneauDessin));
		boutonEffacer.setName(ActionEffacer.NOM_ACTION);
		this.add(boutonEffacer);
		
	}
	
	
	
	
}
