package controleDeAtletas;

import java.util.ArrayList;

public class PilotoAutomotivo extends Atleta {
	
	private String equipe;
	private char categoriaPiloto; // J=Junior N=Novato G=Graduado A=Amador P=Proficional
	private String tipoDeLicenca;
	private int anosDeExperiencia;
	private ArrayList<String> historico;
	private ArrayList<Premiacao> premiacoes;
	private int totalDeCorridas;
	private int totalVitorias;
	private int totalPolePositions;
	private int totalVoltaDeMelhorTempo;
	private int totalDeBatidas;
	private int batakScore;
	
	public PilotoAutomotivo (String nome){
		super(nome);
	}
	
	public String getEquipe(){
		return equipe;
	}
	
	public void setEquipe(String equipe){
		this.equipe = equipe;
	}
	
	public char getCategoriaPiloto(){
		return categoriaPiloto;
	}
	
	public void setCategoriaPiloto(char categoriaPiloto){
		this.categoriaPiloto = categoriaPiloto;
	}
	
	public String getTipoDeLicenca() {
		return tipoDeLicenca;
	}
	
	public void setTipoDeLicenca(String tipoDeLicenca) {
		this.tipoDeLicenca = tipoDeLicenca;
	}
	
	public int getAnosDeExperiencia() {
		return anosDeExperiencia;
	}
	
	public void setAnosDeExperiencia(int anosDeExperiencia) {
		this.anosDeExperiencia = anosDeExperiencia;
	}
	
	public ArrayList<String> getHistorico() {
		return historico;
	}
	
	public void setHistorico(ArrayList<String> historico) {
		this.historico = historico;
	}
	
	public ArrayList<Premiacao> getPremiacoes() {
		return premiacoes;
	}
	
	public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
		this.premiacoes = premiacoes;
	}
	
	public int getTotalDeCorridas(){
		return totalDeCorridas;
	}
	
	public void setTotalDeCorridas(int totalDeCorridas){
		this.totalDeCorridas = totalDeCorridas;
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
	
	public int getTotalVoltasDeMelhorTempo() {
		return totalVoltaDeMelhorTempo;
	}
	
	public void setTotalVoltasDeMelhorTempo(int totalVoltasDeMelhorTempo) {
		this.totalVoltaDeMelhorTempo = totalVoltasDeMelhorTempo;
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
