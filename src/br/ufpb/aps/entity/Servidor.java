package br.ufpb.aps.entity;

import br.ufpb.aps.interfaces.CalculadorDeSalario;

public class Servidor {

	private String nome;
	private String siape;
	private CalculadorDeSalario calculador;

	public Servidor(String nome, String siape, CalculadorDeSalario calculador) {
		this.nome = nome;
		this.siape = siape;
		this.calculador = calculador;
	}

	public double getSalario() {
		return this.calculador.calcularSalario();
	}

	public void setCalculadorDeSalario(CalculadorDeSalario calculador) {
		this.calculador = calculador;
	}

	public String getNome() {
		return nome;
	}

	public String getSiape() {
		return siape;
	}

	@Override
	public String toString() {
		return "Servidor [nome=" + nome + ", siape=" + siape + ", salario=" + calculador.calcularSalario() + "]";
	}
	
	

}
