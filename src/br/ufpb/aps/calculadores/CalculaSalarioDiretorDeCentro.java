package br.ufpb.aps.calculadores;

import br.ufpb.aps.interfaces.CalculadorDeSalario;

public class CalculaSalarioDiretorDeCentro implements CalculadorDeSalario {

	@Override
	public double calcularSalario() {
		return 8000 + 2000;
	}

}
