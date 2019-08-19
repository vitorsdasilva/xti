package br.com.cursoxti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException  {
		
		//Java 7 
		Path path = Paths.get("c:/curso-xti/files/texto.txt");
		
		
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		
		
		/* CRIAÇÃO DE DIRETÓRIOS*/
		Files.createDirectories(path.getParent());
		
		/* ESCREVER E LER ARQUIVOS*/
		byte[] bytes = "Meu amigo camarada".getBytes();
		Files.write(path, bytes); //cria, limpa e escreve
		
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));

	}

}
