package com;
/**
 * 
 * @author alumno
 *
 */
public class FormateadoSalida {
	/**
	 * 
	 * @param total número de caracteres
	 * @return texto indicando el número de caracteres
	 */
	public static String textoCaracteresTotal (int total) {
		return("Hay " + total + " letra" + ((total==1)? "" : "s" ));
	}
	/**
	 * 
	 * @param total número de palabras
	 * @return texto indicando el número de palabras
	 */
	public static String textoNumeroPalabras (int total) {
		return("Hay " + total + " palabra" + ((total==1)? "" : "s" ));
	}
	/**
	 * 
	 * @param caracteres lista de caracteres y sus respectivas cantidades
	 * @return texto indicando la cantidad que hay de cada caracter
	 */
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
