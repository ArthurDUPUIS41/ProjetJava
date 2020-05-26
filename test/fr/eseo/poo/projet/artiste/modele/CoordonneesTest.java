package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CoordonneesTest{
	private static final double EPSILON = 1e-3d;
	
	@Test
	public void testConstructeurVide() {
		Coordonnees coordonnees1 = new Coordonnees();		
		assertEquals("Fail testConstructeurVide : getAbscisse",		0,		coordonnees1.getAbscisse(),	EPSILON);
		assertEquals("Fail testConstructeurVide : getOrdonnee",		0,		coordonnees1.getOrdonnee(), EPSILON);
	}
	@Test
	public void testConstructeurNegative() {
		Coordonnees coordonnees1 = new Coordonnees(-2, -3);		
		assertEquals("Fail testConstructeurNegative : getAbscisse",	-2,		coordonnees1.getAbscisse(), EPSILON);
		assertEquals("Fail testConstructeurNegative : getOrdonnee",	-3,		coordonnees1.getOrdonnee(), EPSILON);
	}
	@Test
	public void testSetAbcisse() {
		Coordonnees coordonnees1 = new Coordonnees(1, 1);
		coordonnees1.setAbscisse(5);
		assertEquals("Fail testSetAbcisse",		5,	coordonnees1.getAbscisse(),	EPSILON);		
	}	
	@Test
	public void testSetOrdonnee() {
		Coordonnees coordonnees1 = new Coordonnees(1, 1);
		coordonnees1.setOrdonnee(5);
		assertEquals("Fail testSetOrdonnee",	5,	coordonnees1.getOrdonnee(), EPSILON);		
	}	
	@Test
	public void testDeplacerVers() {
		Coordonnees coordonnees1 = new Coordonnees();
		coordonnees1.deplacerVers(1, 2);
		assertEquals("Fail testSetOrdonnee : getAbscisse",		1,	coordonnees1.getAbscisse(), EPSILON);
		assertEquals("Fail testSetOrdonnee : getOrdonnee",		2,	coordonnees1.getOrdonnee(), EPSILON);
	}	
	@Test
	public void testDeplacerDe() {
		Coordonnees coordonnees1 = new Coordonnees(1,2);
		coordonnees1.deplacerDe(2, 3);
		assertEquals("Fail testDeplacerDe : getAbscisse",		3,	coordonnees1.getAbscisse(),	EPSILON);
		assertEquals("Fail testDeplacerDe : getOrdonnee",		5,	coordonnees1.getOrdonnee(), EPSILON);
	}	
	@Test
	public void testDistanceVers() {
		Coordonnees p1 = new Coordonnees(0, 0);
		Coordonnees p2 = new Coordonnees(0, 2);
		assertEquals("Fail testDistanceVers",	2,	p1.distanceVers(p2),	EPSILON);		
	}	
	@Test
	public void testDistanceVersNegative() {
		Coordonnees p1 = new Coordonnees(0, 2);
		Coordonnees p2 = new Coordonnees(0, -4);
		assertEquals("Fail testDistanceVersNegative",	6,	p1.distanceVers(p2),	EPSILON);
	}	
	@Test
	public void testAngleVers() {
		Coordonnees p1 = new Coordonnees(0, 2);
		Coordonnees p2 = new Coordonnees(0, -4);
		assertEquals("Fail testAngleVers",	-1.570,	p1.angleVers(p2), EPSILON);		
	}
	@Test
	public void testToString() {
		Coordonnees coordonnees1 = new Coordonnees(1, 2.22);
		assertEquals("Problème testToString", coordonnees1.toString(), "(1,0 , 2,22)");		
	}	
}
