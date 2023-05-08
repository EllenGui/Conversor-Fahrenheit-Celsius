package com.lista7;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ConversorTest 
{

    @Test
	public void testeconversor() {
		Conversor converter = new Conversor();

		double grausF = 50;
		double grausC = converter.fahrenheitToCelsius(grausF);

		assertEquals(10,00 , grausC);
	}
}
