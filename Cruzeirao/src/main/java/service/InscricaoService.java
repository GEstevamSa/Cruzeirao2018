package service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import cruzeiro.Inscricao;


public class InscricaoService {
	
		private EntityManagerFactory emf;
		
		public InscricaoService(){
			emf = Persistence.createEntityManagerFactory("Cruzeirao");
		}
		
		public void salvar(Inscricao inscricao )
		{
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(inscricao);
			em.getTransaction().commit();
			em.close();
		}
		
		
		@SuppressWarnings("unchecked")
		public List<Inscricao> getInscricoes() {
			
			List <Inscricao> inscricoes;
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("Select a From Inscricao a ");
			inscricoes = q.getResultList();
			em.close();
			return inscricoes;
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
	
	
	
/*	
private ArrayList<Inscricao> inscricoes = Dados.INSCRICAO;
	
	public List<Inscricao> getCampeonatos() {
		return inscricoes;
	}
	
	public void salvar(Inscricao inscricao) {
		inscricoes.add(inscricao);
	}
	
	public Inscricao getInscricaoByNome(int IdNumero) {
		for(int i=0; i< inscricoes.size(); i++)
			if(IdNumero == inscricoes.get(i).getNumero())
				return inscricoes.get(i);
		
		return null;
	}
	*/
}
