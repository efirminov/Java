package campo_minado_swing.src.br.com.efirminov.modelo;

public class ResultadoEvento {

	private final boolean ganhou;

	public ResultadoEvento(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public boolean isGanhou() {
		return ganhou;
	}
}