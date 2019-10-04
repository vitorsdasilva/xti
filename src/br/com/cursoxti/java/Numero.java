package br.com.cursoxti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo)); //GENÉRICOS
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo)); //INTEIROS
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));//PERCENTUAL
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));//
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));//PERCENTUAL
		
		
		f.setMaximumFractionDigits(3);
		System.out.println(f.format(saldo));
		
		f.setMinimumFractionDigits(3);
		System.out.println(f.format(saldo));
		
		/* Internacionalização */
		
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.parse("R$ 1.100,25"));
		
		

	}

}
