package controleDeAtletas;

import java.util.ArrayList;

public class ControlePilotoAutomotivo {
	
	private ArrayList<PilotoAutomotivo> listaPilotos;
	
	public ControlePilotoAutomotivo(){
		this.listaPilotos = new ArrayList<PilotoAutomotivo>();
	}
	
	public ArrayList<PilotoAutomotivo> getListaPilotos(){
		return listaPilotos;
	}
	
	public void adicionar(PilotoAutomotivo umPiloto){
		listaPilotos.add(umPiloto);
	}
	
	public void remover(PilotoAutomotivo umPiloto){
		listaPilotos.remove(umPiloto);
	}
	
	public PilotoAutomotivo pesquisar(String nome){
		for (PilotoAutomotivo piloto: listaPilotos){
			if (piloto.getNome().equalsIgnoreCase(nome)) return piloto;
		}
		return null;
	}
}
