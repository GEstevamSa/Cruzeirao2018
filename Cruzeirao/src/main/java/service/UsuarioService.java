package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cruzeiro.Campeonato;
import cruzeiro.Equipe;
import cruzeiro.Usuario;

public class UsuarioService {
	
	private EntityManagerFactory emf;
	private EntityManager        em;
	

	public UsuarioService(){
		emf = Persistence.createEntityManagerFactory("Cruzeirao");
	}
	
	public void salvar(Usuario usuario )
	{
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	public void alterar(Usuario usuario) 
	{
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Usuario usuario) {
		
		em = emf.createEntityManager();
		em.getTransaction().begin();
		usuario = em.find(Usuario.class,usuario.getCPF());
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() {
		
		List <Usuario> usuarios;
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select a From Usuario a ");
		usuarios = q.getResultList();
		em.close();
		return usuarios;
	}
	
	public Usuario getUsuarioIdbyCPF(String cpf) {
		
		EntityManager em = emf.createEntityManager();
		Usuario user = em.find(Usuario.class,cpf);
		for(Equipe e : user.getEquipes())
			System.out.println(e);
		em.close();
		return user;
	}
	
	
public Usuario getUsuarioCamp(String cpf) {
		
		EntityManager em = emf.createEntityManager();
		Usuario user = em.find(Usuario.class,cpf);
		for(Campeonato c : user.getCampeonatos())
			System.out.println(c);
		em.close();
		return user;
	}

	public void closeEM() {
		
		em.close();
	}
}
