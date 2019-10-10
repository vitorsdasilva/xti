package br.com.cursoxti.redes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public ChatServer(){
		ServerSocket server;
		Scanner leitor;
		try{
			server= new ServerSocket(5000); //para receber requisições de clientes na porta 5000
			while(true){//monitoração contínua por meio do método accept
				Socket socket = server.accept(); //aguardando nova requisições de cliente
				//System.out.println(socket.getInputStream());
				
				new Thread(new EscutaCliente(socket)).start();
				//leitor = new Scanner(socket.getInputStream());
				//System.out.println(leitor.nextLine());
			}
		}catch (IOException e){}
	}

	private class EscutaCliente implements Runnable{//classe que monitora as mensagens que chegam do socket
		Scanner leitor;
		public EscutaCliente(Socket socket){
			try{
				leitor = new Scanner(socket.getInputStream());
			}catch (IOException e){}
		}

		@Override
		public void run(){
			try{
				String texto;
				while((texto = leitor.nextLine()) != null){
					System.out.println(texto);
				}
			}catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}

}
