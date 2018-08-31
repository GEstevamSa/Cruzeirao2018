package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Inscricao;

@ManagedBean
@SessionScoped
public class InscricaoMB {
	
	
	private ArrayList<Inscricao> lista = new ArrayList<>();
	
	private Inscricao inscricao = new Inscricao();
	
	public void salvar() {
		lista.add(inscricao);
		inscricao = new Inscricao();
	}
	
	public ArrayList<Inscricao> getLista(){
		return lista;
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public void setLista(ArrayList<Inscricao> lista) {
		this.lista = lista;
	}
	/*
	private ArrayList<Inscricao> lista = new ArrayList<Inscricao>();
	
	private Inscricao insc = new Inscricao();
	
	public void salvar() {
		lista.add(insc);
		insc = new Inscricao();
	}

	public ArrayList<Inscricao> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Inscricao> lista) {
		this.lista = lista;
	}

	public Inscricao getCamp() {
		return insc;
	}

	public void setCamp(Inscricao insc) {
		this.insc = insc;
	}
	*/
}