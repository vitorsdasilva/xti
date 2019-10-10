package br.com.cursoxti.redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//Portas entre 0-1023 são reservadas aos serviços de rede. Total de 65.535 portas tcps disponíveis
		Socket socket = new Socket("127.0.0.1",5000); 
		Scanner s = new Scanner (socket.getInputStream());
		System.out.println("Mensagem:" + s.nextLine());
		s.close();
	}

}
