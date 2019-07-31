package br.com.cursoxti.poo;

public class Galinha {
	
	public static int ovosDaGranja; //variável global
	int ovos; //total de ovos do objeto galinha
	
	
	
	public Galinha botar(){
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
		
	}
	
	public static double mediaDeOvos(int galinhas){
		return ovosDaGranja / galinhas;
	}

}
