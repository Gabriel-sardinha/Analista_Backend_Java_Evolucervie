package atividade;

import java.util.Scanner;

public class Atividade {
	
	public static void main(String[] args) {

//		1- Escreva um programa que imprima os números de 1 a 100. Mas para múltiplos de três imprima 'Tico' em vez do número e para os múltiplos de cinco imprima 'Teco'.
//		Para números que são múltiplos de três e cinco imprimir 'TicoTeco'.
//		Exemplo, para o caso de 1 a 5, o programa nos daria '1, 2, Tico, 4, Teco'.
//		Utilize o esqueleto a seguir para implementar seu código:
		
		ticoTeco();
		
//		2- Um palíndromo é uma palavra que pode ser lida da esquerda para a direita e vice-versa.
//		Escreva uma função que verifica se a palavra dada é um palíndromo.
//		Caracteres em caixa alta devem ser ignorados.
//		Por exemplo, isPalindrome("Deleveled") deve retornar True, já que é um palíndromo por ser possível ser lido nos dois sentidos.
//		Utilize o esqueleto a seguir para implementar seu código:
		
		System.out.println("Digite uma palavra: ");
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
        boolean resposta = isPalindrome(palavra);
        scan.close();
        
        if(resposta) {
        	System.out.println("É um palindromo");
        } else {
        	System.out.println("Não é um palindromo");
        }
        
	}
	
	
	
	public static void ticoTeco(){
       
		boolean validador;
		
		for (int i=1; i<=100; i++) {
            validador = false;
            if(i % 3 == 0) {
            	System.out.print("tico");
            	validador = true;
            } 
            if(i % 5 == 0) {
            	System.out.print("Teco");
            	validador = true;
            } 
            if(!validador) {            	
            	System.out.println(i);
            } else {
            	System.out.println();
            }
        }
    }
	
	
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();

		boolean resposta = false;
		
        String stringReversa = "";
        String stringPadrao = "";
 
        for (int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) != ' ') {
        		stringPadrao = stringPadrao + s.charAt(i);
        	}
        	if(s.charAt(s.length() - i - 1) != ' ') {
        		stringReversa = stringReversa + s.charAt(s.length() - i - 1);        	
        	}
        }
        
        if (stringPadrao.equals(stringReversa)) {
        	resposta = true;
        }
        return resposta;
	}
}
