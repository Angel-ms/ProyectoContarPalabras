package com;

/**
 * 
 * @author alumno
 *
 */
public class ContadorPalabras {
	/**
	 * 
	 * @param cadena texto que se va a analizar
	 * @return número de caracteres que no son espacios
	 */
	public static int contarCaracteresTotal(String cadena) {
		int numeroDeLetras=0;
		for(int i= 0; i< cadena.length(); i++) {
			if(cadena.charAt(i) != ' ') {
				numeroDeLetras++;
			}
		}		
		return numeroDeLetras;
	}
	/**
	 * 
	 * @param cadena texto que se va a analizar
	 * @return número de palabras separadas por espacios
	 */
	public static int contarNumeroPalabras(String cadena) {
		int numeroDePalabras=0;
		char caracterAnterior;
		cadena=cadena.trim();
		
		if(!(cadena.equals(""))) {
			caracterAnterior=' ';
			numeroDePalabras++;
			for(int i= 0; i< cadena.length(); i++) {
				if (cadena.charAt(i) == ' ' && caracterAnterior!=' ') {
					numeroDePalabras++;
				}
				caracterAnterior=cadena.charAt(i);
			}
		}
		return numeroDePalabras;
		
	}
	/**
	 * 
	 * @param cadena texto que se va a analizar
	 * @return listado de todos los caracteres y el número que hay de cada uno
	 */
	public static int[] contarTodosCaracteres(String cadena) {
		int[] unicode = new int[65536];
		String cadenaSinTrim = cadena;
		cadena=cadena.trim();
		for(int i=0; i<unicode.length;i++) {
			unicode[i]=0;
		}
		unicode[(int)(' ')]=(cadenaSinTrim.length()-(cadena.length()));
		
		for(int i=0; i< cadena.length(); i++) {
			unicode[(int)(cadena.charAt(i))]++;		
		}
		return unicode;
	}
}
