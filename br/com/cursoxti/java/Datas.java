package br.com.cursoxti.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {

	public static void main(String[] args) {
		
		/*tempo zero = 01 de Jan de 1970*/
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date(); 
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000L); 
		System.out.println(data);
		
		/*Métodos*/
		
		data.getTime();
		data.setTime(1_000_000_000L);
		//data.compareTo(agora); //-1,0,1
		System.out.println(data.compareTo(agora));
		
		Calendar c = Calendar.getInstance();
		//new GregorianCalendar();
		
		c.set(1980,Calendar.FEBRUARY,12);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));//ANO
		System.out.println(c.get(Calendar.MONTH));//MÊS
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//ANO
		
		c.set(Calendar.YEAR, 1972);//Alterar o ANO
		c.set(Calendar.MONTH, Calendar.MARCH);//Alterar o MÊS
		c.set(Calendar.DAY_OF_MONTH, 25);//Alterar o DIA
		System.out.println(c.getTime());

		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.YEAR, 1);
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH, 20);
		System.out.println(c.getTime());

		/*Saudação*/
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if(hora <= 12 ){
			System.out.println("Bom dia");
		} else if (hora > 12 && hora  < 18){
			System.out.println("Boa tarde");
		}else{
			System.out.println("Boa noite");
		}
		
		
	}

}
