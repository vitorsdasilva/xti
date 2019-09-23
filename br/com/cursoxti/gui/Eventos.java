package br.com.cursoxti.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	
	JButton botao = new JButton("Clique Aqui");
	
	public Eventos(){
		super ("Eventos");
		
		
		
		botao.addActionListener(this);
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("FOI CLICADO");
		
	}

	public static void main(String[] args) {
		new Eventos();

	}

	

}
