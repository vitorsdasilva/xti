package br.com.cursoxti.erros;

public class DebugExemplo {

	int resultado;
	
//Método criado pelo professor do curso XTI
	public int raiz (int numero){
		int raiz = 0, impar = 1;
		while (numero >= impar){
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;
	}
	
	/*
	 *	
	//Método criado por Vitor Santos
	int raiz(int numero){
		for (int i=1 ; i<=numero ; i++ ){
			if (i*i == numero){
				return i;
			}
		}
		return -1; 
			
	}
	*/
	public static void main(String[] args) {
		int numero = 25;
		DebugExemplo exemplo = new DebugExemplo();
		int raiz = exemplo.raiz(numero);
		
		if ( raiz == 5) {
			System.out.println("Raiz correta");
		}

	}

}
