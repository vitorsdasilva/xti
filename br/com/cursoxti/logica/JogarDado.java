package br.com.cursoxti.logica;
import java.util.Random;
import javax.swing.JOptionPane;


public class JogarDado{
	public static void main (String[] args){
	
		int[] facesDado = {1,2,3,4,5,6};
		Random r = new Random();
				
		int palpite = Integer.parseInt ( JOptionPane.showInputDialog("Escolha a face do dado " + "(" + "1-6" + ")" ) );
		
		int sorteio = facesDado[r.nextInt(facesDado.length)];
		
		JOptionPane.showMessageDialog(null,"Numero faces foi " + facesDado.length);
		
		JOptionPane.showMessageDialog(null,"Numero sorteado foi " + sorteio);
		if (palpite == sorteio)
		{
			JOptionPane.showMessageDialog(null,"Acertou");
			System.out.println("Acertou");
		}else{
			JOptionPane.showMessageDialog(null,"Errou");
			System.out.println("Errou");
		}		
	
	
	}


}