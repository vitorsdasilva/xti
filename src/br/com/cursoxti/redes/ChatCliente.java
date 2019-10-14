package br.com.cursoxti.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame{

	JTextField textoParaEnviar;
	PrintWriter escritor;
	Socket socket;
	String nome;
	JTextArea textoRecebido;
	Scanner leitor;
	
	private class EscutaServidor implements Runnable{

		@Override
		public void run() {
			try{
				String texto;
				while((texto = leitor.nextLine()) != null)
					textoRecebido.append(texto + "\n");
			}catch(Exception e){};
			
			
		}
		
		
	}
	public ChatCliente(String nome){
		super("Chat: " + nome);
		this.nome = nome;
		
		
		
		Font fonte = new Font("Serif", Font.PLAIN, 26);
		textoParaEnviar = new JTextField();
		textoParaEnviar.setFont(fonte);
		JButton botao = new JButton("Enviar");
		botao.setFont(fonte);
		
		configurarRede();
		
		botao.addActionListener(new EnviarListener());
		
		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER, textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);
		
		
		textoRecebido = new JTextArea();
		textoRecebido.setFont(fonte);
		JScrollPane scroll = new JScrollPane(textoRecebido);
		
		getContentPane().add(BorderLayout.CENTER,scroll);
		getContentPane().add(BorderLayout.SOUTH, envio);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
		
		
	}
	
	private class EnviarListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			escritor.println(nome + " : " + textoParaEnviar.getText()); //enviando a mensagem para o servidor
			escritor.flush(); //garante que a informa��o foi encaminhada com sucesso...
			textoParaEnviar.setText("");
			textoParaEnviar.requestFocus();
		}
	}
	
	public void configurarRede(){
		try{
			socket = new Socket("127.0.0.1",5000);
			escritor = new PrintWriter(socket.getOutputStream());//escrevendo informa��es do cliente que ser�o enviadas ao servidor
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
		}catch (Exception e){}
		
	}
	
	
	public static void main(String[] args) {
		new ChatCliente("Vitor");
		new ChatCliente("Luciana");

		

	}


	

}
