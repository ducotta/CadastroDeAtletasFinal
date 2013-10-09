package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Endereco;
import controleDeAtletas.Historico;
import controleDeAtletas.PilotoAutomotivo;
import controleDeAtletas.Premiacao;

public class PilotoAutomotivoTest {

	PilotoAutomotivo umPiloto;
	private Endereco umEndereco;
	private ArrayList<String> umHistorico;
	private ArrayList<Premiacao> premiacoes;
	
	@Before
	public void setUp() throws Exception {
		umPiloto = new PilotoAutomotivo("Ayrton Senna");
	}
	
	@Test
	public void testSexo(){
		umPiloto.setSexo('m');
		assertEquals('m', umPiloto.getSexo());
	}
	
	@Test
	public void testNome(){
		assertEquals("Ayrton Senna", umPiloto.getNome());
		
	}
	
	@Test
	public void testDataDeNasimento(){
		umPiloto.setDataDeNascimento("16/12/1992");
		assertEquals("16/12/1992", umPiloto.getDataDeNascimento());
	}
	
	@Test
	public void testEndereco(){
		umPiloto.setEndereco(umEndereco);
		assertEquals(umEndereco, umPiloto.getEndereco());
	}
	
	@Test
	public void testTelefone(){
		umPiloto.setTelefone("5555-5555");
		assertEquals("5555-5555", umPiloto.getTelefone());
	}
	
	@Test
	public void testAltura(){
		umPiloto.setAltura(1.85);
		assertEquals(1.85, umPiloto.getAltura(), 0.01);
	}
	
	@Test
	public void testPeso(){
		umPiloto.setPeso(75.4);
		assertEquals(75.4, umPiloto.getPeso(), 0.01);
	}
	
	@Test
	public void testNomePai(){
		umPiloto.setNomePai("Joao");
		assertEquals("Joao", umPiloto.getNomePai());
	}
	
	@Test
	public void testNomeMae(){
		umPiloto.setNomeMae("Maria");
		assertEquals("Maria", umPiloto.getNomeMae());
	}
	
	@Test
	public void testRg(){
		umPiloto.setRg("0000000");
		assertEquals("0000000", umPiloto.getRg());
	}
	
	@Test
	public void testCpf(){
		umPiloto.setCpf("000.000.000-00");
		assertEquals("000.000.000-00", umPiloto.getCpf());
	}

	@Test
	public void tesCategoriaPiloto() {
		umPiloto.setCategoriaPiloto('P');
		assertEquals('P', umPiloto.getCategoriaPiloto());
	}
	
	@Test
	public void testTipoDeLicenca(){
		umPiloto.setTipoDeLicenca("BS");
		assertEquals("BS", umPiloto.getTipoDeLicenca());
	}
	
	@Test
	public void testAnosDeExperiencia(){
		umPiloto.setAnosDeExperiencia(23);
		assertEquals(23, umPiloto.getAnosDeExperiencia());
	}
	
	@Test
	public void testHistorico(){
		umPiloto.setHistorico(umHistorico);
		assertEquals(umHistorico, umPiloto.getHistorico());
	}
	
	@Test
	public void testPremiacoes(){
		umPiloto.setPremiacoes(premiacoes);
		assertEquals(premiacoes, umPiloto.getPremiacoes());
	}
	
	@Test
	public void testTotalDeCorridas(){
		umPiloto.setTotalDeCorridas(48);
		assertEquals(48, umPiloto.getTotalDeCorridas());
	}
	
	@Test
	public void testTotalVitorias(){
		umPiloto.setTotalVitorias(27);
		assertEquals(27, umPiloto.getTotalVitorias());
	}
	
	@Test 
	public void testTotalPolePositions(){
		umPiloto.setTotalPolePositions(22);
		assertEquals(22, umPiloto.getTotalPolePositions());
	}
	
	@Test
	public void testTotalVoltasDeMelhorTempo(){
		umPiloto.setTotalVoltasDeMelhorTempo(29);
		assertEquals(29, umPiloto.getTotalVoltasDeMelhorTempo());
	}
	
	@Test
	public void testTotalDeBatidas(){
		umPiloto.setTotalDeBatidas(12);
		assertEquals(12, umPiloto.getTotalDeBatidas());
	}
	
	@Test
	public void testBatakScore(){
		umPiloto.setBatakScore(0);
		assertEquals(0, umPiloto.getBatakScore());
	}

	
}
