package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Historico;

public class HistoricoTest {

	Historico umHistorico;
	
	@Before
	public void setUp() throws Exception {
		umHistorico = new Historico("Nascar", "de 2010 a 2012");
	}

	@Test
	public void testCategoria() {
		assertEquals("Nascar", umHistorico.getCategoria());
	}
	
	@Test 
	public void testPeriodoDeParticipacao(){
		assertEquals("de 2010 a 2012", umHistorico.getPeriodoDeParticipacao());
	}
	
	@Test
	public void testToString(){
		assertEquals("Correu na categoria Nascar de 2010 a 2012", umHistorico.toString());
	}

}
