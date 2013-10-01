package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Atleta;

public class AtletaTest {
	
	Atleta umAtleta;

	@Before
	public void setUp() throws Exception {
		umAtleta = new Atleta("Niki Lauda");
	}

	@Test
	public void testNome(){
		assertEquals("Niki Lauda", umAtleta.getNome());
		
	}

}
