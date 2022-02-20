package desafio_de_programacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_III {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean rodando=true;
		while(rodando){
	    
        String p1=JOptionPane.showInputDialog("-------- Digite a primeira palavra ---------");    
        String p2=JOptionPane.showInputDialog(" Digite a segunda palavra ");
		
		if (isAnagrama(p1,p2))
		JOptionPane.showMessageDialog (null, "A palavra é um anagrama");
		else
		JOptionPane.showMessageDialog (null, "A palavra não é um anagrama");
	}}
	private static boolean isAnagrama(String p1, String p2){
		
		int r=0;
		for(int i=0; i<p1.length(); i++)
			r=r^p1.charAt(i);
		
		for(int i=0; i<p2.length(); i++)
			r=r^p2.charAt(i);
		
		return (r==0);
	}
}
