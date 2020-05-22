package com;

public class FormateadoSalida {
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
