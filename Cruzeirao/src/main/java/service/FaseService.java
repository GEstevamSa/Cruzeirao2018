package service;

import java.util.ArrayList;

import cruzeiro.Fase;
import cruzeiro.Grupo;

public class FaseService {
	
	private ArrayList <Fase> fases = Dados.FASES;
	private ArrayList <Grupo> grupos = Dados.GRUPOS;
	
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	public void salvarfase(Fase fase) {
		fases.add(fase);
	}
	
	public void salvarGrupo(Grupo grupo) {
		grupos.add(grupo);
	}
	
	public Fase getFaseby(int numero) {
		
		for(int i=0; i< fases.size();i++)
			if(numero == fases.get(i).getNumero())
				return fases.get(i);
		return null;
	}

	
	
	

}
