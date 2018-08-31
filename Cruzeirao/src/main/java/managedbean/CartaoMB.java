package managedbean;

import java.util.ArrayList;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Cartao;

@ManagedBean
@SessionScoped
public class CartaoMB {
	
	
private ArrayList<Cartao> lista = new ArrayList<>();
	
	private Cartao cartao = new Cartao();
	
	public void salvar() {
		lista.add(cartao);
		cartao = new Cartao();
	}
	
	public ArrayList<Cartao> getLista(){
		return lista;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public void setLista(ArrayList<Cartao > lista) {
		this.lista = lista;
	}
	
	/*
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
	*/
}
