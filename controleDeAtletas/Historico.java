package controleDeAtletas;

public class Historico {
	
	private String categoriaPiloto;
	private String Competicao;
	private String periodoDeParticipacao;
	
	public Historico(String categoriaPiloto, String competicao, String periodoDeParticipacao){
		this.categoriaPiloto = categoriaPiloto;
		this.Competicao = competicao;
		this.periodoDeParticipacao = periodoDeParticipacao;
	}
	public String getCategoriaPiloto(){
		return categoriaPiloto;
	}
	public void setCategoriaPiloto(String categoriaPiloto){
		this.categoriaPiloto = categoriaPiloto;
	}
	
	public String getCompeticao(){
		return Competicao;
	}
	public void setCompeticao(String competicao){
		this.Competicao = competicao;
	}
	
	public String getPeriodoDeParticipacao(){
		return periodoDeParticipacao;
	}
	public void setPeriodoDeParticipacao(String periodoDeParticipacao){
		this.periodoDeParticipacao = periodoDeParticipacao;
	}
	
	@Override
	public String toString(){
		return "Correu como " + this.categoriaPiloto + " na categoria " + this.Competicao + " em " +  this.periodoDeParticipacao;
	}

}
