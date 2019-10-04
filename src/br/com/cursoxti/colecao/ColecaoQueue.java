package br.com.cursoxti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		//FIFO 
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.offer("Beatriz"); //numa fila add ou offer são métodos semelhantes
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll()); //remove o próximo elemento do início da fila
		
		System.out.println(fila);
		
		/* outros métodos disponíveis em Linkedlist*/
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio"); //colocando o elemento no início da fila
		f.addLast("Juliana");
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		System.out.println(f.poll());
		System.out.println(f.pollFirst());
		System.out.println(f.pollLast());
		System.out.println(f);
		
		
		
		
		
		
		

	}

}
