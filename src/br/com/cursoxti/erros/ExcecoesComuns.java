package br.com.cursoxti.erros;

import br.com.cursoxti.heranca.Animal;
import br.com.cursoxti.heranca.Cachorro;
import br.com.cursoxti.heranca.Galinha;

public class ExcecoesComuns {

	static int[] arrayNull = new int[0];
	
	public static void main(String[] args) {
		//NullPointerException , tentando acessar um objeto nulo
		//System.out.println(arrayNull.length);	
			
		
		//ArithmeticException, divis�o por Zero
		//int x = 5/0;
		
		
		//ArrayIndexOutOfBoundsException, posi��o inexistente do array
		//System.out.println(arrayNull[1]);
		
		//ClassCastException, erro de convers�o de tipos de uma forma expl�cita
		//Animal a = new Galinha();
		//Cachorro c = (Cachorro) a;
		
		
		//NumberFormatException, tentativa de converter um n�mero imposs�vel de ser convertido
		int inteiro = Integer.parseInt("x");
		
	}

}
