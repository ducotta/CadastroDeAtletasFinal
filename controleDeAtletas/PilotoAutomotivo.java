package controleDeAtletas;

import java.util.ArrayList;

public class PilotoAutomotivo extends Atleta {
	
	private String categoriaPiloto; // J=Junior N=Novato G=Graduado P=Proficional
	private String categoriaCorrida;
	private String licenca;
	private int anosDeExperiencia;
	private ArrayList<Historico> historico;
	private ArrayList<Premiacao> preiacoes;
	private int totalVitorias;
	private int totalPolePositions;
	private int totalVoltaDeMelhorTempo;
	private int totalDeBatidas;
	private int batakScore;
	
	public PilotoAutomotivo (String nome){
		super(nome);
	}
	
	public String getCategoriaPiloto(){
		return categoriaPiloto;
	}
	
	public void setCategoriaPiloto(String categoriaPiloto){
		this.categoriaPiloto = categoriaPiloto;
	}
	
	public String getCategoriaCorrida() {
		return categoriaCorrida;
	}
	
	public void setCategoriaCorrida(String categoriaCorrida) {
		this.categoriaCorrida = categoriaCorrida;
	}
	
	public String getLicenca() {
		return licenca;
	}
	
	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}
	
	public int getAnosDeExperiencia() {
		return anosDeExperiencia;
	}
	
	public void setAnosDeExperiencia(int anosDeExperiencia) {
		this.anosDeExperiencia = anosDeExperiencia;
	}
	
	public ArrayList<Historico> getHistorico() {
		return historico;
	}
	
	public void setHistorico(ArrayList<Historico> historico) {
		this.historico = historico;
	}
	
	public ArrayList<Premiacao> getPreiacoes() {
		return preiacoes;
	}
	
	public void setPreiacoes(ArrayList<Premiacao> preiacoes) {
		this.preiacoes = preiacoes;
	}
	
	public int getTotalVitorias() {
		return totalVitorias;
	}
	
	public void setTotalVitorias(int totalVitorias) {
		this.totalVitorias = totalVitorias;
	}
	
	public int getTotalPolePositions() {
		return totalPolePositions;
	}
	
	public void setTotalPolePositions(int totalPolePositions) {
		this.totalPolePositions = totalPolePositions;
	}
	
	public int getTotalMelhorTempo() {
		return totalVoltaDeMelhorTempo;
	}
	
	public void setTotalMelhorTempo(int totalMelhorTempo) {
		this.totalVoltaDeMelhorTempo = totalMelhorTempo;
	}
	
	public int getTotalDeBatidas(){
		return totalDeBatidas;
	}
	
	public void setTotalDeBatidas(int totalDeBatidas){
		this.totalDeBatidas = totalDeBatidas;
	}
	
	public int getBatakScore() {
		return batakScore;
	}
	
	public void setBatakScore(int batakScore) {
		this.batakScore = batakScore;
	}
	

}
