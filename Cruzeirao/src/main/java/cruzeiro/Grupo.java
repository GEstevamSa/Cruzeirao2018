package cruzeiro;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	
	private String nome;
	private Fase fase;
	private int numero;
	private ArrayList<Rodada> rodada;
	
	public List<Rodada> getRodada() {
		return rodada;
	}
	public void setRodada(List<Rodada> rodada) {
		this.rodada = (ArrayList<Rodada>) rodada;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
