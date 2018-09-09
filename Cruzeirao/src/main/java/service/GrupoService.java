package service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import cruzeiro.Grupo;


public class GrupoService {
	
	
private EntityManagerFactory emf;
	
	public GrupoService(){
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Grupo grupo )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(grupo);
		em.getTransaction().commit();
		em.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Grupo> getGrupos() {
		
		List <Grupo> grupos;
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Grupo a ");
		grupos = q.getResultList();
		em.close();
		return grupos;
	}
	
	
	
	/*
	
private ArrayList<Grupo> grupos = Dados.GRUPOS;
	
	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public void salvar(Grupo grupo) {
		grupos.add(grupo);
	}
	
	public Grupo getGrupoByNome(String idNome) {
		for(int i=0; i< grupos.size(); i++)
			if(idNome == grupos.get(i).getNome())
				return grupos.get(i);
		
		return null;
	}
	*/
}
