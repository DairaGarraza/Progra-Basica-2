package ar.edu.unlam.pb2.subasta;

import org.junit.Assert;
import org.junit.Test;

public class TestSubasta {
	@Test
	public void testQueSePuedaCrearUnaSubasta() {
		Subasta miSubasta = new Subasta(40);
	}

	@Test
	public void testQueUnaVezCerradaNoRecibaMasOfertas() {
		
		// 1.Preparacion
		Integer valorInicial = 100;
		Subasta miSubasta = new Subasta(valorInicial);
		Integer primerOferta = 150;
		Integer ultimaOferta = 250;

		// 2.Ejecución
		miSubasta.ofertar(primerOferta);
		Integer valorEsperado = miSubasta.cerrar();
		miSubasta.ofertar(ultimaOferta);
		Integer valorObtenido = miSubasta.cerrar();

		// 3.Contrastación
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
}
