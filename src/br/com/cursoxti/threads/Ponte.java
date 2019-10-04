package br.com.cursoxti.threads;

/**
 * 
 * Uma <code>Ponte</code> representa o elo de 
 * ligação entre objetos Produtores e Consumidores
 * de Informações. Os <i>Produtores</i> utilizam as
 * Pontes para gravar informações e compartilhar
 * essas informações com os Consumidores que lêem 
 * esses dados da Ponte para fazer o processamento. 
 *
 * @author Vitor Santos da Silva
 * @version 1.1
 * @since 1.0
 * 
 * @see PonteNaoSincronizada
 * @see PonteSincronizada
 * 
 */
public interface Ponte {
	/**
	 * Armazena o valor informado na ponte. Geralmente
	 * será chamado pelas classes Produtores de dados.
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set (int valor) throws InterruptedException;
	
	
	/**
	 * Recupera a informação armazenada na Ponte. Esse
	 * método será chamado pelas Consumidoras de dados.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;

}
