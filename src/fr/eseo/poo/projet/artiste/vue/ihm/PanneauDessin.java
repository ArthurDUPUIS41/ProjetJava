package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.util.List;

//import javax.swing.UIManager;

public class PanneauDessin extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public static final int LARGEUR_PAR_DEFAUT = 450;
	public static final int HAUTEUR_PAR_DEFAUT = 250;
	public static final Color COULEUR_FOND_PAR_DEFAUT = new Color(192, 192, 192); //lightGray
	

		
	
	public PanneauDessin(){
		this.setBackground(COULEUR_FOND_PAR_DEFAUT);
		this.setPreferredSize(new Dimension(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT));
	}	
	
	public PanneauDessin(int largeur, int hauteur, Color couleur){
		super.setBackground(couleur);
		super.setPreferredSize(new Dimension(largeur, hauteur));
	}
	
	public getVueFormes() {
		
		
	}
	
	
	public ajouterVueForme() {
		
		
		
	}
	
	
	
	
	
}
