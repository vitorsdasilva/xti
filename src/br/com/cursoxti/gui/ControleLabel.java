package br.com.cursoxti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ControleLabel extends JFrame{
	
	public ControleLabel(){
		super("Label");
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28 );
		JLabel label = new JLabel("Label Simples");	
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		
		JLabel simples = new JLabel("Label Simples");		
		simples.setToolTipText("Meu Tooltip");
		
		
		ImageIcon icon = 
		new ImageIcon(getClass().getResource("fotos/luz.png"));
		JLabel imagem = new JLabel(icon);
		imagem.setSize(1,1);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		c.add(imagem);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleLabel();

	}

}
