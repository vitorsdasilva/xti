package br.com.cursoxti.threads;

public class PingPong extends Thread{

	String palavra;
	long tempo;
	
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;		
		this.tempo = tempo;
	}
	
	public void run() {
		
			try {
				for(int i=0; i<5; i++){
					System.out.print(palavra + " ");
					Thread.sleep(tempo);
				}
			} catch (InterruptedException e) {
				
			}
			
		
		
	}
	
	public static void main(String[] args) {
		
		new PingPong("ping", 1500).start();;
		new PingPong("pong", 2000).start();;
		System.out.println("Ver Thread");

	}

}
