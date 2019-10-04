package br.com.cursoxti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		int ma = m.maior(10, 20);
		System.out.println(ma);

		double so = m.soma(10, 20);
		System.out.println(so);

		// double par = m.maior(2, 4);
		// double impar = m.maior(3, 5);
		// double so2 = (par + impar);

		double so2 = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(so2);

		int r = m.raiz(1564132240);
		if (r != -1) {
			System.out.println("a raiz é: " + r);
		} else {
			System.out.println("O número analisado não tem raiz quadrada");
		}
		
		double soma = m.soma(2,3,4,5,6,7,8,9);
		System.out.println("a soma é "+soma);
		
		double[] numerosArray = {1,2,3,4,5,6,7,8,9};
		double somaArray = m.somaArray(numerosArray);
		System.out.println("a soma Array é "+somaArray);
		
		System.out.print(" = " + m.media("5", "3")+"\n");
		System.out.print(" = " + m.media(5, 3)+"\n");
		System.out.print(" = " + m.media(5,4,2,3,1)+"\n");
		System.out.print(" = " + m.media(5)+"\n");
		
	}

}
