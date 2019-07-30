package br.com.cursoxti.logica;
import java.util.ArrayList;
public class Fibonacci{
	public static void main(String[] args){
		ArrayList<Integer> serie = new ArrayList<Integer>();
		int ant=0,prox=1;
		serie.add(ant,prox);
		while (prox<=50){	
			prox += ant;
			serie.add(prox);
			ant = prox - ant;
		}; 
		if (prox>50) serie.remove(serie.lastIndexOf(prox));
		System.out.println(serie.toString());
	}
}