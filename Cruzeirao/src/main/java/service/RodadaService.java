package service;

import java.util.ArrayList;

import cruzeiro.Partida;
import cruzeiro.Rodada;

public class RodadaService {
	
	private ArrayList <Rodada> rodadas = Dados.RODADAS;
	private ArrayList <Partida> partidas = Dados.PARTIDAS;
	
	public ArrayList<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(ArrayList<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	
	public void salvarRodada(Rodada rodada) {
		rodadas.add(rodada);
	}
	
	public void salvarPartida(Partida partida) {
		partidas.add(partida);
	}
	public Rodada getRodby(int numero) {
		
		for(int i=0; i< rodadas.size();i++)
			if(numero == rodadas.get(i).getNumero())
				return rodadas.get(i);
		return null;
	}

}
