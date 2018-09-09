package service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cruzeiro.Campeonato;


public class CampeonatoService {
	
	private EntityManagerFactory emf;
	
	public CampeonatoService(){
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Campeonato campeonato )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(campeonato);
		em.getTransaction().commit();
		em.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Campeonato> getCampeonatos() {
		
		List <Campeonato> campeonatos;
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Campeonato a ");
		campeonatos = q.getResultList();
		em.close();
		return campeonatos;
	}
	
	
	
	
	
	
/*	
private ArrayList<Campeonato> campeonatos = Dados.CAMPEONATOS;
	
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	
	public void salvar(Campeonato campeonato) {
		campeonatos.add(campeonato);
	}
	
	public Campeonato getCampeonatoByNome(String idNome) {
		for(int i=0; i< campeonatos.size(); i++)
			if(idNome == campeonatos.get(i).getNome())
				return campeonatos.get(i);
		
		return null;
	}
*/
}
