package cruzeiro;

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
public class Fase implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numero;
	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	@OneToMany(cascade=CascadeType.ALL , mappedBy="fase")
	private static ArrayList<Grupo> grupos = new ArrayList<>();
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	@Temporal(TemporalType.DATE)
	private Date dataFim;
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", 
        		format.format(event.getObject())));
    }
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public static ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	
	public static void setGrupos(ArrayList<Grupo> grupos) {
		Fase.grupos = grupos;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void addGrupos(Grupo grupo)
	{
		grupos.add(grupo);
	}

}
