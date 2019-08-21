package ar.edu.unlam.pb2.subasta;

public class Subasta {

	private Integer valor;
	private boolean abierta;

	public Subasta(Integer valor) {
		this.valor = valor;
		this.abierta = true;
	}

	public void ofertar(Integer valor) {

		if (abierta == true && this.valor < valor) {
			this.valor = valor;
		}
	}

	public Integer cerrar() {

		this.abierta = false;
		return this.valor;

	}
}
