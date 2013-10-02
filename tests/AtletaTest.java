package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Atleta;
import controleDeAtletas.Endereco;

public class AtletaTest {
	
	Atleta umAtleta;
	private Endereco endereco;

	@Before
	public void setUp() throws Exception {
		umAtleta = new Atleta("Niki Lauda");
	}
	
	@Test
	public void testSexo(){
		umAtleta.setSexo('m');
		assertEquals('m', umAtleta.getSexo());
	}
	
	@Test
	public void testNome(){
		assertEquals("Niki Lauda", umAtleta.getNome());
		
	}
	
	@Test
	public void testDataDeNasimento(){
		umAtleta.setDataDeNascimento("16/12/1992");
		assertEquals("16/12/1992", umAtleta.getDataDeNascimento());
	}
	
	@Test
	public void testEndereco(){
		endereco = new Endereco();
		umAtleta.setEndereco(endereco);
		assertEquals(endereco, umAtleta.getEndereco());
	}
	
	@Test
	public void testTelefone(){
		umAtleta.setTelefone("5555-5555");
		assertEquals("5555-5555", umAtleta.getTelefone());
	}
	
	@Test
	public void testAltura(){
		umAtleta.setAltura(1.85);
		assertEquals(1.85, umAtleta.getAltura(), 0.01);
	}
	
	@Test
	public void testPeso(){
		umAtleta.setPeso(75.4);
		assertEquals(75.4, umAtleta.getPeso(), 0.01);
	}
	
	@Test
	public void testNomePai(){
		umAtleta.setNomePai("Joao");
		assertEquals("Joao", umAtleta.getNomePai());
	}
	
	@Test
	public void testNomeMae(){
		umAtleta.setNomeMae("Maria");
		assertEquals("Maria", umAtleta.getNomeMae());
	}
	
	@Test
	public void testRg(){
		umAtleta.setRg("0000000");
		assertEquals("0000000", umAtleta.getRg());
	}
	
	@Test
	public void testCpf(){
		umAtleta.setCpf("000.000.000-00");
		assertEquals("000.000.000-00", umAtleta.getCpf());
	}
	

}
