package br.com.cursoxti.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//public class ControleText extends JFrame implements ActionListener {
public class ControleText extends JFrame {
	
	
	JTextField login;
	JPasswordField senha;
	JButton ok, cancel;
	
	public ControleText(){
		
		super("Textos e Senhas");
		
		ok = new JButton("OK");
		//ok.addActionListener(this);
		ok.addActionListener(new BotaoOKListener());
		cancel = new JButton("Cancel");
		
		//cancel.addActionListener(this);
		cancel.addActionListener(new BotaoCancelListener());
		
		login = new JTextField();
		
		senha = new JPasswordField();
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("Login:"));
		c.add(login);
		//c.add(new JTextField());
		c.add(new JLabel("Senha:"));
		c.add(senha);
		//c.add(new JPasswordField());
		//c.add(new JButton("OK"));
		//c.add(new JButton("Cancel"));
		c.add(ok);
		c.add(cancel);
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
	
	class BotaoOKListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String s = "login:" + login.getText()
					 + "\nsenha:" + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
			
		}
		
		
		
	}
	
	class BotaoCancelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			login.setText("");
			senha.setText("");
			
		}
		
		
		
	}
	
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok){
			
			String s = "login:" + login.getText()
					 + "\nsenha:" + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
		}else if(e.getSource() == cancel){

			login.setText("");
			senha.setText("");
		}
		
		
	}
	*/

	public static void main(String[] args) {
		new ControleText();

	}

	

}
