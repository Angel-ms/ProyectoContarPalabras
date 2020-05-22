package com;

import java.util.Scanner;

/**
 * 
 * @author alumno
 *
 */
public class InicioApp {
/**
 * Clase que recibe por teclado una cadena de caracteres y organiza al resto de clases para contar caracteres y palabras 
 * @param args
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		System.out.println("Introduce la cadena");
		frase = input.nextLine();
		System.out.println(FormateadoSalida.textoCaracteresTotal(ContadorPalabras.contarCaracteresTotal(frase)));
		System.out.println(FormateadoSalida.textoNumeroPalabras(ContadorPalabras.contarNumeroPalabras(frase)));
		System.out.println(FormateadoSalida.textoTodosCaracteres(ContadorPalabras.contarTodosCaracteres(frase)));
		input.close();
		}
	
	
	
}