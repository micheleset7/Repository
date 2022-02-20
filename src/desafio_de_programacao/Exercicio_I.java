package desafio_de_programacao;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_I {

    public static void main(String args[]) {
             
    	  boolean rodando=true;
    		while(rodando){
    		        
    		        Scanner sc = new Scanner(System.in);
    		        ArrayList<String> degraus = new ArrayList<>();

    		        System.out.print("\nDigite a quantidade de escadas: ");
    		        int qtd = sc.nextInt();

    		        for (int i = 0; i < qtd; i++) {
    		        
    		        degraus.add("".repeat+(qtd - i) + "*".repeat+(i + 1));
    		        }

    		    		for (String d : degraus ) {
    	    		        System.out.println(d);
    	    		        }
    }
}
}