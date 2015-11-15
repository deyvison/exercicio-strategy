package br.ufpb.aps.calculadores;

import br.ufpb.aps.interfaces.CalculadorDeSalario;

public class CalculaSalarioReitor implements CalculadorDeSalario {

	@Override
	public double calcularSalario() {
		return 10000 + 2670;
	}

}
