package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.ControlePilotoAutomotivo;
import controleDeAtletas.PilotoAutomotivo;

public class ControlePilotoAutomotivoTest {
	
	ControlePilotoAutomotivo umControle;
	private ArrayList<PilotoAutomotivo> listaPilotos;
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		PilotoAutomotivo umPiloto = new PilotoAutomotivo("James Hunt");
		assertEquals("James Hunt", listaPilotos.add(umPiloto));
	}
	

}
