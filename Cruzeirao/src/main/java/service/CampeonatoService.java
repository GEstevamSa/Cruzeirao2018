package service;

import java.util.ArrayList;

import cruzeiro.Campeonato;
import cruzeiro.Categoria;

public class CampeonatoService {
	
	private ArrayList <Campeonato> campeonatos = Dados.CAMPEONATOS;
	private ArrayList <Categoria> categorias = Dados.CATEGORIAS;
	
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	public void salvarCamp(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}
	
	public void salvarCat(Categoria categoria) {
		categorias.add(categoria);
	}
	
	public Campeonato getCampByNome(String nomecamp) {
		
		for(int i=0; i< campeonatos.size();i++)
			if(nomecamp == campeonatos.get(i).getNomeCampeonato())
				return campeonatos.get(i);
		return null;
	}
}
