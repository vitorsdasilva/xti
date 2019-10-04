package br.com.cursoxti.logica;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada {

	public static void main (String[] args){
		
		//recuparação dos dados na chamada do Programa
		//System.out.println(args[0]);
		
		//Interagindo com o Uusário
		/*	System.out.print("Informe seu nome: ");
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();
		System.out.print("Bem vindo " + nome + "!");
		*/
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, "Bem vindo "+nome);
	
	}


}