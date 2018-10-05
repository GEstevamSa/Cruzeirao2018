package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cruzeiro.Campeonato;
import cruzeiro.Categoria;

public class CategoriaService {
	
private EntityManagerFactory emf;
	
	public CategoriaService(){
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Categoria categoria )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias() {
		
		List <Categoria> categorias;
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Categoria a ");
		categorias = q.getResultList();
		em.close();
		return categorias;
	}
	
	public void alterar(Categoria categoria) 
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(categoria);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Categoria categoria) {
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		categoria = em.find(Categoria.class,categoria.getNome());
		em.remove(categoria);
		em.getTransaction().commit();
		em.close();
	}
	
	public Categoria getCatByID(int id) {
		
		EntityManager em = emf.createEntityManager();
		Categoria cat = em.find(Categoria.class,id);
		em.close();
		
		return cat;
	}

}
