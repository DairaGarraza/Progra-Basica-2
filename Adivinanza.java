package ar.edu.unlam.pb2.clase2;

public class Adivinanza {

	private Integer numero;
	
	public Adivinanza(Integer numero) {
		this.numero=numero;
	}
	
	public Boolean adivinar (Integer numero) {
		return this.numero == numero;
	}
	
	public Boolean esmasgrandeq (Integer numero) {
		return this.numero > numero;
	}
	public Boolean esmaschicoq(Integer numero) {
		return this.numero < numero;
	}
	
	
}
