package managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import cruzeiro.Equipe;
import cruzeiro.Usuario;
import service.EquipeService;
import service.UsuarioService;

@ManagedBean
@SessionScoped
public class EquipeMB {
	
	private EquipeService equipeService = new EquipeService();
	
	private Equipe equipeAtual;
	private Equipe novaEquipe = new Equipe();
	private Usuario usuarioAtual;
	private UsuarioService usuarioService = new UsuarioService();
	
	public String salvar() {
		
		novaEquipe.setUsuario(usuarioAtual);
		usuarioAtual.addEquipe(novaEquipe);
		equipeService.save(novaEquipe);
		novaEquipe = new Equipe();
		
		return "Menu";
	}
	
	public void atualizar(RowEditEvent event) {

		Equipe e = ((Equipe) event.getObject());
		equipeService.save(e);
	}
	
	public void deletar(Equipe equipe) {
		equipeService.remove(equipe);
		
	}
	
	public List <Equipe> getEquipes()
	{
		return equipeService.getAll(Equipe.class);
	}
	
	public Equipe getEquipe() {
		return equipeAtual;
	}

	public EquipeService getEquipeService() {
		return equipeService;
	}

	public void setEquipeService(EquipeService equipeService) {
		this.equipeService = equipeService;
	}

	public Equipe getNovaEquipe() {
		return novaEquipe;
	}

	public void setNovaEquipe(Equipe novaEquipe) {
		this.novaEquipe = novaEquipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipeAtual = equipe;
	}
	
	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}

	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
	
	public List <Usuario> getUsuarios()
	{
		return usuarioService.getAll(Usuario.class);
	}
	
	public String verEquipesCPF (Usuario usuario)
	{
		usuarioAtual = usuarioService.getById(Usuario.class,usuario.getCPF());
		return criarEquipes();
	}
	
	public String criarEquipes()
	{	
		novaEquipe = new Equipe();
		return "Equipe";
	}
	
}
