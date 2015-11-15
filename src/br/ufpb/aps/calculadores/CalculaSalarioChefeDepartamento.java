package br.ufpb.aps.calculadores;

import br.ufpb.aps.interfaces.CalculadorDeSalario;

public class CalculaSalarioChefeDepartamento implements CalculadorDeSalario {

	@Override
	public double calcularSalario() {
		return 6000 + 1200;
	}

}
