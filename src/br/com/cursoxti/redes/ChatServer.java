package br.com.cursoxti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
	
	List<PrintWriter> escritores = new ArrayList<>();
	
	public ChatServer(){
		ServerSocket server;
		Scanner leitor;
		try{
			server= new ServerSocket(5000); //para receber requisições de clientes na porta 5000
			while(true){//monitoração contínua por meio do método accept
				Socket socket = server.accept(); //aguardando nova requisições de cliente
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
			}
		}catch (IOException e){}
	}
	
	private void encaminharParaTodos(String texto){
		for (PrintWriter w: escritores){
			try{
				w.println(texto);
				w.flush();
			}catch(Exception e){} 
		}
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
					encaminharParaTodos(texto);
				}
			}catch(Exception e){}
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}

}
