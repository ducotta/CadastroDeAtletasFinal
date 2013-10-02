package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Endereco;

public class EnderecoTest {

	Endereco umEndereco;
	
	@Before
	public void setUp() throws Exception {
		umEndereco = new Endereco();
	}

	@Test
	public void testLogradouro() {
		
		umEndereco.setLogradouro("Rua Augusta");
		assertEquals("Rua Augusta", umEndereco.getLogradouro());
				
	}
	
	@Test
	public void testNumero(){
		
		umEndereco.setNumero("umNumero");
		assertEquals("umNumero", umEndereco.getNumero());
		
	}
	
	@Test
	public void testBairo(){
		umEndereco.setBairro("umBairro");
		assertEquals("umBairro", umEndereco.getBairro());
		
	}
	
	@Test
	public void testCidade(){
		umEndereco.setCidade("cidade");
		assertEquals("cidade", umEndereco.getCidade());
		
	}
	
	@Test
	public void testEstado(){
		umEndereco.setEstado("estado");
		assertEquals("estado", umEndereco.getEstado());
	}
	
	@Test
	public void testPais(){
		umEndereco.setPais("pais");
		assertEquals("pais", umEndereco.getPais());
	}
	
	@Test
	public void testComplemento(){
		umEndereco.setComplemento("complemento");
		assertEquals("complemento", umEndereco.getComplemento());
	}
	
	@Test
	public void testCep(){
		umEndereco.setCep("cep");
		assertEquals("cep", umEndereco.getCep());
	}
	
	
	

}
