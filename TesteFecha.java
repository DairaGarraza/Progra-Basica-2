package ar.edu.unlam.pb2.clase2;

import org.junit.Assert;
import org.junit.Test;

public class TesteFecha {

	@Test
	public void testQueVerifiqueQDosFechassSonIguales() {
		//1.Preparación
		
		Fecha fecha1 = new Fecha(27, 8, 2019);
		
		Fecha fecha2 = new Fecha(27, 8, 2019);
		
		//2.Ejecución
		
		
		//3.Contrastación
		Assert.assertEquals(fecha1, fecha2);
	}
}
