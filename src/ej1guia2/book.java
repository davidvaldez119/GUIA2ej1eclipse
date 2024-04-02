package ej1guia2;

import java.util.Arrays;

public class book {
	private String titulo;
	private Double precio;
	private Integer Stock;
	private author[]authors;
	
	public book(String titulo, Double precio, Integer stock, author[] authors) {
		this.titulo = titulo;
		this.precio = precio;
		Stock = stock;
		this.authors = authors;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
	}

	public author[] getAuthors() {
		return authors;
	}

	public void setAuthors(author[] authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "book [titulo=" + titulo + ", precio=" + precio + ", Stock=" + Stock + ", authors="
				+ Arrays.toString(authors) + "]";
	}
	

}
