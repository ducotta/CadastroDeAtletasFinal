package controleDeAtletas;

public class Premiacao {
	
	private String categoriaPiloto;
	private String competicao;
	private String titulo;
	private int ano;
	
	public Premiacao(String categoriaPiloto, String competicao, String titulo, int ano){
		this.categoriaPiloto = categoriaPiloto;
		this.competicao = competicao;
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public String getCategoriaPiloto(){
		return categoriaPiloto;
	}
	
	public void setCategoriaPiloto(String categoriaPiloto){
		this.categoriaPiloto = categoriaPiloto;
	}
	
	public String getCompeticao(){
		return competicao;
	}
	
	public void setCompeticao(String competicao){
		this.competicao = competicao;
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
		return this.ano + " - " + this.titulo + " - " + this.competicao + " - " + this.categoriaPiloto;
	}
	
	
}
