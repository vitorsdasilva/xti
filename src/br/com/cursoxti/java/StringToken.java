package br.com.cursoxti.java;

public class StringToken {

	public static void main(String[] args) {
		String s = "XMH; CSS; JavaScript; jQuery; Java";
		s = "Venha trabalhar na XTI";
		String[] tokens = s.split(" ");
		System.out.println(tokens.length+" tokens");
		for (String token : tokens){
			System.out.println(token);
		}
		
	}

}
