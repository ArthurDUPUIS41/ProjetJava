package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


import fr.eseo.poo.projet.artiste.controleur.outils.Outil;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;

import java.util.ArrayList;
import java.util.List;

//import javax.swing.UIManager;

public class PanneauDessin extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public static final int LARGEUR_PAR_DEFAUT = 450;
	public static final int HAUTEUR_PAR_DEFAUT = 250;
	public static final Color COULEUR_FOND_PAR_DEFAUT = new Color(192, 192, 192); //lightGray
	
	// Initialisation de la liste "vueFormes" qui contiendra toutes les formes"
	private final List<VueForme> vueFormes = new ArrayList<VueForme>();
	
	private Outil outilCourant;
	
	public PanneauDessin(){
		this.setBackground(COULEUR_FOND_PAR_DEFAUT);
		this.setPreferredSize(new Dimension(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT));
	}	
	
	public PanneauDessin(int largeur, int hauteur, Color couleur){
		super.setBackground(couleur);
		super.setPreferredSize(new Dimension(largeur, hauteur));
	}
	
	// Permet de récuppérer la listes des formes enregistrées
	public List<VueForme> getVueFormes() {
		if (vueFormes.isEmpty()) {			
			System.out.println("Liste vide");			 
		}
		return vueFormes;
		
	}
	
	
	public void ajouterVueForme(VueForme vueForme) {
		vueFormes.add(vueForme);	
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);//
		/* Le paramètre g de la méthode paint est converti//
		* en un Graphics2D grâce à un transtypage (cast)
		* explicite
		*/
		Graphics2D g2D = (Graphics2D)g.create();
		for(VueForme uneVueForme : this.vueFormes) {
			uneVueForme.affiche(g2D);
		}
		/*
		 *  On utililse l’instance de Graphics2D*/
		// ...
		/* Enfin on libère la memoire utilisé par
		* l’instance de Graphics2D
		*/
		g2D.dispose();
		
	}
	

	public void associerOutil(Outil outil){
		if(getOutilCourant() != null) {
			dissocierOutil();
		}
		this.outilCourant = outil;		
	}
	private void dissocierOutil(){
		getOutilCourant().setPanneauDessin(null);
		removeMouseListener(outilCourant);
		removeMouseMotionListener(outilCourant);
		setOutilCourant(null);				
	}
	
	public Outil getOutilCourant() {		
		return this.outilCourant;
	}
	
	private void setOutilCourant(Outil outil) {
		this.outilCourant = outil;		
	}
	
	
	
	
	
	
	
	
	
}
