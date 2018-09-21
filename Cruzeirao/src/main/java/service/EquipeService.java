package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cruzeiro.Equipe;
import cruzeiro.Usuario;


public class EquipeService {
	private EntityManagerFactory emf;
	
	public EquipeService(){
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Equipe equipe )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(equipe);
		em.getTransaction().commit();
		em.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Equipe> getEquipes() {
		
		List <Equipe> equipes;
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Equipe a ");
		equipes = q.getResultList();
		em.close();
		return equipes;
	}
	
	public Equipe getEquipeByNome(String nome) {
		
		EntityManager em = emf.createEntityManager();
		
		Equipe equip = em.find(Equipe.class,nome);
		em.close();
		
		return equip;
	}
}
