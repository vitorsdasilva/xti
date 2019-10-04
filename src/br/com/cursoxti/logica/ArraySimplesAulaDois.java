package br.com.cursoxti.logica;
import java.util.Arrays;



public class ArraySimplesAulaDois {

	public static void main (String[] args){
		
		/* Arrays multidimensionais */
		
		String[] uma = {"Ricardo", "Sandra"};
		
		
		System.out.println(uma[0]);
		System.out.println(uma.length);

		//Array com duas dimensões e 3 elementos
		String[][] duas = { {"Ricardo","M","DF"}, {"Sandra","F","MG"} }; 
		
		System.out.println(Arrays.toString(duas[1]));
		
		duas[1][0]="SANDRA";
		
		System.out.println(duas[1][0]);
		System.out.println(Arrays.toString(duas[0]));//retorna a String do primeiro de elemento dentro do array interno
		System.out.println(Arrays.toString(duas[1]));//retorna a String do segundo elemento dentro do array interno
		
			
		System.out.println(duas.length); //retorna a quantidade de elementos dentro do Array principal
		System.out.println(duas[0].length);//retorna quantidade de elementos dentro do array interno
	
	}

}