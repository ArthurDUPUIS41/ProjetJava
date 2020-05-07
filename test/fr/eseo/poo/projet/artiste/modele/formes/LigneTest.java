package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;


public class LigneTest {
	private static final double EPSILON = 1e-3d;
	
	@Test
	public void testConstructeur_Vide() {		
		Ligne ligne1 = new Ligne();
		assertEquals(0, ligne1.getC1().getAbscisse(), EPSILON);
		assertEquals(0, ligne1.getC1().getOrdonnee(), EPSILON);		
		assertEquals(100, ligne1.getC2().getAbscisse(), EPSILON);
		assertEquals(180, ligne1.getC2().getOrdonnee(), EPSILON);		
		assertEquals(100, ligne1.getLargeur(), EPSILON);
		assertEquals(180, ligne1.getHauteur(), EPSILON);
	}	
	@Test
	public void testConstructeur_coordonnees() {
		Coordonnees p1 = new Coordonnees(1, 2);
		Ligne ligne1 = new Ligne(p1);
		assertEquals(1, ligne1.getC1().getAbscisse(), EPSILON);
		assertEquals(2, ligne1.getC1().getOrdonnee(), EPSILON);		
		assertEquals(101, ligne1.getC2().getAbscisse(), EPSILON);
		assertEquals(182, ligne1.getC2().getOrdonnee(), EPSILON);		
		assertEquals(100, ligne1.getLargeur(), EPSILON);
		assertEquals(180, ligne1.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_largeur_hauteur() {
		//Coordonnees p1 = new Coordonnees(1, 2);
		Ligne ligne1 = new Ligne(2, 3);
		assertEquals(0, ligne1.getC1().getAbscisse(), EPSILON);
		assertEquals(0, ligne1.getC1().getOrdonnee(), EPSILON);		
		assertEquals(2, ligne1.getC2().getAbscisse(), EPSILON);
		assertEquals(3, ligne1.getC2().getOrdonnee(), EPSILON);		
		assertEquals(2, ligne1.getLargeur(), EPSILON);
		assertEquals(3, ligne1.getHauteur(), EPSILON);
	}
	@Test
	public void testConstructeur_coordonnees_largeur_hauteur() {
		Coordonnees p1 = new Coordonnees(1, 2);
		Ligne ligne1 = new Ligne(p1, 2, 3);
		assertEquals(1, ligne1.getC1().getAbscisse(), EPSILON);
		assertEquals(2, ligne1.getC1().getOrdonnee(), EPSILON);		
		assertEquals(3, ligne1.getC2().getAbscisse(), EPSILON);
		assertEquals(5, ligne1.getC2().getOrdonnee(), EPSILON);		
		assertEquals(2, ligne1.getLargeur(), EPSILON);
		assertEquals(3, ligne1.getHauteur(), EPSILON);
	}
		
	@Test
	public void test_setC1() {		
		Ligne ligne1 = new Ligne();
		Coordonnees p1 = new Coordonnees(1, 2);
		ligne1.setC1(p1);
		assertEquals(1, ligne1.getC1().getAbscisse(), EPSILON);
		assertEquals(2, ligne1.getC1().getOrdonnee(), EPSILON);		
	}
	@Test
	public void test_setC2() {		
		Ligne ligne1 = new Ligne();
		Coordonnees p1 = new Coordonnees(1, 2);
		ligne1.setC2(p1);
		assertEquals(1, ligne1.getC2().getAbscisse(), EPSILON);
		assertEquals(2, ligne1.getC2().getOrdonnee(), EPSILON);		
	}
	
	@Test
	public void test_toString() {		
		Coordonnees p1 = new Coordonnees(1.5, 4.5);
		Ligne ligne1 = new Ligne(p1, 2, -2);
		assertEquals("Problème test toString", ligne1.toString(), "[Ligne] c1 : (1,5 , 4,5) c2 : (3,5 , 2,5) longueur : 2,83 angle : 315,0°");		
	}
	
	@Test
	public void test_aire() {
		Ligne ligne1 = new Ligne();
		assertEquals(0, ligne1.aire(), EPSILON);
	}
	
	@Test
	public void test_perimetre() {
		Ligne ligne1 = new Ligne();
		assertEquals(205.912, ligne1.perimetre(), EPSILON);
	}
	
	
	
	
	
	
}
