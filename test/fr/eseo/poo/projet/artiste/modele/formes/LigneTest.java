package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;


public class LigneTest {
	private static final double EPSILON = 1e-3d;
	
	@Test
	public void testConstructeur_Vide() {		
		Ligne ligne1	= new Ligne();
		assertEquals("Fail testConstructeur_Vide : getC1.Abscisse",	0,	 ligne1.getC1().getAbscisse(),	 EPSILON);
		assertEquals("Fail testConstructeur_Vide : getC1.Ordonnee", 0,	 ligne1.getC1().getOrdonnee(),	 EPSILON);		
		assertEquals("Fail testConstructeur_Vide : getC2.Abscisse", 100, ligne1.getC2().getAbscisse(),	 EPSILON);
		assertEquals("Fail testConstructeur_Vide : getC2.Ordonnee", 180, ligne1.getC2().getOrdonnee(),	 EPSILON);		
		assertEquals("Fail testConstructeur_Vide : getLargeur", 	100, ligne1.getLargeur(),			 EPSILON);
		assertEquals("Fail testConstructeur_Vide : getHauteur", 	180, ligne1.getHauteur(),			 EPSILON);
	}	
	@Test
	public void testConstructeur_coordonnees() {
		Coordonnees p1	= new Coordonnees(1, 2);
		Ligne ligne1	= new Ligne(p1);
		assertEquals("Fail testConstructeur_coordonnees : getC1.Abscisse",	1,   ligne1.getC1().getAbscisse(),	 EPSILON);
		assertEquals("Fail testConstructeur_coordonnees : getC1.Ordonnee",	2, 	 ligne1.getC1().getOrdonnee(), 	 EPSILON);		
		assertEquals("Fail testConstructeur_coordonnees : getC2.Abscisse",	101, ligne1.getC2().getAbscisse(),	 EPSILON);
		assertEquals("Fail testConstructeur_coordonnees : getC2.Ordonnee",	182, ligne1.getC2().getOrdonnee(), 	 EPSILON);		
		assertEquals("Fail testConstructeur_coordonnees : getLargeur",		100, ligne1.getLargeur(),			 EPSILON);
		assertEquals("Fail testConstructeur_coordonnees : getHauteur",		180, ligne1.getHauteur(),			 EPSILON);
	}
	@Test
	public void testConstructeur_largeur_hauteur() {		
		Ligne ligne1 	= new Ligne(2, 3);
		assertEquals("Fail testConstructeur_largeur_hauteur : getC1.Abscisse", 	0, 	 ligne1.getC1().getAbscisse(), 	 EPSILON);
		assertEquals("Fail testConstructeur_largeur_hauteur : getC1.Ordonnee",	0,   ligne1.getC1().getOrdonnee(), 	 EPSILON);		
		assertEquals("Fail testConstructeur_largeur_hauteur : getC2.Abscisse",	2,   ligne1.getC2().getAbscisse(), 	 EPSILON);
		assertEquals("Fail testConstructeur_largeur_hauteur : getC2 Ordonnee",	3,   ligne1.getC2().getOrdonnee(), 	 EPSILON);		
		assertEquals("Fail testConstructeur_largeur_hauteur : getLargeur", 		2,   ligne1.getLargeur(), 			 EPSILON);
		assertEquals("Fail testConstructeur_largeur_hauteur : getHauteur",		3,   ligne1.getHauteur(), 			 EPSILON);
	}
	@Test
	public void testConstructeur_coordonnees_largeur_hauteur() {
		Coordonnees p1 	= new Coordonnees(1, 2);
		Ligne ligne1 	= new Ligne(p1, 2, 3);
		assertEquals("Fail testConstructeur_coordonnees_largeur_hauteur : getC1.Abscisse",	1, ligne1.getC1().getAbscisse(), EPSILON);
		assertEquals("Fail testConstructeur_coordonnees_largeur_hauteur : getC1.Ordonnee",	2, ligne1.getC1().getOrdonnee(), EPSILON);		
		assertEquals("Fail testConstructeur_coordonnees_largeur_hauteur : getC2.Abscisse", 	3, ligne1.getC2().getAbscisse(), EPSILON);
		assertEquals("Fail testConstructeur_coordonnees_largeur_hauteur : getC2.Ordonnee", 	5, ligne1.getC2().getOrdonnee(), EPSILON);		
		assertEquals("Fail testConstructeur_coordonnees_largeur_hauteur : getLargeur",		2, ligne1.getLargeur(), 		 EPSILON);
		assertEquals("Fail testConstructeur_coordonnees_largeur_hauteur : getHauteur",		3, ligne1.getHauteur(), 		 EPSILON);
	}
		
	@Test
	public void test_setC1() {		
		Ligne ligne1 = new Ligne();
		Coordonnees p1 = new Coordonnees(1, 2);
		ligne1.setC1(p1);
		assertEquals("Fail test_setC1 : getC1.getAbscisse",	1,	ligne1.getC1().getAbscisse(),	EPSILON);
		assertEquals("Fail test_setC1 : getC1.getOrdonne",	2,	ligne1.getC1().getOrdonnee(),	EPSILON);		
	}
	@Test
	public void test_setC2() {		
		Ligne ligne1 = new Ligne();
		Coordonnees p1 = new Coordonnees(1, 2);
		ligne1.setC2(p1);
		assertEquals("Fail test_setC2 : getC1.getAbscisse",	1,	ligne1.getC2().getAbscisse(),	EPSILON);
		assertEquals("Fail test_setC2 : getC1.getOrdonne",	2,	ligne1.getC2().getOrdonnee(),	EPSILON);		
	}
	
	@Test
	public void test_toString() {		
		Coordonnees p1 = new Coordonnees(1.5, 4.5);
		Ligne ligne1 = new Ligne(p1, 2, -2);
		assertEquals("Fail test toString", ligne1.toString(), "[Ligne] c1 : (1,5 , 4,5) c2 : (3,5 , 2,5) longueur : 2,83 angle : 315,0°");		
	}
	
	@Test
	public void test_aire() {
		Ligne ligne1 = new Ligne();
		assertEquals("Fail test_aire",	0,	ligne1.aire(),	EPSILON);
	}
	
	@Test
	public void test_perimetre() {
		Ligne ligne1 = new Ligne();
		assertEquals("Fail test_perimetre", 205.912, ligne1.perimetre(), EPSILON);
	}
	
	@Test
	public void test_contient() {		
		Coordonnees p1	= new Coordonnees(1, 1);
		Ligne ligne1	= new Ligne(p1, 2, 2);
		Coordonnees pC1	= new Coordonnees(2, 2.5);
		Coordonnees pC2 = new Coordonnees(3, 2.5);
		assertEquals("Fail test_contient",	true,	ligne1.contient(pC1));		
		assertEquals("Fail test_contient",	false,	ligne1.contient(pC2));		
	}
	
	
}
