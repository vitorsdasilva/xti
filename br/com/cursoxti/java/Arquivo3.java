package br.com.cursoxti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.cursoxti.poo.Conta;

public class Arquivo3 {
	
	private Path path = Paths.get("c:/curso-xti/files/contas.txt");
	//Files.createDirectories(path.getParent());
	private Charset utf8 = StandardCharsets.UTF_8;	

	public static void main(String[] args) throws IOException {
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta ("Ricardo", 12000.23));
		contas.add(new Conta ("Laurence", 11050.23));
		contas.add(new Conta ("Sandra ", 18000.21));
		contas.add(new Conta ("Beatriz", 23200.09));
		
		
		Arquivo3 operacao = new Arquivo3();
		//operacao.ArmazenaContas(contas);
		//ArrayList<Conta> contas2 = operacao.recuperarConta();
			for (Conta conta : operacao.recuperarConta()){
				conta.exibeSaldo();
			}
		
	}
	
	/**
	 * Método comentado, pois não será mais necessário armazenar a conta
	 	 
	//método para armazenar lista de contas em arquivos
	
	public void ArmazenaContas (ArrayList<Conta> contas) throws IOException{
		
		Path path = Paths.get("c:/curso-xti/files/contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;	
		
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){ //A partir do hava 7 a váriável pode ser inicializada a partir do bloco try
			
			for (Conta conta : contas){
				w.write(conta.getCliente()+ ";" + conta.getSaldo() + "\n");
				System.out.println("Cliente: "+ conta.getCliente()+"\t \t Saldo: R$ "+conta.getSaldo());
			}
						
		}catch(IOException e){
				e.printStackTrace();
		}		
		
	}
	*/
	
	public ArrayList<Conta> recuperarConta() throws IOException{
		ArrayList<Conta>  contas = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path,utf8)){
			String line = null;
			while ( (line = reader.readLine()) != null){
				String[] token = line.split(";");
				
				Conta conta = new Conta(token[0],Double.parseDouble(token[1]));
				contas.add(conta);
			}
		}
				
			return contas;
	}
	
	/* método criado por Vitor, mais complexo e difícil para quebrar a string
	public static ArrayList<Conta> LeituraContas(){
			
		Conta c;								
		Path path = Paths.get("c:/curso-xti/files/contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;	
		
		ArrayList<Conta> contas = new ArrayList<>();
		
		
		
		
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)){
			String line = null;
			
			
			
	
			while((line = reader.readLine()) != null){
				System.out.println(line);
				String re = "(Cliente:)(\\w{2,}).*(\\d{.,}.\\d{2})";
				boolean b=true;
				b= line.matches(re);
				System.out.println(b);
				
					
				
				String nome = line.replaceAll(re, "/$2");
				//double saldo = Double.parseDouble(line.replaceAll(re, "/$3"));
				String saldo = line.replaceAll(re, "/$3");
				
				saldo=saldo.replace("\\", "");
		//		double saldo2=Double.parseDouble(saldo);
				
				
				System.out.println("nome:"+nome);
				System.out.println("saldo:"+saldo);
				
				//contas.add(new Conta (nome, saldo2));
				
				
			}	
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	*/
	

}
