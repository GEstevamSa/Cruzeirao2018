package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//import cruzeiro.Campeonato;
//import cruzeiro.Equipe;
import cruzeiro.Usuario;
//import sistema.modelos.Usuario;

public class UsuarioService {
	
	
	private EntityManagerFactory emf;
	
	public UsuarioService()
	{
		emf=Persistence.createEntityManagerFactory("");
	}
	
	public void salvar(Usuario user)
	{
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List <Usuario> getUsuarios()
	{
		
		List<Usuario> user;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Usuaria a");
		user = q.getResultList();
		em.close();
		
		return user;
		
	}
	

	/*
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
	*/
}
