package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Premiacao;

public class PremiacaoTest {

	Premiacao umaPremiacao;
	
	@Before
	public void setUp() throws Exception {
		umaPremiacao = new Premiacao("umTitulo", 2013);
	}

	@Test
	public void testTistulo(){
	
		assertEquals("umTitulo", umaPremiacao.getTitulo());
	}
	
	@Test
	public void testAno(){
		assertEquals(2013, umaPremiacao.getAno());
	}
	
	@Test
	public void testToString(){
		assertEquals("2013 - umTitulo",umaPremiacao.toString());
	}

}
