package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Premiacao;

public class PremiacaoTest {

	Premiacao umaPremiacao;
	
	@Before
	public void setUp() throws Exception {
		umaPremiacao = new Premiacao("Profissional", "Rally dos Sertoes", "Campeao", 2013);
	}

	@Test 
	public void testCategoriaPiloto(){
		assertEquals("Profissional", umaPremiacao.getCategoriaPiloto());
	}
	
	@Test 
	public void testCompeticao(){
		assertEquals("Rally dos Sertoes", umaPremiacao.getCompeticao());
	}
	
	@Test
	public void testTistulo(){
		assertEquals("Campeao", umaPremiacao.getTitulo());
	}
	
	@Test
	public void testAno(){
		assertEquals(2013, umaPremiacao.getAno());
	}
	
	@Test
	public void testToString(){
		assertEquals("2013 - Campeao - Rally dos Sertoes - Profissional",umaPremiacao.toString());
	}

}