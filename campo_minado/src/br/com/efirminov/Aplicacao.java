package br.com.efirminov;

import br.com.efirminov.modelo.Tabuleiro;
import br.com.efirminov.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}