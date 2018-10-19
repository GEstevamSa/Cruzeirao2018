package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cruzeiro.Campeonato;
import cruzeiro.Equipe;
import cruzeiro.Usuario;

public class UsuarioService extends DAOImpl<Usuario, String>{
	
	/*
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
	*/
}
