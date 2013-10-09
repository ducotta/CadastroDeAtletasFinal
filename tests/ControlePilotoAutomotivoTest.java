package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.ControlePilotoAutomotivo;
import controleDeAtletas.PilotoAutomotivo;

public class ControlePilotoAutomotivoTest {
	
	ControlePilotoAutomotivo umControle;
	PilotoAutomotivo umPiloto;
	private ArrayList<PilotoAutomotivo> listaPilotos;
	

	@Before
	public void setUp() throws Exception {
		umPiloto = new PilotoAutomotivo("James Hunt");
		umControle = new ControlePilotoAutomotivo();
	}

	@Test
	public void testGetListaPiloto() {
		assertNotNull(umControle.getListaPilotos());
	}
	
	@Test
	public void testPesquisaAdicionarPiloto() {
		umControle.adicionar(umPiloto);
		
		assertEquals(umPiloto, umControle.pesquisar("James Hunt"));
		assertNull(umControle.pesquisar("Niki Lauda"));
	}
	
	@Test
	public void testPesquisaRemoverPiloto(){
		umControle.adicionar(umPiloto);
		umControle.remover(umPiloto);
		
		assertNull(umControle.pesquisar("James Hunt"));
	}
}
