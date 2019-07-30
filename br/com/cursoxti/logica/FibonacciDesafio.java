package br.com.cursoxti.logica;
public class FibonacciDesafio{
	public static void main (String[] args){
		int anterior=0;
		int proximo =1;
		System.out.println(anterior);	
		while (proximo < 50){
			System.out.println(proximo);	
			proximo += anterior; //proximo n°Fibonacci
			anterior = proximo - anterior; //atualizando o n° anterior 
		}
	}
}