package br.com.cursoxti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException{
		Path path = Paths.get("C:/curso-xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		//BufferedWriter w = null;
		
		//try{
		//	w = Files.newBufferedWriter(path, utf8);
			
		
		/**
		 * ESCRITA
		 */
		
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){ //A partir do hava 7 a váriável pode ser inicializada a partir do bloco try
			w.write("Outro Texto\n");
			w.write("Outro Texto\n");
			//w.flush(); nesse caso o método close chama automaticamente o método flush
		}catch(IOException e){
				e.printStackTrace();
		}/*finally{ todos objetos que implementam a interface Closable são automáticamente fechados (compilado cria o bloco finally) quando são inicializaados dentro de um try 
				if (w != null){
					w.close();
				}
		}*/
		
		/**
		 * LEITURA
		 */
		
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)){
			String line = null;
			while((line = reader.readLine()) != null){
				System.out.println(line);
			}	
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
