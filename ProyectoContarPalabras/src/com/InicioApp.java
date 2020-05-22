package com;
import java.util.Scanner;
public class InicioApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		System.out.println("Introduce la cadena");
		frase = input.nextLine();
		System.out.println(textoCaracteresTotal(contarCaracteresTotal(frase)));
		System.out.println(textoNumeroPalabras(contarNumeroPalabras(frase)));
		System.out.println(textoTodosCaracteres(contarTodosCaracteres(frase)));
		input.close();
		}
	
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
	
	public static String textoCaracteresTotal (int total) {
		return("Hay " + total + " letra" + ((total==1)? "" : "s" ));
	}
	public static String textoNumeroPalabras (int total) {
		return("Hay " + total + " palabra" + ((total==1)? "" : "s" ));
	}
	public static String textoTodosCaracteres (int[] caracteres) {
		String listaCaracteres= "";
		for(int i=0; i<caracteres.length;i++) {
			if(caracteres[i]!=0){
				listaCaracteres+=("Hay " + caracteres[i] + " caracter"+((caracteres[i]==1)? "   " : "es ") +"\"" + (char)(i)+ "\"\n");
			}
		}
		return listaCaracteres;
	}

}