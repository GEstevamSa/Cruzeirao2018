package service;

import java.util.ArrayList;

import cruzeiro.Grupo;
import cruzeiro.Rodada;

public class GrupoService {
	
	private ArrayList <Grupo> grupos = Dados.GRUPOS;
	private ArrayList <Rodada> rodadas = Dados.RODADAS;
	
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
	public ArrayList<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(ArrayList<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	
	public void salvarGrupo(Grupo grupo) {
		grupos.add(grupo);
	}
	
	public void salvarRodada(Rodada rodada) {
		rodadas.add(rodada);
	}
	
	public Grupo getGrupoby(String nome) {
		
		for(int i=0; i< grupos.size();i++)
			if(nome == grupos.get(i).getNome())
				return grupos.get(i);
		return null;
	}
	
}
