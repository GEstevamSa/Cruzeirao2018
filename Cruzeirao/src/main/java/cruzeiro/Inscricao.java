package cruzeiro;

import java.util.ArrayList;

public class Inscricao extends Equipe {
	
	private long numero;
	private boolean pagamento;
	private boolean validade;
	private Categoria categoria;
	private Equipe equipe;
	
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public boolean isValidade() {
		return validade;
	}
	public void setValidade(boolean validade) {
		this.validade = validade;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}

}
