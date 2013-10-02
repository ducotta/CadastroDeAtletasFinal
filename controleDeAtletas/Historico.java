package controleDeAtletas;

public class Historico {
	
	private String categoria;
	private String periodoDeParticipacao;
	
	public Historico(String categoria, String periodoDeParticipacao){
		this.categoria = categoria;
		this.periodoDeParticipacao = periodoDeParticipacao;
	}
	
	public String getCategoria(){
		return categoria;
	}
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	public String getPeriodoDeParticipacao(){
		return periodoDeParticipacao;
	}
	public void setPeriodoDeParticipacao(String periodoDeParticipacao){
		this.periodoDeParticipacao = periodoDeParticipacao;
	}
	
	@Override
	public String toString(){
		return "Correu na categoria " + this.categoria + " " + this.periodoDeParticipacao;
	}

}
