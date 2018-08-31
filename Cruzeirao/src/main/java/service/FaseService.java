package service;

import java.util.ArrayList;
import java.util.List;

import cruzeiro.Fase;


public class FaseService {
	
private ArrayList<Fase> fases = Dados.FASES;
	
	public List<Fase> getFases() {
		return fases;
	}
	
	public void salvar(Fase fase) {
		fases.add(fase);
	}
	
}
