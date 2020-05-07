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
	public void  test_air() {
		Cercle Cercle = new Cercle();
		assertEquals(314.16 , Cercle.aire(), EPSILON);		
	}
	@Test
	public void  test_perimetre() {
		Cercle Cercle = new Cercle();
		assertEquals(448.85 , Cercle.perimetre(), EPSILON);			
	}
	@Test
	public void test_toString() {
		Coordonnees p1 = new Coordonnees(1, 2);
		Cercle Cercle = new Cercle(p1, 20);
		assertEquals("Problème test toString", 
				Cercle.toString(), 
				"[Cercle] : (1,0 , 2,0) "
				+ "dim 20,0 x 40,0 "
				+ "périmètre : 96,88 "
				+ "aire : 628,32");		
	}
}
