package br.com.lima.livraria.bean;

public class Livro {
	public String titulo;
	public String isbn;
	public double preco;
	public String datalancamento;
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	/**
	 * @return the datalancamento
	 */
	public String getDatalancamento() {
		return datalancamento;
	}
	/**
	 * @param datalancamento the datalancamento to set
	 */
	public void setDatalancamento(String datalancamento) {
		this.datalancamento = datalancamento;
	}

	
}