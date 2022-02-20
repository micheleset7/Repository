package desafio_de_programacao;

import java.util.Scanner;

public class Exercicio_II {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean rodando=true;

while(rodando){

		System.out.println("\n--------- Digite a senha ---------");
        String senha = sc.next();
		
			System.out.println(senha(senha));
}
}
	public static boolean senha(String senha) {
	    if (senha.length() < 6) {
	    	
	    	System.out.println("A senha tem que conter no mínimo 6 dígitos");
	    }

	    boolean simbolo = false;
	    boolean maiuscula = false;
	    boolean numero = false;
	    boolean minuscula = false;
	    for (char c : senha.toCharArray()) {
	         if (c >= '0' && c <= '9') {
	             numero = true;
	         } else if (c >= 'A' && c <= 'Z') {
	             maiuscula = true;
	         } else if (c >= 'a' && c <= 'z') {
	             minuscula = true;
	             
	         }  else if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='-'||c=='+'){
	             simbolo = true;
	         } 
	    }
	    return numero && maiuscula && minuscula && simbolo;
	}
	}
