package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Fase;

@ManagedBean
@SessionScoped
public class FaseMB {
		
		private ArrayList<Fase> lista = new ArrayList<>();
			
			private Fase fase = new Fase();
			
			public void salvar() {
				lista.add(fase);
				fase = new Fase();
			}
			
			public ArrayList<Fase> getLista(){
				return lista;
			}

			public Fase getFase() {
				return fase;
			}

			public void setFase(Fase fase) {
				this.fase = fase;
			}

			public void setLista(ArrayList<Fase> lista) {
				this.lista = lista;
			}
	/*
	
private ArrayList<Fase> lista = new ArrayList<Fase>();
	
	private Fase fas = new Fase();
	
	public void salvar() {
		lista.add(fas);
		fas = new Fase();
	}

	public ArrayList<Fase> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Fase> lista) {
		this.lista = lista;
	}

	public Fase getFas() {
		return fas;
	}

	public void setFas(Fase fas) {
		this.fas = fas;
	}
	*/
	

}
