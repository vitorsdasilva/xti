package br.com.cursoxti.logica;
import java.util.ArrayList;

public class ArrayListSimples{
	
	public static void main (String[] args){
		ArrayList<String> cores = new ArrayList<String>();
			cores.add("Branco");
			//cores.add("Vermelho");
			cores.add(0,"Vermelho");
			cores.add("Amarelo");
			cores.add("Azul");
			System.out.println(cores.toString());
			System.out.println("Tamanho = " + cores.size());
			System.out.println(cores.get(2));
			System.out.println(cores.indexOf("Branco"));
			
			cores.remove("Branco");
			System.out.println(cores.toString());
			
			System.out.println("Tem Amarelo? "+cores.contains("Amarelo"));
		
		
	}
	
}