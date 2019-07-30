package br.com.cursoxti.logica;
public class AutoBoxing {

	public static void main(String[] args){
		Integer x = new Integer(555); //empacota
		int a = x.intValue(); //desempacotar
		a++; //incrementa
		
		x = new Integer(a); //reempacotar
		
		System.out.println(x.intValue());
		
		Integer z = 555;
		z++; //desempacota, incrementa, reempacota
		System.out.println(z);
		
		
	}

}