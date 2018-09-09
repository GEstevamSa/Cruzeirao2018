package service;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cruzeiro.Equipe;


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
	
	
	
	
	
	
	
/*	
private ArrayList<Equipe> equipes = Dados.EQUIPES;
	
	public List<Equipe> getEquipes() {
		return equipes;
	}
	
	public void salvar(Equipe equipe) {
		equipes.add(equipe);
	}
	
	public Equipe getEquipeByNome(String idNome) {
		for(int i=0; i< equipes.size(); i++)
			if(idNome == equipes.get(i).getNome())
				return equipes.get(i);
		
		return null;
	}
	*/
}
