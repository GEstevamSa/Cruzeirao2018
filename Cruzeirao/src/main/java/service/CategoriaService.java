package service;

import java.util.ArrayList;

import cruzeiro.Categoria;
import cruzeiro.Fase;
import cruzeiro.Inscricao;

public class CategoriaService {
	
	private ArrayList <Categoria> categorias = Dados.CATEGORIAS;
	private ArrayList <Inscricao> inscricoes = Dados.INSCRICAO;
	private ArrayList <Fase> fases = Dados.FASES;
	
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	
	public void salvarCat(Categoria categoria) {
		categorias.add(categoria);
	}
	
	public void salvarFase(Fase fase) {
		fases.add(fase);
	}
	
	public void salvarInscricao(Inscricao inscricao) {
		inscricoes.add(inscricao);
	}
	
    public Categoria getCatByNome(String nomecat) {
		
		for(int i=0; i< categorias.size();i++)
			if(nomecat == categorias.get(i).getNome())
				return categorias.get(i);
		return null;
	}
	
	

}
