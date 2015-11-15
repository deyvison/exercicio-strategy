package br.ufpb.aps.calculadores;

import br.ufpb.aps.interfaces.CalculadorDeSalario;

public class CalculaSalarioCoordenadorCurso implements CalculadorDeSalario {

	@Override
	public double calcularSalario() {
		return 5500 + 800;
	}

}
