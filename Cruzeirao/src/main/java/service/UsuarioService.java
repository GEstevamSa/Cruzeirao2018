package service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cruzeiro.Usuario;


public class UsuarioService {
	
	private EntityManagerFactory emf;
	private ArrayList <Usuario> usuarios = Dados.USUARIOS;
	
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
	
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	
	
	public Usuario getUsuarioId(String idUsuario) {
		
		for(int i=0; i< usuarios.size(); i++)
			if(idUsuario == usuarios.get(i).getCPF())
				return usuarios.get(i);
		
		return null;
	}
	
	
}
