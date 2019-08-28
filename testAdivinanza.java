package ar.edu.unlam.pb2.clase2;

import org.junit.Assert;
import org.junit.Test;

public class testAdivinanza {

	@Test
 public void testQueAdivineElNumero() {
		//1.Preparación
		
		Integer valorAAcertar=8;
		Boolean valorEsperado= true;
		Adivinanza miAdivinanza = new Adivinanza (valorAAcertar);
		
		//2.Ejecución
		Boolean valorObtenido= miAdivinanza.adivinar(valorAAcertar);
		
		//3.Contrastación
		Assert.assertEquals(valorEsperado, valorObtenido);
	}
	@Test
	 public void testQueElNumeroSeaMasGRandeQue() {
			//1.Preparación
			
			
			//2.Ejecución
			
			
			//3.Contrastación
			
			
		}
	
}

