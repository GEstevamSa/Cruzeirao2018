package service;

import java.util.ArrayList;

import cruzeiro.Equipe;
import cruzeiro.Inscricao;

public class EquipeService {
	
	private ArrayList <Equipe> equipes = Dados.EQUIPES;
	private ArrayList <Inscricao> inscricoes = Dados.INSCRICAO;
	
	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	
	public void salvarEquipe(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public void salvarInscricao(Inscricao inscricao) {
		inscricoes.add(inscricao);
	}
	
	public Equipe getEquipeNome(int codigo) {
		
		for(int i=0; i< equipes.size(); i++)
			if(codigo == equipes.get(i).getCodigoequip())
				return equipes.get(i);
		return null;
	}
}
