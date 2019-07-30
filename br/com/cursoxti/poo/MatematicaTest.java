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
	}

}
