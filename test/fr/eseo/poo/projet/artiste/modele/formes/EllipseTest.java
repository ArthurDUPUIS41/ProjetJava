package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

//import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class EllipseTest {
	private static final double EPSILON = 0.1;
	
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
	public void  test_air() {
		Ellipse Ellipse = new Ellipse();
		assertEquals(14137.17 , Ellipse.aire(), EPSILON);
		Ellipse Ellipse2 = new Ellipse(180, 100);
		assertEquals(14137.17 , Ellipse2.aire(), EPSILON);	
	}
	@Test
	public void  test_perimetre() {
		Ellipse Ellipse = new Ellipse();
		assertEquals(448.85 , Ellipse.perimetre(), EPSILON);
		Ellipse Ellipse2 = new Ellipse(180, 100);
		assertEquals(448.85, Ellipse2.perimetre(), EPSILON);	
	}
	@Test
	public void test_toString() {
		Coordonnees p1 = new Coordonnees(1, 2);
		Ellipse Ellipse = new Ellipse(p1, 20, 40);
		assertEquals("Problème test toString", 
				Ellipse.toString(), 
				"[Ellipse] : pos (1,0 , 2,0) "
				+ "dim 20,0 x 40,0 "
				+ "périmètre : 96,88 "
				+ "aire : 628,32");		
	}
	
	
	@Test
	public void test_contient() {		
		Coordonnees p1 = new Coordonnees(0.6, 1);
		Ellipse ellipse = new Ellipse(p1, 2.82, 2);
		Coordonnees pC1 = new Coordonnees(1.2, 1.4);
		assertEquals(true, ellipse.contient(pC1));
		Coordonnees pC2 = new Coordonnees(3.4, -0.8);
		assertEquals(false, ellipse.contient(pC2));		
	}
}
