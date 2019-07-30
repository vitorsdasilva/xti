package br.com.cursoxti.logica;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class JogaDado{
	public static void main (String[] args){
	
		//ArrayList<String> facesDado = new ArrayList<String>();
		ArrayList<Integer> facesDado = new ArrayList<Integer>();
		
		
		facesDado.add(1);
		facesDado.add(2);
		facesDado.add(3);
		facesDado.add(4);
		facesDado.add(5);
		facesDado.add(6);
		System.out.println(facesDado.toString());
		System.out.println(facesDado.get(2));
	
		Boolean opcao = true;
		while (opcao){
		
			int palpite = 0;
			while((palpite != 1) && (palpite != 2) && (palpite != 3) &&  (palpite != 4) &&  (palpite != 5) &&  (palpite != 6))  {
				
				palpite = Integer.parseInt ( JOptionPane.showInputDialog("Escolha a face do dado " + "(" + "1-6" + ")" ) );
				
			}
		
			Random r = new Random();
		
			int sorteio = facesDado.get(r.nextInt(facesDado.size()));
		
			JOptionPane.showMessageDialog(null,"Numero sorteado foi " + sorteio);
		
		
			if (palpite == sorteio)
			{
				JOptionPane.showMessageDialog(null,"Acertou");
				System.out.println("Acertou");
			}else{
				JOptionPane.showMessageDialog(null,"Errou");
				System.out.println("Errou");
			}

			String str = new String ();
			str = JOptionPane.showInputDialog("Deseja continuar ? S/N ");
			
			if (str.isEmpty()) 	//verificando se a string está vazia	
				opcao = true; //retorne ao menu principal
			else if (!str.isEmpty()) 
				opcao = str.substring(0, 1).equalsIgnoreCase("s"); //separando a primeira posicao do Array e verificando se contém 's'
			else
				opcao = false;
			
					
		}
		
	
	
	}


}