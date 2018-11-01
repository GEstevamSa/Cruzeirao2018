package managedbean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.RowEditEvent;
import cruzeiro.Usuario;
import service.UsuarioService;



@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	private UsuarioService usuarioService = new UsuarioService();
	private Usuario usuarioAtual;
	private Usuario novoUsuario = new Usuario();
	
	public String salvar() 
	{
		usuarioService.save(novoUsuario);
		novoUsuario = new Usuario();
		usuarioService.closeEntityManager();
		return "Usuario";	
	}
	
	public Usuario getNovoUsuario() {
		return novoUsuario;
	}

	public void setNovoUsuario(Usuario novoUsuario) {
		this.novoUsuario = novoUsuario;
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
	
	public void atualizar(RowEditEvent event) {

		Usuario a =	 ((Usuario) event.getObject());
		usuarioService.save(a);
	}
	public void deletar(Usuario usuario) {
		usuarioService.remove(usuario);
		
	}
}
