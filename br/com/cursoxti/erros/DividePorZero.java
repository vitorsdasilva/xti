package br.com.cursoxti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continua = true;

		do {
			try {

				System.out.println("Numero: ");
				int a = s.nextInt();

				System.out.println("Divisor: ");
				int b = s.nextInt();

				System.out.println("a / b = " + a / b);
				continua = false;

			}

			catch (InputMismatchException e1) {
				System.out.println("Números devem ser inteiros");
				s.nextLine(); //descarta a entrada que deu erro e libera
			} catch (ArithmeticException e2) {
				System.out.println("Capturei o erro ArithmeticException");
			}
		} while (continua);
	}
}
