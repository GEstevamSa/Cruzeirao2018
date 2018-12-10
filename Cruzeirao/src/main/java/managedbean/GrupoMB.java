package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import cruzeiro.Fase;
import cruzeiro.Grupo;
import cruzeiro.Rodada;
import service.FaseService;
import service.GrupoService;

@ManagedBean
@SessionScoped
public class GrupoMB {
	
	private FaseService faseService = new FaseService();
	private GrupoService grupoService = new GrupoService();
	private Grupo novoGrupo = new Grupo();
	private Grupo GrupoAtual;
	private Fase FaseAtual;
	private Fase novaFase = new Fase();
	private Rodada novaRodada;
	
	public String salvar() {
		novoGrupo.setFase(FaseAtual);
		FaseAtual.addGrupos(novoGrupo);
		grupoService.save(novoGrupo);
		novoGrupo = new Grupo();
		faseService.closeEntityManager();
		grupoService.closeEntityManager();
	
		return "Grupo";
	}
	
	public void atualizar(RowEditEvent event) {

		Grupo fas = ((Grupo) event.getObject());
		grupoService.save(fas);
	}
	
	public void deletar(Grupo grupo) {
		grupoService.remove(grupo);
	}
	
	public List <Grupo> getGrupos(){
		return grupoService.getAll(Grupo.class);
	}
	
	public String criarFases() {
		novaFase = new Fase();
		return "fase";
	}
	
	public String criarRodadas() {
		novaRodada = new Rodada();
		return "rodada";
	}

	public Grupo getNovoGrupo() {
		return novoGrupo;
	}

	public void setNovoGrupo(Grupo novoGrupo) {
		this.novoGrupo = novoGrupo;
	}

	public Fase getNovaFase() {
		return novaFase;
	}

	public void setNovaFase(Fase novaFase) {
		this.novaFase = novaFase;
	}

	public Rodada getNovaRodada() {
		return novaRodada;
	}

	public void setNovaRodada(Rodada novaRodada) {
		this.novaRodada = novaRodada;
	}

	public Grupo getGrupoAtual() {
		return GrupoAtual;
	}

	public void setGrupoAtual(Grupo grupoAtual) {
		GrupoAtual = grupoAtual;
	}

	public Fase getFaseAtual() {
		return FaseAtual;
	}

	public void setFaseAtual(Fase faseAtual) {
		FaseAtual = faseAtual;
	}

	public FaseService getFaseService() {
		return faseService;
	}

	public void setFaseService(FaseService faseService) {
		this.faseService = faseService;
	}

	public GrupoService getGrupoService() {
		return grupoService;
	}

	public void setGrupoService(GrupoService grupoService) {
		this.grupoService = grupoService;
	}
	
	
	
	
}