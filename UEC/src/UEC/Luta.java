package UEC;

import java.util.Random;

public class Luta {
	private UEC desafiante;
	private UEC desafiado;
	private int rounds;
	private boolean aprovada;
	
	//Métodos Especiais
	
	public UEC getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(UEC desafiante) {
		this.desafiante = desafiante;
	}
	public UEC getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(UEC desafiado) {
		this.desafiado = desafiado;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//Métodos Públicos
	public void marcarLuta(UEC l1, UEC l2) {
		if (l1.getCategoria() == (l2.getCategoria())
				&& l1 != l2) {
			setAprovada(true);
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			setAprovada(false);
			this.desafiante = null;
			this.desafiado = null;
			System.out.println("LUTA INVÁLIDA. Mesmos lutadores.");
		}
	}
	public void lutar() {
		if (this.aprovada == true) {
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			
		Random aleatorio = new Random();
		int vencedor = aleatorio.nextInt(3); //0 1 2
		switch(vencedor) {
		case 0: // Empate
			System.out.println("Empatou!");
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			break;
		case 1: // Desafiante vence
			System.out.println("Vitória de: " + this.desafiante.getNome());
			this.desafiante.ganharLuta();
			this.desafiado.perderLuta();
			break;
		case 2: // Desafiado vence
			System.out.println("Vitória de: " + this.desafiado.getNome());
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			break;
			}
		}
	}
	
	
}
