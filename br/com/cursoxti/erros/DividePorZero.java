package br.com.cursoxti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	public static void dividir (Scanner s) throws InputMismatchException,ArithmeticException {
		
			System.out.println("Numero: ");
			int a = s.nextInt();

			System.out.println("Divisor: ");
			int b = s.nextInt();

			System.out.println("a / b = " + a / b);
		

		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;

		do {
			try {

				dividir (s);
				continua = false;

			}
			
			
			//utilizando o multicatch, estrutura valida a partir do java 7
			catch (InputMismatchException | ArithmeticException e1) {
				System.err.println("Números invalido");
				e1.printStackTrace(); //utilizando conceito do StackTrace
			//	e1.getStackTrace(); // rectorna o Array de StrackTrace com os erros
			//	e1.getMessage(); //retorna mansagem string com os erros
				s.nextLine(); //descarta a entrada que deu erro e libera
			} 
				
		} while (continua);
	}
}
