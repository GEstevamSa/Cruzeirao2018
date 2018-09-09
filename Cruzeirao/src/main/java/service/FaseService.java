package service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import cruzeiro.Fase;


public class FaseService {
	
private EntityManagerFactory emf;
	
	public FaseService(){
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Fase fase )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(fase);
		em.getTransaction().commit();
		em.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Fase> getFases() {
		
		List <Fase> fases;
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Fase a ");
		fases = q.getResultList();
		em.close();
		return fases;
	}
	
	
/*	
private ArrayList<Fase> fases = Dados.FASES;
	
	public List<Fase> getFases() {
		return fases;
	}
	
	public void salvar(Fase fase) {
		fases.add(fase);
	}
*/	
}
