package managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import cruzeiro.Campeonato;
import cruzeiro.Categoria;
import cruzeiro.Fase;
import service.CampeonatoService;
import service.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaMB {
	
	private CategoriaService categoriaService = new CategoriaService();
	private CampeonatoService campeonatoService = new CampeonatoService();
	private Categoria novaCategoria = new Categoria();
	private Categoria categoriaAtual;
	private Campeonato campeonatoAtual;
	private Fase novaFase;
	
	public String salvar() {
		novaCategoria.setCampeonato(campeonatoAtual);
		campeonatoAtual.addCategorias(novaCategoria);
		categoriaService.save(novaCategoria);
		novaCategoria = new Categoria();
		campeonatoService.closeEntityManager();
		categoriaService.closeEntityManager();
		return "categoria";
	}
	
	public void atualizar(RowEditEvent event) {

		Categoria cat = ((Categoria) event.getObject());
		categoriaService.save(cat);
	}
	
	public void deletar(Categoria categoria) {
		categoriaService.remove(categoria);
	}

	public List<Categoria> getCategorias(){
		return categoriaService.getAll(Categoria.class);
	}

	public Categoria getNovaCategoria() {
		return novaCategoria;
	}

	public void setNovaCategoria(Categoria novaCategoria) {
		this.novaCategoria = novaCategoria;
	}

	public Categoria getCategoriaAtual() {
		return categoriaAtual;
	}

	public void setCategoriaAtual(Categoria categoriaAtual) {
		this.categoriaAtual = categoriaAtual;
	}

	public Fase getNovaFase() {
		return novaFase;
	}

	public void setNovaFase(Fase novaFase) {
		this.novaFase = novaFase;
	}
	
	public Campeonato getCampeonatoAtual() {
		return campeonatoAtual;
	}
	
	public void setCampeonatoAtual(Campeonato campeonatoAtual) {
		this.campeonatoAtual = campeonatoAtual;
	}
	
	public String verCategorias(Campeonato campeonato) {
		campeonatoAtual = campeonatoService.getById(Campeonato.class,campeonato.getId());
		novaCategoria = new Categoria();
		
		return "Categoria";
	}
	
}
