package br.com.cursoxti.java;

public class StringMutavel {

	public static void main(String[] args) {
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		s1.toString();
		s1.length();
		//System.out.println(s1.length());
		s1.capacity();
		//System.out.println(s1.capacity());
		//System.out.println(s1);
		//s1.reverse();
		//System.out.println(s1);
		
		s1.append(" Trabalhando ");
		System.out.println(s1);
		char [] c = {'c', 'o', 'm'};
		s1.append(c).append(" Textos.");
		System.out.println(s1);
		
		String s = "Oi" + "como" + "vai você?";
		String sb = new StringBuilder("Oi").append(" como ").append("vai você?").toString();
		System.out.println(sb);
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);

	}

}
