package br.ufpb.aps.calculadores;

import br.ufpb.aps.interfaces.CalculadorDeSalario;

public class CalculaSalarioTecnicoAdministrativo implements CalculadorDeSalario {

	@Override
	public double calcularSalario() {
		return 2000 + 320;
	}

}
