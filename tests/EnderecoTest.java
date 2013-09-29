package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleDeAtletas.Endereco;

public class EnderecoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogradouro() {
		
		Endereco umEndereco = new Endereco("logradouro", null, null, null, null, null, null, null );
		assertEquals("logradouro", umEndereco.getLogradouro());
				
	}
	
	@Test
	public void testNumero(){
		
		Endereco umEndereco = new Endereco(null, "numero", null, null, null, null, null, null);
		assertEquals("numero", umEndereco.getNumero());
		
	}
	
	@Test
	public void testBairo(){
		Endereco umEndereco = new Endereco(null, null, "bairro", null, null, null, null, null);
		assertEquals("bairro", umEndereco.getBairro());
		
	}
	
	@Test
	public void testCidade(){
		Endereco umEndereco = new Endereco(null, null, null, "cidade", null, null, null, null);
		assertEquals("cidade", umEndereco.getCidade());
		
	}
	
	@Test
	public void testEstado(){
		Endereco umEndereco = new Endereco(null, null, null, null, "estado", null, null, null);
		assertEquals("estado", umEndereco.getEstado());
	}
	
	@Test
	public void testPais(){
		Endereco umEndereco = new Endereco(null, null, null, null, null, "pais", null, null);
		assertEquals("pais", umEndereco.getPais());
	}
	
	@Test
	public void testComplemento(){
		Endereco umEndereco = new Endereco(null, null, null, null, null, null, "complemento", null);
		assertEquals("complemento", umEndereco.getComplemento());
	}
	
	@Test
	public void testCep(){
		Endereco umEndereco = new Endereco(null, null, null, null, null, null, null, "cep");
		assertEquals("cep", umEndereco.getCep());
	}
	
	
	

}
