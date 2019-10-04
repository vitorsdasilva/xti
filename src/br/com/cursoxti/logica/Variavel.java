package br.com.cursoxti.logica;
/**
 * Apresentar os conceitos 
 * @author Vitor Santos
 */
 
 public class Variavel{
		
		public static void main (String [] args){
			//String nome = "Vitor";
			//int idade = 32;
			//char sexo = 'M';//Unicode
			//boolean casado = true;
			
			//byte b = 127; //cem
			//short s = 32767; //32 mil
			//int i = 2_000_000_000; //2 bilhões
			//long l = 9_000_000_000_000_000_000L; //9 quintilhões
			//double d = 1.7976931348623157E+308D; //IEEE 754
			//float f = 123F; 
			
			//byte bb = 0b01010101; //8 bits de espaço/ 1 byte de informação
			//short ss = 0b0101010101010101; //16 bits de espaço/ 2 bytes de informação
			//int ii = 0b01010101010101010101010101010101; //32 bits de espaço/ 4 bytes de informação 
			
		//	i = s; //Cast Implícito
			//System.out.println(s);
			//System.out.println(i);
			
		//	i = (int) l; //Cast Explícito
			//System.out.println(l);
			//System.out.println(i);
			
			
			//Variável Primitiva
			int x = 7;
			//System.out.println(x);
			x = 9;
			//System.out.println(x);
			//Variável de Referência
			String y = "XTI";
			//System.out.println(y);
			y = "xti.com.br";
			//System.out.println(y);
			y = null;
			//System.out.println(y);
			
			//AULA 9
			
			int populacaoBrasileira = 203429773;
			final double PI = 3.14159265358979323846;
			//System.out.println(PI);
			final char SEXO_MASCULINO = 'M';
			final char SEXO_FEMININO = 'F';
			
			
			//AULA 10 - Classes Wrapper
			
			//int idade = 31;
			Integer idade = new Integer("31");
			//double preco = 12.45;
			Double preco = new Double("12.45");
			double d = preco.doubleValue();
			int i = preco.intValue();
			char sexo = 'M';
			//boolean casado = true;
			Boolean casado = new Boolean("true");
			
			/*CONVERSAO ESTATICA*/
			double d1 = Double.parseDouble("123.45");
			int i1 = Integer.parseInt("123");
			float f1 = Float.parseFloat("3.14F");
			
			int i2 = Integer.valueOf("101011", 2);
			System.out.println(i2);
		}
 }

 