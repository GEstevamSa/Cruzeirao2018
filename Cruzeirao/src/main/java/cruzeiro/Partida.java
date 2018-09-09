package cruzeiro;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.primefaces.event.SelectEvent;
@Entity
public class Partida {
	@Id
	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private Date data;
	private Partida proxPartida;
	private Grupo grupo;
	private String relatoJuiz;
	@Transient
	private Inscricao[] inscricoes = {new Inscricao(), new Inscricao()};
	
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", 
        		format.format(event.getObject())));
    }
	
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}
	
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Partida getProxPartida() {
		return proxPartida;
	}
	
	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}
	
	public Grupo getGrupo() {
		return grupo;
	}
	
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}
	
	public Inscricao[] getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(Inscricao[] inscricoes) {
		this.inscricoes = inscricoes;
	}
	
	
	
	
	/*

	
	*/

}
