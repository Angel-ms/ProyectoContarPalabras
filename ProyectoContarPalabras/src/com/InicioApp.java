package com;
import java.util.Scanner;
public class InicioApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase;
		System.out.println("Introduce la cadena");
		frase = input.nextLine();
		System.out.println(textoCaracteresTotal(ContadorPalabras.contarCaracteresTotal(frase)));
		System.out.println(textoNumeroPalabras(ContadorPalabras.contarNumeroPalabras(frase)));
		System.out.println(textoTodosCaracteres(ContadorPalabras.contarTodosCaracteres(frase)));
		input.close();
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