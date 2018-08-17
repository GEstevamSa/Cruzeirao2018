package service;

import java.util.ArrayList;
import java.util.List;

import cruzeiro.Campeonato;
import cruzeiro.Equipe;
import cruzeiro.Usuario;

public class UsuarioService {
	
	private ArrayList <Usuario> usuarios = Dados.USUARIOS;
	private ArrayList <Equipe> equipes = Dados.EQUIPES;
	private ArrayList <Campeonato> campeonatos = Dados.CAMPEONATOS;
	
	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}

	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void salvar(Usuario usuario )
	{
		usuarios.add(usuario);
	}
	
	public void salvarEquipe(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public void salvarCamp(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}

	public Usuario getUsuarioById(int idUsuario) {
		
		for(int i=0; i< usuarios.size(); i++)
			if(idUsuario == usuarios.get(i).getCodigo())
				return usuarios.get(i);
		return null;
	}
	
	public Campeonato getCampByNome(String nomecamp) {
		
		for(int i=0; i< campeonatos.size();i++)
			if(nomecamp == campeonatos.get(i).getNomeCampeonato())
				return campeonatos.get(i);
		return null;
	}
}
