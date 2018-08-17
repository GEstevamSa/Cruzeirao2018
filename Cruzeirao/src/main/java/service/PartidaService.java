package service;

import java.util.ArrayList;

import cruzeiro.Partida;

public class PartidaService {
	
	private ArrayList <Partida> partidas = Dados.PARTIDAS;
	
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	
	public void salvarPartida(Partida partida) {
		partidas.add(partida);
	}
	
	public Partida getPart(int numero) {
		
		for(int i=0; i< partidas.size();i++)
			if(numero == partidas.get(i).getNumero())
				return partidas.get(i);
		return null;
	}
	

}
