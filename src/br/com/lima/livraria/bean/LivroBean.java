package br.com.lima.livraria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class LivroBean {

	private Livro livro = new Livro();


	public Livro getLivro() {
		return livro;
	}
	
	public void gravar() {
		System.out.println("Gravando livro: "+this.livro.titulo); 
	}

}
