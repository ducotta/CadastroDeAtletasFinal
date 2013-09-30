package controleDeAtletas;

public class Premiacao {
	
	private String categoria;
	private String titulo;
	private int ano;
	
	public Premiacao(String categoria, String titulo, int ano){
		this.categoria = categoria;
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public int getAno(){
		return ano;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	@Override
	public String toString(){
		return this.ano + " - " + this.titulo;
	}
	
	
}
