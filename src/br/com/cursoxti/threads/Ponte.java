package br.com.cursoxti.threads;

/**
 * 
 * Uma <code>Ponte</code> representa o elo de 
 * liga��o entre objetos Produtores e Consumidores
 * de Informa��es. Os <i>Produtores</i> utilizam as
 * Pontes para gravar informa��es e compartilhar
 * essas informa��es com os Consumidores que l�em 
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
	 * ser� chamado pelas classes Produtores de dados.
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set (int valor) throws InterruptedException;
	
	
	/**
	 * Recupera a informa��o armazenada na Ponte. Esse
	 * m�todo ser� chamado pelas Consumidoras de dados.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;

}
