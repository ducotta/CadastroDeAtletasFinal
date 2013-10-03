package controleDeAtletas;

public class Historico {
	
	private String categoriaPiloto;
	private String categoriaCorrida;
	private String periodoDeParticipacao;
	
	public Historico(String categoriaPiloto, String categoriaCorrida, String periodoDeParticipacao){
		this.categoriaPiloto = categoriaPiloto;
		this.categoriaCorrida = categoriaCorrida;
		this.periodoDeParticipacao = periodoDeParticipacao;
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
	
	public String getPeriodoDeParticipacao(){
		return periodoDeParticipacao;
	}
	public void setPeriodoDeParticipacao(String periodoDeParticipacao){
		this.periodoDeParticipacao = periodoDeParticipacao;
	}
	
	@Override
	public String toString(){
		return "Correu como " + this.categoriaPiloto + " na categoria " + this.categoriaCorrida + " em " +  this.periodoDeParticipacao;
	}

}
