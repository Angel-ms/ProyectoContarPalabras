package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author alumno
 *
 */
class ContadorPalabrasTest {
	
	@Test
	/**
	 * Comprueba que cuenta correctamente los caracteres si no se incluyen espacios
	 */
	void contarCaracteresTotalTestNormal() {
		assertEquals (ContadorPalabras.contarCaracteresTotal("test"),4);
	}
	@Test
	/**
	 * Comprueba que cuenta correctamente los caracteres habiendo espacios
	 */
	void contarCaracteresTotalTestEspacios() {
		assertEquals (ContadorPalabras.contarCaracteresTotal("not blank spaces"),14);
	}
	
	@Test
	/**
	 * Comprueba que cuenta correctamente las palabras si solo hay una
	 */
	void contarNumeroPalabrasTestSimple() {
		assertEquals (ContadorPalabras.contarNumeroPalabras("test"),1);
	}
	@Test
	/**
	 * Comprueba que cuenta correctamente las palabras si hay varias
	 */
	void contarNumeroPalabrasTestMultiple() {
		assertEquals (ContadorPalabras.contarNumeroPalabras("aqui hay muchas palabras"),4);
	}
	
	@Test
	/**
	 * Comprueba que crea la lista correctamente si no hay ningún caracter
	 */
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
	/**
	 * Comprueba que crea la lista correctamente si hay algun caracter
	 */
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
