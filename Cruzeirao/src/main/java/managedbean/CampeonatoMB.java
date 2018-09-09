package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Campeonato;
import cruzeiro.Categoria;
import service.CampeonatoService;

@ManagedBean
@SessionScoped
public class CampeonatoMB {
	
	private CampeonatoService campeonatoService = new CampeonatoService();
	private Campeonato campeonatoAtual;
	private Categoria novaCategoria;
	
	private Campeonato novoCampeonato = new Campeonato();
	
	public String salvar() {
		campeonatoService.salvar(novoCampeonato);
		novoCampeonato = new Campeonato();
		return "menu";
	}
	
	public List <Campeonato> getCampeonatos()
	{
		return campeonatoService.getCampeonatos();
	}

	public Campeonato getNovoCampeonato() {
		return novoCampeonato;
	}

	public void setNovoCampeonato(Campeonato novoCampeonato) {
		this.novoCampeonato = novoCampeonato;
	}

	public Campeonato getCampeonatoAtual() {
		return campeonatoAtual;
	}

	public void setCampeonatoAtual(Campeonato campeonatoAtual) {
		this.campeonatoAtual = campeonatoAtual;
	}
	/*
	public String verCategoriasNome(String idNome) {
		campeonatoAtual = campeonatoService.getCampeonatoByNome(idNome);
		return criarCategorias();
	}
	
	public String verCategorias(Campeonato campeonato) {
		campeonatoAtual = campeonatoService.getCampeonatoByNome(campeonato.getNome());
		return criarCategorias();
	}
	*/
	public String criarCategorias() {
		novaCategoria = new Categoria();
		return "Categoria";
	}
	
	public String salvarCategoria()
	{
		novoCampeonato.addCategorias(novaCategoria);
		novaCategoria.setCampeonato(novoCampeonato);
		return "Categoria";
	}

	public Categoria getNovaCategoria() {
		return novaCategoria;
	}

	public void setNovaCategoria(Categoria novacategoria) {
		this.novaCategoria = novacategoria;
	}
	
	/*
	private ArrayList<Campeonato> lista = new ArrayList<Campeonato>();
	
	private Campeonato camp = new Campeonato();
	
	public void salvar() {
		lista.add(camp);
		camp = new Campeonato();
	}

	public ArrayList<Campeonato> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Campeonato> lista) {
		this.lista = lista;
	}

	public Campeonato getCamp() {
		return camp;
	}

	public void setCamp(Campeonato camp) {
		this.camp = camp;
	}
	*/
}
