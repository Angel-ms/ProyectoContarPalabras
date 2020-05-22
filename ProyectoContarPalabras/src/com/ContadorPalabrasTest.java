package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContadorPalabrasTest {

	@Test
	void contarCaracteresTotalTestNormal() {
		assertEquals (ContadorPalabras.contarCaracteresTotal("test"),4);
	}
	@Test
	void contarCaracteresTotalTestEspacios() {
		assertEquals (ContadorPalabras.contarCaracteresTotal("not blank spaces"),14);
	}
	
	@Test
	void contarNumeroPalabrasTestSimple() {
		assertEquals (ContadorPalabras.contarNumeroPalabras("test"),1);
	}
	@Test
	void contarNumeroPalabrasTestMultiple() {
		assertEquals (ContadorPalabras.contarNumeroPalabras("aqui hay muchas palabras"),4);
	}
	@Test
	void contarTodosCaracteresTestVacio() {
		int[] arrayResultado = ContadorPalabras.contarTodosCaracteres("");
		boolean esVacio = true;
		
		for (int i = 0; i < arrayResultado.length; i++) {
			if( arrayResultado[i] != 0) {
				esVacio = false;
			}
		}
		assertTrue (esVacio);
	}

	@Test
	void contarTodosCaracteresTest1() {
		int[] arrayResultado = ContadorPalabras.contarTodosCaracteres("1");
		boolean esCorrecto = true;
		
		for (int i = 0; i < arrayResultado.length; i++) {
			if( arrayResultado[i] != 0 && ( i!=((int)('1')) ) ) {
				esCorrecto = false;
			}
		}
		if(arrayResultado[(int)('1')] != 1) {
			esCorrecto = false;
		}
		
		assertTrue (esCorrecto);
		
	}


}
