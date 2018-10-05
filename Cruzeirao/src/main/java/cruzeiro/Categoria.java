package cruzeiro;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Categoria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToMany(cascade=CascadeType.PERSIST , mappedBy="categoria")
	private ArrayList<Inscricao> inscricoes = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="idCampeonato")
	private Campeonato campeonato;
	@OneToMany(cascade=CascadeType.PERSIST , mappedBy="categoria")
	private ArrayList<Fase> fases = new ArrayList<Fase>();
	
	private String nome;
	private int nascidosApartirDe;
	private int minJogadores;
	private int maxJogadores;
	private String sexo;
	
	public void atualizar(ActionEvent actionEvent) {
		addMessage("Valor Atualizado com sucesso");
	}
	
	public void deletar(ActionEvent actionEvent) {
		addMessage("Valor Deletado com sucesso");
	}
	
	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,summary,null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNascidosApartirDe() {
		return nascidosApartirDe;
	}

	public void setNascidosApartirDe(int nascidosApartirDe) {
		this.nascidosApartirDe = nascidosApartirDe;
	}

	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public ArrayList<Fase> getFases() {
		return fases;
	}

	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}

	public int getMinJogadores() {
		return minJogadores;
	}

	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}

	public int getMaxJogadores() {
		return maxJogadores;
	}

	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void addFases(Fase fase)
	{
		fases.add(fase);
	}
	
}
