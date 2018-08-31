package cruzeiro;

import java.util.ArrayList;


public class Categoria {
	
	
	private String nome;
	private int nascidosApartirDe;
	private ArrayList<Inscricao> inscricoes = new ArrayList<>();
	private Campeonato campeonato;
	private ArrayList<Fase> fases = new ArrayList<Fase>();
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	private int minJogadores;
	private int maxJogadores;
	private String sexo;
	

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
	
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
	
	/*
	private String Nome;
	private int nascidosApartirDe;
	private Campeonato campeonato;
	private int minJogadores;
	private int maxJogadores;
	private String sexo;
	
	private List<Inscricao> inscricoes;
	private List<Fase> fases;
	
	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void setFases(List<Fase> fases) {
		this.fases = fases;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getNascidosApartirDe() {
		return nascidosApartirDe;
	}
	public void setNascidosApartirDe(int nascidosApartirDe) {
		this.nascidosApartirDe = nascidosApartirDe;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
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
	
	*/

}
