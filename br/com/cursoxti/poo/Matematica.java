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
	
	double soma(double um, double dois){
		double s = (um + dois);
		return s;
		
	}
	
	int raiz(int numero){
		for (int i=1 ; i<=numero ; i++ ){
			if (i*i == numero){
				return i;
			}
		}
		return -1; 
			
	}
}
