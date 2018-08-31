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
	
	public String verEquipesCPF(String cpf)
	{
		usuarioAtual = usuarioService.getUsuarioId(cpf);
		return "Equipe";
	}
	
	public String verEquipes(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioId(usuario.getCPF());
		return criarEquipes();
	}
	
	
	public String verCampeonatosCPF(String cpf)
	{
		usuarioAtual = usuarioService.getUsuarioId(cpf);
		return "Campeonato";
	}
	
	
	public String verCampeonatos(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioId(usuario.getCPF());
		return criarCampeonatos();
	}
	
	
	
	
	/*
	private Usuario novoUsuario = new Usuario();
	private UsuarioService usuarioService = new UsuarioService();
	
	private CampeonatoService campeonatoService = new CampeonatoService();
	private CategoriaService categoriaService = new CategoriaService();
	private EquipeService equipeService = new EquipeService();
	private FaseService faseService = new FaseService();
	private GrupoService grupoService = new GrupoService();
	private InscricaoService insService = new InscricaoService();
	private PartidaService partService = new PartidaService();
	private RodadaService rodService = new RodadaService();
	
	
   
   // private Usuario usuarioAtual;
    
    
    private Equipe  novaEquipe = new Equipe();
    private Equipe equipeAtual;
    
    private Campeonato novocamp = new Campeonato();
    private Campeonato campAtual;
    
    private Categoria novacat = new Categoria();
    private Categoria catAtual;
    
    private Fase novafas = new Fase();
    private Fase fasAtual;
    
    private Grupo novogru = new Grupo();
    private Grupo gruAtual;
    
    private Inscricao novains = new Inscricao();
    private Inscricao insAtual;
    
    private Partida novapart = new Partida();
    private Partida partAtual;
    
    private Rodada novarod = new Rodada();
    private Rodada rodAtual;
    
	
	public void salvar()
	{
		usuarioService.salvar(novoUsuario);
		novoUsuario = new Usuario();
		//return "Usuario";
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

	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}
	public String salvarEquipe()
	{
		usuarioService.salvarEquipe(novaEquipe);
		novoUsuario = new Usuario();
		usuarioAtual.getEquipes().add(novaEquipe);
		novaEquipe.setUsuario(usuarioAtual);
		return "Equipe";
	}
	
	public String salvarCamp()
	{
		usuarioService.salvarCamp(novocamp);
		novoUsuario = new Usuario();
		usuarioAtual.getCampeonatos().add(novocamp);
		novocamp.setUsuario(usuarioAtual);
		return "Campeonato";	
	}
	
	@SuppressWarnings("unchecked")
	public String salvarFas() {
		
		categoriaService.salvarFase(novafas);
		novacat = new Categoria();
		catAtual.getInscricoes().addAll((Collection<? extends Inscricao>) novafas);
		novafas.setCategoria(catAtual);
		return "Fase";
	}
	
	public String salvarGru() {
		campeonatoService.salvarCat(novacat);
		usuarioAtual = new Usuario();
		usuarioAtual.getCampeonatos().add(novocamp);
		novocamp.setUsuario(usuarioAtual);
		return "Categoria";
	}
	
	public String salvarInsEquip() {
		
		equipeService.salvarInscricao(novains);
		novaEquipe = new Equipe();
		//equipeAtual.getEquipes().add()
		
		return "Categoria";
	}
	
	public String salvarPart() {
		campeonatoService.salvarCat(novacat);
		usuarioAtual = new Usuario();
		usuarioAtual.getCampeonatos().add(novocamp);
		novocamp.setUsuario(usuarioAtual);
		return "Categoria";
	}
	
	public String salvarRod() {
		campeonatoService.salvarCat(novacat);
		usuarioAtual = new Usuario();
		usuarioAtual.getCampeonatos().add(novocamp);
		novocamp.setUsuario(usuarioAtual);
		return "Categoria";
	}
	
	public String salvarCat() {
		
		campeonatoService.salvarCat(novacat);
		novoUsuario= new Usuario();
		campAtual.getCategorias().add(novacat);
		novocamp.setUsuario(usuarioAtual);
		return "Categoria";
	}
	
	public List<Usuario> getUsuario() {
		return usuarioService.getUsuarios();
	}
	
	public String verEquipes(String codigo)
	{
		usuarioAtual = usuarioService.getUsuarioById(Integer.parseInt(codigo));
		return "Equipe";
	}
	
	public String verEquipes(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioById(usuario.getCodigo());
		return "Equipe";
	}

	public String criarEquipe()
	{
		novaEquipe = new Equipe();
		return "Equipe";	
	}
	
	public String verCamp(String codigo)
	{
		usuarioAtual = usuarioService.getUsuarioById(Integer.parseInt(codigo));
		return "Campeonato";
	}
	
	public String verCamp(Usuario usuario)
	{
		usuarioAtual = usuarioService.getUsuarioById(usuario.getCodigo());
		return "Campeonato";
	}

	public String criarCamp()
	{
		novocamp = new Campeonato();
		return "Menu";	
	}
	
	public String verCat(String nomecamp)
	{
		novocamp = usuarioService.getCampByNome(nomecamp);
		return "Categoria";
	}
	
	public String verCat(Campeonato campeonato)
	{
		novocamp = usuarioService.getCampByNome(campeonato.getNomeCampeonato());
		return "Categoria";
	}

	public String criarCat()
	{
		novocamp = new Campeonato();
		return "Categoria";	
	}

	

	public void setUsuarioAtual(Usuario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}

	public Campeonato getNovocamp() {
		return novocamp;
	}

	public void setNovocamp(Campeonato novocamp) {
		this.novocamp = novocamp;
	}

	public Categoria getNovacat() {
		return novacat;
	}

	public void setNovacat(Categoria novacat) {
		this.novacat = novacat;
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
	

	public CategoriaService getCategoriaService() {
		return categoriaService;
	}
	

	public void setCategoriaService(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	

	public EquipeService getEquipeService() {
		return equipeService;
	}
	

	public void setEquipeService(EquipeService equipeService) {
		this.equipeService = equipeService;
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
	

	public InscricaoService getInsService() {
		return insService;
	}
	

	public void setInsService(InscricaoService insService) {
		this.insService = insService;
	}
	

	public PartidaService getPartService() {
		return partService;
	}
	

	public void setPartService(PartidaService partService) {
		this.partService = partService;
	}
	

	public RodadaService getRodService() {
		return rodService;
	}
	

	public void setRodService(RodadaService rodService) {
		this.rodService = rodService;
	}
	

	public Equipe getEquipeAtual() {
		return equipeAtual;
	}
	

	public void setEquipeAtual(Equipe equipeAtual) {
		this.equipeAtual = equipeAtual;
	}
	

	public Campeonato getCampAtual() {
		return campAtual;
	}
	

	public void setCampAtual(Campeonato campAtual) {
		this.campAtual = campAtual;
	}
	

	public Categoria getCatAtual() {
		return catAtual;
	}
	

	public void setCatAtual(Categoria catAtual) {
		this.catAtual = catAtual;
	}
	

	public Fase getNovafas() {
		return novafas;
	}
	

	public void setNovafas(Fase novafas) {
		this.novafas = novafas;
	}
	

	public Fase getFasAtual() {
		return fasAtual;
	}
	

	public void setFasAtual(Fase fasAtual) {
		this.fasAtual = fasAtual;
	}
	

	public Grupo getNovogru() {
		return novogru;
	}
	

	public void setNovogru(Grupo novogru) {
		this.novogru = novogru;
	}
	

	public Grupo getGruAtual() {
		return gruAtual;
	}
	

	public void setGruAtual(Grupo gruAtual) {
		this.gruAtual = gruAtual;
	}
	

	public Inscricao getNovains() {
		return novains;
	}
	

	public void setNovains(Inscricao novains) {
		this.novains = novains;
	}
	

	public Inscricao getInsAtual() {
		return insAtual;
	}
	

	public void setInsAtual(Inscricao insAtual) {
		this.insAtual = insAtual;
	}
	

	public Partida getNovapart() {
		return novapart;
	}
	

	public void setNovapart(Partida novapart) {
		this.novapart = novapart;
	}
	

	public Partida getPartAtual() {
		return partAtual;
	}
	

	public void setPartAtual(Partida partAtual) {
		this.partAtual = partAtual;
	}
	

	public Rodada getNovarod() {
		return novarod;
	}
	

	public void setNovarod(Rodada novarod) {
		this.novarod = novarod;
	}
	

	public Rodada getRodAtual() {
		return rodAtual;
	}
	

	public void setRodAtual(Rodada rodAtual) {
		this.rodAtual = rodAtual;
	}
	*/
}
