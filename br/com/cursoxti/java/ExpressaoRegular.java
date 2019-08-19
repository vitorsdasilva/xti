package br.com.cursoxti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpressaoRegular {

	public static void main(String[] args) {
		// String padrao = "Java";
		// String texto = "Java";

		// boolean b = texto.matches(padrao);
		// System.out.println(b);

		/*
		 * MODIFICADORES (?i), Ignora mai�scula e min�scula (?x), Coment�rios
		 * (?m),Multilinhas (?s),Dottal*
		 */

		// boolean b = "Java".matches("(?im)java");
		// System.out.println(b);

		/*
		 * METACARACTERES (indicam a oco�ncia de n�meros, letras etc. . qualquer
		 * caractere \d d�gitos [0-9] \D n�o � d�gito [^0-9] \s espa�os [
		 * \t\n\x0B\f\r] \S n�o � espa�o [^\s] \w letra ou digito [a-zA-Z_0-9]
		 * \W n�o � letra
		 */

		boolean b = "@".matches(".");
		b = "2".matches("\\d");
		b = "A".matches("\\w");
		b = " ".matches("\\s");

		b = "Pi".matches("..");

		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "40435-060".matches(cep);
		// System.out.println(b);

		/*
		 * QUANTIFICADORES X{n} X, exatamente n vezes X{n,} X, pelo menos n
		 * vezes X{n,m} X, pelo menos n mas n�o mais do que m vezes X? X, 0 ou 1
		 * vez X* X, 0 ou + vezes X+ X, 1 ou mais vezes
		 */

		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "123,4,5".matches("\\d{2,5}");

		b = " ".matches(".?"); // 0 ou 1
		b = "ab".matches(".*"); // 0 ou +
		b = "123".matches(".+"); // 1 ou +

		b = "40435-060".matches("\\d{5}-\\d{3}");
		b = "15/09/1986".matches("\\d{2}/\\d{2}/\\d{4}");
		// System.out.println(b);

		/**
		 * METACARACTER DE FRONTEIRA ^ Inicia $ Finaliza | ou
		 * 
		 */

		b = "Pier21".matches("^Pier.*"); // inicia com um padr�o
		b = "Pier21".matches(".*21$"); // finaliza com um padr�o
		b = "Tem java aqui".matches(".*java.*"); // buscar um padr�o no meio da
													// string
		b = "Tem java aqui".matches("(?i)^tem.*Aqui$"); // come�ar e terminar
														// com um padr�o
		b = "n�o".matches("(?i)sim|n�o|s|n"); // Possibilidade de valores
												// alternativos

		// System.out.println(b);

		/**
		 * AGRUPADORES
		 * 
		 * [...] Agrupamento [a-z] Alcance [a-e][i-u] Uni�o [a-z && [aeiou]]
		 * Interse��o [^abc] Exce��o [a-z&&[^m-p]] Subtra��o \x Fuga Literal
		 * 
		 */

		b = "x".matches("[a-z]");

		b = "True".matches("[tT]rue");
		b = "True".matches("[tT]rue|[yY]es");
		b = "yes".matches("[tT]rue|[yY]es");
		b = "Yes".matches("[tT]rue|[yY]es");
		b = "Isaac".matches("[A-Z][a-z]*"); // Primeiro Nome
		b = "Isaac".matches("[A-Z][a-zA-Z]*");
		b = "olho".matches("[^abc]lho"); // termine com lho e n�o come�a nem com
											// a, nem b, nem c
		b = "crau".matches("cr[ae]u"); // valida��o dentro da string (crau ou
										// creu)

		b = "isaac@filho.com.br"
				.matches("\\w+@\\w+\\.\\w{2,3}|\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}"); // valida��o
																					// simples
																					// de
																						// e-mail

		// System.out.println(b);

		String doce = "Qual � o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()){
			//System.out.println(matcher.group());
		}
		
		
		
		/*SUBSTITUI��ES */
		
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		String rato = "o rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]","XX");
		
		r = "Tabular este texto".replaceAll("\\s", "\t");
		
		//System.out.println(r);
		
		
		
		String url = "www.xti.com.br/clientes-2011.html";
					//http://www.xti.com.br/2011/clientes.jsp//Objetivo 
		
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		//System.out.println(b);
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		System.out.println(r);	
		System.out.println(url);		

	}

}
