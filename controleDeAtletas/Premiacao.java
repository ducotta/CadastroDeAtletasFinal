package controleDeAtletas;

public class Premiacao {
	
	private String categoriaPiloto;
	private String categoriaCorrida;
	private String titulo;
	private int ano;
	
	public Premiacao(String categoriaPiloto, String categoriaCorrida, String titulo, int ano){
		this.categoriaPiloto = categoriaPiloto;
		this.categoriaCorrida = categoriaCorrida;
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public String getCategoriaPiloto(){
		return categoriaPiloto;
	}
	
	public void setCategoriaPiloto(String categoriaPiloto){
		this.categoriaPiloto = categoriaPiloto;
	}
	
	public String getCategoriaCorrida(){
		return categoriaCorrida;
	}
	
	public void setCategoriaCorrida(String categoriaCorrida){
		this.categoriaCorrida = categoriaCorrida;
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
		return this.ano + " - " + this.titulo + " - " + this.categoriaCorrida + " - " + this.categoriaPiloto;
	}
	
	
}
