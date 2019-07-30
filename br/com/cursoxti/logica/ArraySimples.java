package br.com.cursoxti.logica;
import java.util.Arrays;



public class ArraySimples {

	public static void main (String[] args){
		
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		String[] paises = {"Brasil","Russia","India","China"};
		//paises[0]="Argentina";
		System.out.println(paises[0]);
		System.out.println(paises.length);
		System.out.println(Arrays.toString(paises)); //este método apresenta todos os valores do Arraytransformados em String
		
		int posicao = Arrays.binarySearch(paises, "Argentina"); //este método pesquisa elemento dentro do Array, retornando uma posicao 
		
		System.out.println(posicao);
		
		Arrays.sort(paises,0,paises.length); //este método ordena os elementos do Array 
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue());
	
	}

}