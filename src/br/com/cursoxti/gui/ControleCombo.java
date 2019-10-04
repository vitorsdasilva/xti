package br.com.cursoxti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener{
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/luz.png")),
			new ImageIcon(getClass().getResource("fotos/luz.png")),
			new ImageIcon(getClass().getResource("fotos/luz.png")),
			new ImageIcon(getClass().getResource("fotos/luz.png")),
			
	};
	
	
	public ControleCombo(){
		super("Album de Fotos");
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif",Font.PLAIN,26));
		combo.addItem("Familia");
		combo.addItem("Manga");
		combo.addItem("Banana");
		combo.addItem("Choro");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		
		
		setSize(300,530);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

	public static void main(String[] args) {
		new ControleCombo();

	}

	

}
