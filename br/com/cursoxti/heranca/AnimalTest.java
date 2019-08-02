package br.com.cursoxti.heranca;

public class AnimalTest {

	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {

		// Cachorro toto = new Cachorro();
		Animal toto = new Cachorro();
		Animal carijo = new Galinha();
		//Animal generico = new Animal(0, null);

		barulho(toto);
		barulho(carijo);
		//barulho(generico);
		/*
		 * //toto.comida="Carne"; toto.fazerBarulho(); carijo.fazerBarulho();
		 * generico.fazerBarulho();
		 * 
		 * 
		 * System.out.println(toto instanceof Cachorro); System.out.println(toto
		 * instanceof Animal);
		 * 
		 * 
		 * //métodos herdados da classe Object toto.equals(carijo);
		 * toto.hashCode(); toto.getClass(); toto.toString();
		 * 
		 * 
		 * public static void barulhoSemPolimorfismo (String Animal){
		 * 		if (animal.equals("Cachorro")){
		 * 			System.out.println("Au, Au!");
		 * 		} else if (animal.equals("Galinha")) {
		 * 			System.out.println("Có, Có!");
		 * }
		 */
		
		
	}

}
