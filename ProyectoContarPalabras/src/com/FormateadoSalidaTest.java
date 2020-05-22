package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FormateadoSalidaTest {

	@Test
	void textoCaracteresTotalTestUnaLetra() {
		assertEquals (FormateadoSalida.textoCaracteresTotal(1),"Hay 1 letra");
	}
	@Test
	void textoCaracteresTotalTestMultiplesLetras() {
		assertEquals (FormateadoSalida.textoCaracteresTotal(2),"Hay 2 letras");
	}
	
	@Test
	void textoNumeroPalabrasTestUnaPalabra() {
		assertEquals (FormateadoSalida.textoNumeroPalabras(1),"Hay 1 palabra");
	}
	@Test
	void textoNumeroPalabrasTestMultiplesPalabras() {
		assertEquals (FormateadoSalida.textoNumeroPalabras(2),"Hay 2 palabras");
	}

	@Test
	void textoTodosCaracteresTestVacio() {
		assertEquals (FormateadoSalida.textoTodosCaracteres(new int[] {0}) ,"");
	}

	@Test
	void textoTodosCaracteresTestUnCaracter() {
		assertEquals (FormateadoSalida.textoTodosCaracteres(new int[] {1}) ,"Hay 1 caracter   \"" + (char)(0) + "\"\n");
	}
	
	@Test
	void textoTodosCaracteresTestMultiplesCaracteres() {
		assertEquals (FormateadoSalida.textoTodosCaracteres(new int[] {0,2}) ,"Hay 2 caracteres \"" + (char)(1) + "\"\n");
	}

}
