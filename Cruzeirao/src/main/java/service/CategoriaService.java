package service;

import java.util.ArrayList;
import java.util.List;

import cruzeiro.Categoria;


public class CategoriaService {
	
private ArrayList<Categoria> categorias = Dados.CATEGORIAS;
	
	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public void salvar(Categoria categoria) {
		categorias.add(categoria);
	}
	
	public Categoria getCategoriaByNome(String idNome) {
		for(int i=0; i< categorias.size(); i++)
			if(idNome == categorias.get(i).getNome())
				return categorias.get(i);
		
		return null;
	}
	
}
