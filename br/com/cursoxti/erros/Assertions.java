package br.com.cursoxti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Entre com um Numero de 0 a 10 ");
		int numero = s.nextInt();
		
		assert (numero >= 0 && numero <=10) : "N�mero inv�lido!";
		System.out.println("Voc� entrou " + numero);

	}

}
