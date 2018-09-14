package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Usuario;
import service.UsuarioService;
import cruzeiro.Campeonato;
import cruzeiro.Equipe;


@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	private UsuarioService usuarioService = new UsuarioService();
	
	private Equipe novaEquipe;
	private Campeonato novoCampeonato;
	private Usuario usuarioAtual;
	
	private Usuario novoUsuario = new Usuario();
	
	
	
	public String salvar() {
		usuarioService.salvar(novoUsuario);
		novoUsuario = new Usuario();
		return "Usuario";	
	}
	
	public String criarEquipes()
	{	
		novaEquipe = new Equipe();
		return "Equipe";
	}
	
	public String criarCampeonatos()
	{
		novoCampeonato = new Campeonato();
		return "Campeonato";
	}
	

	public String salvarEquipe()
	{
		usuarioAtual.addEquipe(getNovaEquipe());
		novaEquipe.setUsuario(usuarioAtual);
		return "Equipe";
	}
	
	
	public String salvarCampeonato()
	{
		usuarioAtual.addCampeonatos(novoCampeonato);
		novoCampeonato.setUsuario(usuarioAtual);
		return "Campeonato";
	}
	
	public Usuario getNovoUsuario() {
		return novoUsuario;
	}


	public void setNovoUsuario(Usuario novoUsuario) {
		this.novoUsuario = novoUsuario;
	}


	public Equipe getNovaEquipe() {
		return novaEquipe;
	}

	public void setNovaEquipe(Equipe novaEquipe) {
		this.novaEquipe = novaEquipe;
	}
	
	public Campeonato getNovoCampeonato() {
		return novoCampeonato;
	}
	
	public void setNovoCampeonato(Campeonato novocampeonato) {
		this.novoCampeonato = novocampeonato;
	}


	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}


	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
	
	public List <Usuario> getUsuarios()
	{
		return usuarioService.getUsuarios();
	}
	
	public String verEquipesCPF (Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioId(usuario);
		return criarEquipes();
	}
	/*
	public String verCampeonatos (Usuario usuario) 
	{
		usuarioAtual = usuarioService.getUsuarioId(usuario.getCPF());
	return criarCampeonatos();
	}
	*/
}
