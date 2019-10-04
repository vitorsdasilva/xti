package br.com.cursoxti.refinado;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
	
	//teste de mesa: ex x=10;  (10 + (9 + (8 + (7 + (6 + (5 + (4 + 3( + (2 + (1 + 0) ) ) ) ) ) ) ) ) ) = 55
	public static int soma (int x){
		if (x==0){
			return x;
		}else{
			System.out.println(x);
			return x+soma(x-1);
		}
	}
	
	public static int potencia(int x, int e){
		if (e==1){
			System.out.println(x);
			return x;
		}else{
			int y = x*potencia(x,e-1);
			System.out.println(y);
			return y;
		}
	}
	
	public static void listar(Path path){
		if(Files.isRegularFile(path)){
			System.out.println("\t" + path.toAbsolutePath());
		}else{
			String s = "\n" + path.toAbsolutePath();
			System.err.println(s.toUpperCase());
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
				for (Path p :stream){
					System.out.println("\t");
					listar(p);
				}
			}catch(Exception e){}
		}
	}

	public static void main(String[] args) {
		//System.out.println(soma(10));
		//System.out.println(potencia(5,3));
		listar(Paths.get("c:/curso-xti/"));

	}

}
