package managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import cruzeiro.Categoria;
import cruzeiro.Fase;
import cruzeiro.Grupo;
import service.CategoriaService;
import service.FaseService;

@ManagedBean
@SessionScoped
public class FaseMB {
	
		private CategoriaService categoriaService = new CategoriaService();
		private FaseService faseService = new FaseService();
		private Fase novaFase = new Fase();
		private Fase faseAtual;
		private Categoria categoriaAtual;
		private Categoria novaCategoria = new Categoria();
		private Grupo novoGrupo;
			
		public String salvar() {
			novaFase.setCategoria(categoriaAtual);
			categoriaAtual.addFases(novaFase);
			faseService.save(novaFase);
			novaFase = new Fase();
			categoriaService.closeEntityManager();
			faseService.closeEntityManager();
			return "fase";
		}
		
		public void atualizar(RowEditEvent event) {

			Fase fas = ((Fase) event.getObject());
			faseService.save(fas);
		}
		
		public void deletar(Fase fase) {
			faseService.remove(fase);
		}
		
		public List<Fase> getFases(){
			return faseService.getAll(Fase.class);
		}

		public CategoriaService getCategoriaService() {
			return categoriaService;
		}

		public void setCategoriaService(CategoriaService categoriaService) {
			this.categoriaService = categoriaService;
		}

		public FaseService getFaseService() {
			return faseService;
		}

		public void setFaseService(FaseService faseService) {
			this.faseService = faseService;
		}

		public Fase getNovaFase() {
			return novaFase;
		}

		public void setNovaFase(Fase novaFase) {
			this.novaFase = novaFase;
		}

		public Fase getFaseAtual() {
			return faseAtual;
		}

		public void setFaseAtual(Fase faseAtual) {
			this.faseAtual = faseAtual;
		}

		public Categoria getCategoriaAtual() {
			return categoriaAtual;
		}

		public void setCategoriaAtual(Categoria categoriaAtual) {
			this.categoriaAtual = categoriaAtual;
		}

		public Categoria getNovaCategoria() {
			return novaCategoria;
		}

		public void setNovaCategoria(Categoria novaCategoria) {
			this.novaCategoria = novaCategoria;
		}

		public Grupo getNovoGrupo() {
			return novoGrupo;
		}

		public void setNovoGrupo(Grupo novoGrupo) {
			this.novoGrupo = novoGrupo;
		}
		
		public String verFases(Categoria categoria) {
			
			categoriaAtual = categoriaService.getById(Categoria.class,categoria.getId());
			novaFase = new Fase();
			
			return "Fase";
		}
}
