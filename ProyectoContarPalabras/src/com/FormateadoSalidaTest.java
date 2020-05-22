package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author alumno
 *
 */
class FormateadoSalidaTest {

	@Test
	/**
	 * Comprueba que el texto se muestra correctamente en singular
	 */
	void textoCaracteresTotalTestUnaLetra() {
		assertEquals (FormateadoSalida.textoCaracteresTotal(1),"Hay 1 letra");
	}
	@Test
	/**
	 * Comprueba que el texto se muestra correctamente en plural
	 */
	void textoCaracteresTotalTestMultiplesLetras() {
		assertEquals (FormateadoSalida.textoCaracteresTotal(2),"Hay 2 letras");
	}
	
	@Test
	/**
	 * Comprueba que el texto se muestra correctamente en singular
	 */
	void textoNumeroPalabrasTestUnaPalabra() {
		assertEquals (FormateadoSalida.textoNumeroPalabras(1),"Hay 1 palabra");
	}
	@Test
	/**
	 * Comprueba que el texto se muestra correctamente en plural
	 */
	void textoNumeroPalabrasTestMultiplesPalabras() {
		assertEquals (FormateadoSalida.textoNumeroPalabras(2),"Hay 2 palabras");
	}

	@Test
	/**
	 * Comprueba que no se muestra texto si no hay ningun caracter
	 */
	void textoTodosCaracteresTestVacio() {
		assertEquals (FormateadoSalida.textoTodosCaracteres(new int[] {0}) ,"");
	}

	@Test
	/**
	 * Comprueba que el texto se muestra correctamente en singular
	 */
	void textoTodosCaracteresTestUnCaracter() {
		assertEquals (FormateadoSalida.textoTodosCaracteres(new int[] {1}) ,"Hay 1 caracter   \"" + (char)(0) + "\"\n");
	}
	
	@Test
	/**
	 * Comprueba que el texto se muestra correctamente en plural
	 */
	void textoTodosCaracteresTestMultiplesCaracteres() {
		assertEquals (FormateadoSalida.textoTodosCaracteres(new int[] {0,2}) ,"Hay 2 caracteres \"" + (char)(1) + "\"\n");
	}

}
