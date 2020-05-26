package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class CercleTest {

	private static final double EPSILON = 1e-2d;
	
	@Test
	public void testConstructeur_Vide() {	
		Cercle Cercle = new Cercle();
		assertEquals(0, Cercle.getPosition().getAbscisse(), EPSILON);
		assertEquals(0, Cercle.getPosition().getOrdonnee(), EPSILON);
		assertEquals(100, Cercle.getLargeur(), EPSILON);
		assertEquals(100, Cercle.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_coordonnees() {
		Coordonnees p1 = new Coordonnees(1, 1);
		Cercle Cercle = new Cercle(p1);
		assertEquals(1, Cercle.getPosition().getAbscisse(), EPSILON);
		assertEquals(1, Cercle.getPosition().getOrdonnee(), EPSILON);
		assertEquals(100, Cercle.getLargeur(), EPSILON);
		assertEquals(100, Cercle.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_largeur() {	
		Cercle Cercle = new Cercle(10);
		assertEquals(0, Cercle.getPosition().getAbscisse(), EPSILON);
		assertEquals(0, Cercle.getPosition().getOrdonnee(), EPSILON);
		assertEquals(10, Cercle.getLargeur(), EPSILON);
		assertEquals(10, Cercle.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_coordonnees_largeur() {	
		Coordonnees p1 = new Coordonnees(1, 1);
		Cercle Cercle = new Cercle(p1, 10);
		assertEquals(1, Cercle.getPosition().getAbscisse(), EPSILON);
		assertEquals(1, Cercle.getPosition().getOrdonnee(), EPSILON);
		assertEquals(10, Cercle.getLargeur(), EPSILON);
		assertEquals(10, Cercle.getHauteur(), EPSILON);
	}
	
	@Test
	public void testConstructeur_coordonnees_largeur_negative() {	
		Coordonnees p1 = new Coordonnees(1, 1);
		Cercle Cercle = new Cercle(p1, 10);
		assertEquals(1, Cercle.getPosition().getAbscisse(), EPSILON);
		assertEquals(1, Cercle.getPosition().getOrdonnee(), EPSILON);
		assertEquals(10, Cercle.getLargeur(), EPSILON);
		assertEquals(10, Cercle.getHauteur(), EPSILON);
	}
	
	
	@Test
	public void  test_air() {
		Cercle Cercle = new Cercle();
		assertEquals(7853.98 , Cercle.aire(), EPSILON);		
	}
	@Test
	public void  test_perimetre() {
		Cercle Cercle = new Cercle();
		assertEquals(314.16 , Cercle.perimetre(), EPSILON);			
	}
	@Test
	public void test_toString() {
		Coordonnees p1 = new Coordonnees(1, 2);
		Cercle Cercle = new Cercle(p1, 20);
		assertEquals("Problème test toString", 
				Cercle.toString(), 
				"[Cercle] : pos (1,0 , 2,0) "
				+ "dim 20,0 x 20,0 "
				+ "périmètre : 62,83 "
				+ "aire : 314,16");		
	}
	
	@Test
	public void test_contient() {		
		Coordonnees p1 = new Coordonnees(0.5, -0.5);
		Cercle cercle = new Cercle(p1, 1);
		Coordonnees pC1 = new Coordonnees(1.2, 0.2);
		assertEquals(true, cercle.contient(pC1));
		Coordonnees pC2 = new Coordonnees(1.2, -0.5);
		assertEquals(false, cercle.contient(pC2));		
	}
}
