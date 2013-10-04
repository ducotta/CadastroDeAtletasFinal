package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Historico;

public class HistoricoTest {

	Historico umHistorico;
	
	@Before
	public void setUp() throws Exception {
		umHistorico = new Historico("Profissional","Nascar", "2010-2012");
	}

	@Test
	public void testCategoriaPiloto(){
		assertEquals("Profissional", umHistorico.getCategoriaPiloto());
	}
	
	@Test
	public void testCompeticao() {
		assertEquals("Nascar", umHistorico.getCompeticao());
	}
	
	@Test 
	public void testPeriodoDeParticipacao(){
		assertEquals("2010-2012", umHistorico.getPeriodoDeParticipacao());
	}
	
	@Test
	public void testToString(){
		assertEquals("Correu como Profissional na categoria Nascar em 2010-2012", umHistorico.toString());
	}

}
