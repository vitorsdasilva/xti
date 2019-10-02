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
		return Runtime.getRuntime().freeMemory(); //retorna uma estimativa de bytes que estão livres na memória do sistema
	}

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_576; //total de bytes em 1MB
		double total = rt.maxMemory()/MB;//retorna a quantidade máxima de memória em bytes que a máquina virtual tentará utilizar
		double inicio = total - (carregarMemoria()/MB);//quantidade de memória utlizada
		//totalMemory() retorna o total de bytes que estão na memória do sistema
		rt.runFinalization(); //execução de finalizadores de objeto
		rt.gc(); //reciclagem dos objetos que não estão sendo mais utilizados, de modo que sua memória possa ser reutilizada
		
		
		double fim = total- (rt.freeMemory()/MB);
		
	
		System.out.println("Inicio: " +inicio + "\nFinal: " + fim);
	}

}
