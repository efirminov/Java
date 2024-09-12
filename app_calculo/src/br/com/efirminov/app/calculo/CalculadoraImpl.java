package br.com.efirminov.app.calculo;

import java.lang.System.Logger;

import br.com.efirminov.app.Calculadora;
import br.com.efirminov.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraImpl implements Calculadora {
	
	private String id = "abc";

	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}
}