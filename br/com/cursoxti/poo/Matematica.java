package br.com.cursoxti.poo;

public class Matematica {
	/**
	 * 
	 * 
	 * @return o maior dos dois números
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	/*
	double soma(double um, double dois){
		double s = (um + dois);
		return s;
		
	}
	*/
	
	//metodo com numeros indefinidos de argumentos
	double soma(double ... numeros){ 
		double total =0;
		for (double i : numeros){
			total += i; 
		}
		return total;
	}
	
	
	double somaArray(double[] numeros){ 
		double total =0;
		for (double i : numeros){
			total += i; 
		}
		return total;
	}
	
	
	int raiz(int numero){
		for (int i=1 ; i<=numero ; i++ ){
			if (i*i == numero){
				return i;
			}
		}
		return -1; 
			
	}
	
	public double media(int x , int y){
		System.out.print("media(int x , int y)");
		return ((x+y) / 2);
	}
	
	public double media(String x , String y){
		System.out.print("media(String x , String y)");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return ((ix+iy) / 2);
	}
	
	public double media(double ... numeros){
		System.out.print("media(double ... numeros)");
		
		return this.soma(numeros)/numeros.length;
	}
	
	
	
	
}
