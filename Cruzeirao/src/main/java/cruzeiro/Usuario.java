package cruzeiro;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.primefaces.event.SelectEvent;

@Entity
public class Usuario {
	@Id
	@Column(name = "id")
	private String CPF;
	private String nome;
	private String RG;
	private String sexo;
	private String email;
	private Date dataNascimento;
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy= "usuario")
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy= "usuario")
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	
	public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", 
        		format.format(event.getObject())));
    }
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Transient
	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneMovel() {
		return telefoneMovel;
	}
	public void setTelefoneMovel(String telefoneMovel) {
		this.telefoneMovel = telefoneMovel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rg) {
		this.RG = rg;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}
	public void addEquipe(Equipe equipe)
	{
		equipes.add(equipe);
	}
	public void addCampeonatos(Campeonato campeonato)
	{
		campeonatos.add(campeonato);
	}	
}