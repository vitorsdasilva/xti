package br.com.cursoxti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.cursoxti.poo.Conta;

public class Serializa2 {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta ("Ricardo", 12000.23));
		contas.add(new Conta ("Laurence", 11050.23));
		contas.add(new Conta ("Sandra ", 18000.21));
		contas.add(new Conta ("Beatriz", 23200.09));
		
		
		Serializa2 operacao = new Serializa2();
		operacao.ArmazenaContas(contas);
		
			for (Conta conta : operacao.recuperarConta()){
				conta.exibeSaldo();
			}
		
	}
	
	
	//método para armazenar lista de contas em arquivos
	
	public void ArmazenaContas (ArrayList<Conta> contas) throws IOException{
		try(FileOutputStream fos = new FileOutputStream("C:/curso-xti/files/contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(contas);
			}
		}
	}
	
	
	public ArrayList<Conta> recuperarConta() throws Exception{
		try(FileInputStream fis = new FileInputStream("C:/curso-xti/files/contas.ser")){
			try(ObjectInputStream  ois = new ObjectInputStream(fis)){
				return (ArrayList<Conta>) ois.readObject();
			}
		}		
	}
	
	
	

}
