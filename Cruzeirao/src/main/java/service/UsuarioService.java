package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cruzeiro.Usuario;


public class UsuarioService {
	
	private EntityManagerFactory emf;
	//private ArrayList <Usuario> usuarios = Dados.USUARIOS;
	
	public UsuarioService(){
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Usuario usuario )
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() {
		
		List <Usuario> usuarios;
		EntityManager em = emf.createEntityManager();
		Query q = em.createNamedQuery("Select a From Usuario a ");
		usuarios = q.getResultList();
		em.close();
		return usuarios;
	}
	
	
}
