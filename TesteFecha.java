package ar.edu.unlam.pb2.clase2;

import org.junit.Assert;
import org.junit.Test;

public class TesteFecha {

	@Test
	public void testQueVerifiqueQDosFechassSonIguales() {
		//1.Preparaci�n
		
		Fecha fecha1 = new Fecha(27, 8, 2019);
		
		Fecha fecha2 = new Fecha(27, 8, 2019);
		
		//2.Ejecuci�n
		
		
		//3.Contrastaci�n
		Assert.assertEquals(fecha1, fecha2);
	}
}
