package exemplo.model;

import exemplo.repository.Comandos;

public class Aviao implements Comandos {

	// Atributos
	private String marca;

	// Método Construtor
	public Aviao(String marca) {
		this.marca = marca;
	}

	// Métodos de Acesso
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Métodos Implementados (Implementado refere a ter lógica adicionado)
	
	@Override // Representa uma Sobrescrista de Método
	public void iniciar() {
		System.out.println("O avião da marca " + marca + " está decolando...");
	}

	@Override
	public void parar() {
		System.out.println("O avião da marca " + marca + " está pousando...");
	}

}
