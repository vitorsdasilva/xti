package br.com.cursoxti.heranca;

public class AnimalTest {

	public static void main(String[] args) {
		
		//Cachorro toto = new Cachorro();
		Animal toto = new Cachorro();
		toto.comida="Carne";
		toto.dormir();
		
		Animal carijo = new Galinha();
		carijo.dormir();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		
		
		//métodos herdados da classe Object
		toto.equals(carijo);
		toto.hashCode();
		toto.getClass();
		toto.toString();
		
	}

}
