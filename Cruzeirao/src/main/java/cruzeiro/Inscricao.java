package cruzeiro;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
@Entity
public class Inscricao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long numero;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	@ManyToOne
	@JoinColumn(name="id_Equipe")
	private Equipe equipe;
	
	private boolean pagamento;
	private boolean validade;
	

	@Transient
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
	
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	
	public Equipe getEquipe() {
		return equipe;
	}
	
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
