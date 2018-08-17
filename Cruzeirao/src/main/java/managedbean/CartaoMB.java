package managedbean;

import java.util.ArrayList;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Cartao;

@ManagedBean
@SessionScoped
public class CartaoMB {
	
private ArrayList<Cartao> lista = new ArrayList<Cartao>();
	
	private Cartao cart = new Cartao();
	
	public void salvar() {
		lista.add(cart);
		cart = new Cartao();
	}

	public ArrayList<Cartao> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cartao> lista) {
		this.lista = lista;
	}

	public Cartao getCart() {
		return cart;
	}

	public void setCart(Cartao cart) {
		this.cart = cart;
	}

}
