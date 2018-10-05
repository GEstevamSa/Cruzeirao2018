package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import cruzeiro.Campeonato;
import cruzeiro.Categoria;
import cruzeiro.Usuario;
import service.CampeonatoService;
import service.UsuarioService;

@ManagedBean
@SessionScoped
public class CampeonatoMB {
	
	private CampeonatoService campeonatoService = new CampeonatoService();
	private Campeonato campeonatoAtual;
	private Campeonato novoCampeonato = new Campeonato();
	private Usuario usuarioAtual;
	private UsuarioService usuarioService = new UsuarioService();
	
	private Categoria novaCategoria;
	
	public String salvar() {
		
		campeonatoService.salvar(novoCampeonato);
		novoCampeonato = new Campeonato();
		return "menu";
	}
	
	public void atualizar(RowEditEvent event) {

		Campeonato c = ((Campeonato) event.getObject());
		campeonatoService.alterar(c);
	}
	
	public void deletar(Campeonato campeonato) {
		campeonatoService.remover(campeonato);
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

	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}
	
	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public CampeonatoService getCampeonatoService() {
		return campeonatoService;
	}

	public void setCampeonatoService(CampeonatoService campeonatoService) {
		this.campeonatoService = campeonatoService;
	}
	
	public String verCampeonatosCPF(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioCamp(usuario.getCPF());
		novoCampeonato = new Campeonato();
		return "Campeonato";
	}
	
	public String criarCampeonatos()
	{	
		novoCampeonato = new Campeonato();
		return "Campeonato";
	}
	
	
}
