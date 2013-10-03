package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.PilotoAutomotivo;

public class PilotoAutomotivoTest {

	PilotoAutomotivo umPiloto;
	
	@Before
	public void setUp() throws Exception {
		umPiloto = new PilotoAutomotivo("Ayrton Senna");
	}

	@Test
	public void tesCategoriaPiloto() {
		umPiloto.setCategoriaPiloto('P');
		assertEquals('P', umPiloto.getCategoriaPiloto());
	}
	
	@Test
	public void testCategoriaCorrida(){
		umPiloto.setCategoriaCorrida("Formula 1");
		assertEquals("Formula 1", umPiloto.getCategoriaCorrida());
	}

}
