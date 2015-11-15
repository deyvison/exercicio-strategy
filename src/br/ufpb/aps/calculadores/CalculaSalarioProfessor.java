package br.ufpb.aps.calculadores;

import br.ufpb.aps.interfaces.CalculadorDeSalario;

public class CalculaSalarioProfessor implements CalculadorDeSalario {

	@Override
	public double calcularSalario() {
		return 4500 + 520;
	}

}
