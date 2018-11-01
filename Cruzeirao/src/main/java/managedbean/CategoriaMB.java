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
	private Campeonato novoCampeonato = new Campeonato();
	private Fase novaFase;
	
	public String salvar() {
		
		categoriaService.save(novaCategoria);
		novaCategoria = new Categoria();
		return "menu";
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
	
	public String criarFases() {
		novaFase = new Fase();
		return "Fase";
	}
	
	public String salvarFase()
	{
		novaCategoria.addFases(novaFase);
		novaFase.setCategoria(novaCategoria);
		return "Fase";
	}

	public Fase getNovaFase() {
		return novaFase;
	}

	public void setNovaFase(Fase novaFase) {
		this.novaFase = novaFase;
	}
	
	public String salvarCategoria()
	{
		novoCampeonato.addCategorias(novaCategoria);
		novaCategoria.setCampeonato(novoCampeonato);
		return "Categoria";
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
