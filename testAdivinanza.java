package ar.edu.unlam.pb2.clase2;

import org.junit.Assert;
import org.junit.Test;

public class testAdivinanza {

	@Test
 public void testQueAdivineElNumero() {
		//1.Preparaci�n
		
		Integer valorAAcertar=8;
		Boolean valorEsperado= true;
		Adivinanza miAdivinanza = new Adivinanza (valorAAcertar);
		
		//2.Ejecuci�n
		Boolean valorObtenido= miAdivinanza.adivinar(valorAAcertar);
		
		//3.Contrastaci�n
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	 public void testQueElNumeroSeaMasGRandeQue() {
			//1.Preparaci�n
			
			
			//2.Ejecuci�n
			
			
			//3.Contrastaci�n
			
			
		}
	
}

