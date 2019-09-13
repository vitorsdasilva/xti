package br.com.cursoxti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt","BR");
		Locale india = new Locale("hi","IN");
		Locale usa = Locale.US;
		Locale japao = Locale.JAPAN;
		Locale italia = Locale.ITALY;
		
		DateFormat f = DateFormat.getInstance();
		
		f = DateFormat.getDateInstance(DateFormat.FULL,padrao);
		System.out.println(f.format(date));//padrao
		
		f = DateFormat.getDateInstance(DateFormat.FULL,brasil);
		System.out.println(f.format(date));//Brasil
		
		f = DateFormat.getDateInstance(DateFormat.FULL,india);
		System.out.println(f.format(date));//India
		
		f = DateFormat.getDateInstance(DateFormat.FULL,usa);
		System.out.println(f.format(date));//USA
		
		f = DateFormat.getDateInstance(DateFormat.FULL,japao);
		System.out.println(f.format(date));//JAPAO
		
		f = DateFormat.getDateInstance(DateFormat.FULL,italia);
		System.out.println(f.format(date));//ITALIA
		
	}

}
