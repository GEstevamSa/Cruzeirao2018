package cruzeiro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

public class Fase {
	
	private Date dataInicio;
	private Date dataFim;
	private Categoria categoria;
	private int numero;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>(); 
	private static ArrayList<Grupo> grupos = new ArrayList<>();
	
	
	public Fase() {
		super();
	}
	
	
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
	
	public ArrayList<Categoria> getCategoriass() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categoria) {
		this.categorias = categoria;
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

}
