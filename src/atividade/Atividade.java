package atividade;

import java.util.Scanner;

public class Atividade {
	
	public static void main(String[] args) {
	

		
		
		ticoTeco();
		
		
		
		
		
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
