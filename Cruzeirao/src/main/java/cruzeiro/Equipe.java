package cruzeiro;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.primefaces.event.SelectEvent;
@Entity
public class Equipe implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="equipe")
	private ArrayList<Inscricao> inscricoes = new ArrayList<Inscricao>();
	@Temporal(TemporalType.DATE)
	private Date dataFundacao;
	
	private String nome;
	private String cidade;
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", 
        		format.format(event.getObject())));
    }
	
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuarioAtual) {
		this.usuario = usuarioAtual;
		
	}

	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}

	@Override
	public String toString() {
		return "Equipe [id=" + id + ", usuario=" + usuario + ", inscricoes=" + inscricoes + ", dataFundacao="
				+ dataFundacao + ", nome=" + nome + ", cidade=" + cidade + "]";
	}
	
	
}
