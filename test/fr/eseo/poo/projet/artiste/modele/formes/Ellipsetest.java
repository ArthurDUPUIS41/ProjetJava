package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

//import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ellipsetest {
	private static final double EPSILON = 1e-3d;
	
	@Test
	public void testConstructeur_Vide() {	
		Ellipse Ellipse = new Ellipse();
		assertEquals(0, Ellipse.getPosition().getAbscisse(), EPSILON);
		assertEquals(0, Ellipse.getPosition().getOrdonnee(), EPSILON);
		assertEquals(100, Ellipse.getLargeur(), EPSILON);
		assertEquals(180, Ellipse.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_coordonnees() {
		Coordonnees p1 = new Coordonnees(1, 1);
		Ellipse Ellipse = new Ellipse(p1);
		assertEquals(1, Ellipse.getPosition().getAbscisse(), EPSILON);
		assertEquals(1, Ellipse.getPosition().getOrdonnee(), EPSILON);
		assertEquals(100, Ellipse.getLargeur(), EPSILON);
		assertEquals(180, Ellipse.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_largeur_hauteur() {	
		Ellipse Ellipse = new Ellipse(10,20);
		assertEquals(0, Ellipse.getPosition().getAbscisse(), EPSILON);
		assertEquals(0, Ellipse.getPosition().getOrdonnee(), EPSILON);
		assertEquals(10, Ellipse.getLargeur(), EPSILON);
		assertEquals(20, Ellipse.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_coordonnees_largeur_hauteur() {	
		Coordonnees p1 = new Coordonnees(1, 1);
		Ellipse Ellipse = new Ellipse(p1, 10, 20);
		assertEquals(1, Ellipse.getPosition().getAbscisse(), EPSILON);
		assertEquals(1, Ellipse.getPosition().getOrdonnee(), EPSILON);
		assertEquals(10, Ellipse.getLargeur(), EPSILON);
		assertEquals(20, Ellipse.getHauteur(), EPSILON);
	}
	
	
	@Test
	
	
	
	
	


}
