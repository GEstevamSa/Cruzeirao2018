package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Campeonato;
import cruzeiro.Categoria;
import cruzeiro.Fase;
import cruzeiro.Usuario;
import service.CategoriaService;
import service.UsuarioService;

@ManagedBean
@SessionScoped
public class CategoriaMB {
	
	private CategoriaService categoriaService = new CategoriaService();
	private Categoria novaCategoria = new Categoria();
	private Categoria categoriaAtual;
	private Fase novaFase;
	private Usuario usuarioAtual;
	private UsuarioService usuarioService = new UsuarioService();
	private Campeonato campeonatoAtual;
	private Campeonato novoCampeonato = new Campeonato();
	
	public String salvar() {
		categoriaService.salvar(novaCategoria);
		novaCategoria = new Categoria();
		return "menu";
	}
	/*
	public String verFasesNome(String idNome)
	{
		categoriaAtual = categoriaService.getCategoriaByNome(idNome);
		return criarFases();
	}
	
	public String verFases(Categoria categoria)
	{
		categoriaAtual = categoriaService.getCategoriaByNome(categoria.getNome());
		return criarFases();
	}
	*/
	public List<Categoria> getCategorias(){
		return categoriaService.getCategorias();
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
		return "listarFaseCategoria";
	}

	public Fase getNovaFase() {
		return novaFase;
	}

	public void setNovaFase(Fase novaFase) {
		this.novaFase = novaFase;
	}
	
	public String verCampeonatosCPF(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioIdbyCPF(usuario.getCPF());
		novoCampeonato = new Campeonato();
		return "Campeonato";
	}
	
	public String salvarCategoria()
	{
		novoCampeonato.addCategorias(novaCategoria);
		novaCategoria.setCampeonato(novoCampeonato);
		return "Categoria";
	}
	
}
