package br.com.cursoxti.refinado;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xpath.internal.axes.RTFIterator;

public class Garbage {
	
	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<100_000;i++){
			list.add(i);
		}
		return Runtime.getRuntime().freeMemory(); //retorna uma estimativa de bytes que est�o livres na mem�ria do sistema
	}

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_576; //total de bytes em 1MB
		double total = rt.maxMemory()/MB;//retorna a quantidade m�xima de mem�ria em bytes que a m�quina virtual tentar� utilizar
		double inicio = total - (carregarMemoria()/MB);//quantidade de mem�ria utlizada
		//totalMemory() retorna o total de bytes que est�o na mem�ria do sistema
		rt.runFinalization(); //execu��o de finalizadores de objeto
		rt.gc(); //reciclagem dos objetos que n�o est�o sendo mais utilizados, de modo que sua mem�ria possa ser reutilizada
		
		
		double fim = total- (rt.freeMemory()/MB);
		
	
		System.out.println("Inicio: " +inicio + "\nFinal: " + fim);
	}

}
