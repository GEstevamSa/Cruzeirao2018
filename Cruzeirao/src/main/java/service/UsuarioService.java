package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import cruzeiro.Usuario;

public class UsuarioService {
	
	private EntityManagerFactory emf;
	private EntityManager em;

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
	
	public void alterar(Usuario usuario) {
		em.getTransaction().begin();
		usuario = em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Usuario usuario) {
		
		usuario = getUsuarioIdbyCPF(usuario.getCPF());
		em.getTransaction().begin();
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
		em.close();
		return user;
	}
}
