package br.com.cursoxti.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {

	
	JTextField texto;
	JCheckBox bold;
	JCheckBox italic;		
	public ControleCheck(){
		
		super();
		
		
		
		texto = new JTextField("Veja a Fonte Mudar");
		texto.setFont(new Font("serif", Font.PLAIN, 25));
		
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckListener());
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	//implementando a nossa interface ouvinte
	class CheckListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()){
				texto.setFont(new Font("Serif",Font.BOLD | Font.ITALIC, 25));
			}else if(bold.isSelected()){
				texto.setFont(new Font("Serif",Font.BOLD,25));
				
			}else if(italic.isSelected()){
				texto.setFont(new Font("Serif",Font.ITALIC,25));
			}else{
				texto.setFont(new Font("Serif",Font.PLAIN,25));
			}
			
		}	
		
		
	}
	
	
	
	public static void main(String[] args) {
		new ControleCheck();// TODO Auto-generated method stub

	}

}
