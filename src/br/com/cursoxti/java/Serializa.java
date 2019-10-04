package br.com.cursoxti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import br.com.cursoxti.poo.Conta;


public class Serializa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] nomes = {"Ricardo","Beatriz","Sandra"};
		Conta conta1 = new Conta("XTI",111_222_333.444);
		
		/* ESCRITA DE OBJETO*/
		FileOutputStream fos = new FileOutputStream("C:/curso-xti/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//oos.writeObject(nomes);
		oos.writeObject(conta1);
		oos.close();

		
		/* LEITURA DE OBJETO*/
		
		FileInputStream fis = new FileInputStream("C:/curso-xti/files/objeto.ser");
		ObjectInputStream  ois = new ObjectInputStream(fis);
		//String[] nomes1 =  (String[]) ois.readObject();
		Conta conta = (Conta)ois.readObject();
		ois.close();
		
		//System.out.println(Arrays.toString(nomes1));
		conta.exibeSaldo();
	}

}
