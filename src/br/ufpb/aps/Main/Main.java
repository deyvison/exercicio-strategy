package br.ufpb.aps.Main;

import br.ufpb.aps.calculadores.CalculaSalarioCoordenadorCurso;
import br.ufpb.aps.calculadores.CalculaSalarioProfessor;
import br.ufpb.aps.entity.Servidor;

public class Main {
	
	public static void main(String[] args) {
		
		Servidor s = new Servidor("Deyvison Oliveira", "12345", new CalculaSalarioProfessor());
		
		System.out.println(s.toString());
		
		
		// professor agora também é coordenador
		s.setCalculadorDeSalario(new CalculaSalarioCoordenadorCurso());
		
		System.out.println(s.toString());
	}
}
