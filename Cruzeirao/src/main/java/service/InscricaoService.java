package service;

import java.util.ArrayList;

import cruzeiro.Categoria;
import cruzeiro.Inscricao;
import cruzeiro.Partida;

public class InscricaoService {
	
	private ArrayList <Inscricao> inscricoes = Dados.INSCRICAO;
	private ArrayList <Partida> partidas = Dados.PARTIDAS;
	
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	
	public void salvarInscricao(Inscricao inscricao) {
		inscricoes.add(inscricao);
	}
	
	public void salvarPartida(Partida partida) {
		partidas.add(partida);
	}
	
	 public Inscricao getInsByNome(Categoria nomeins) {
			
			for(int i=0; i< inscricoes.size();i++)
				if(nomeins == inscricoes.get(i).getCategoria())
					return inscricoes.get(i);
			return null;
		}
}
