package com;

public class ContadorPalabras {

	public static int contarCaracteresTotal(String cadena) {
		int numeroDeLetras=0;
		for(int i= 0; i< cadena.length(); i++) {
			if(cadena.charAt(i) != ' ') {
				numeroDeLetras++;
			}
		}		
		return numeroDeLetras;
	}
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
