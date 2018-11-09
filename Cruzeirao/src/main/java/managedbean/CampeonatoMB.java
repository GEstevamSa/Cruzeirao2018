package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import cruzeiro.Campeonato;
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

	
	public String salvar() {
		novoCampeonato.setUsuario(usuarioAtual);
		usuarioAtual.addCampeonatos(novoCampeonato);
		campeonatoService.save(novoCampeonato);
		novoCampeonato = new Campeonato();
		usuarioService.closeEntityManager();
		campeonatoService.closeEntityManager();
		return "Campeonato";
	}
	
	public void atualizar(RowEditEvent event) {

		Campeonato c = ((Campeonato) event.getObject());
		campeonatoService.save(c);
	}
	
	public void deletar(Campeonato campeonato) {
		campeonatoService.remove(campeonato);
	}
	
	public List <Campeonato> getCampeonatos()
	{
		return campeonatoService.getAll(Campeonato.class);
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
	
	public List<Usuario> getUsuarios(){
		return usuarioService.getAll(Usuario.class);
	}

	public CampeonatoService getCampeonatoService() {
		return campeonatoService;
	}

	public void setCampeonatoService(CampeonatoService campeonatoService) {
		this.campeonatoService = campeonatoService;
	}
	
	
	public String verCampeonatosCPF(Usuario usuario)
	{
		usuarioAtual = usuarioService.getById(Usuario.class,usuario.getCPF());
		return criarCampeonatos();
	}
	
	public String criarCampeonatos()
	{	
		novoCampeonato = new Campeonato();
		return "Campeonato";
	}
	
	
}
