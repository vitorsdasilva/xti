package br.com.cursoxti.poo;

public class Conta {

	String cliente;
	double saldo;

	void exibeSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);

	}

	void saca(double valor) {
		saldo -= valor;

		// ver se tem autorização
		// se o limite dodia não foi ultrapassado
		// se tem saldo na conta
		// deduzir do saldo o vvalor do saque
		// atualizar registros do banco
		// entregar o dinheiro ao cliente
	}

	void deposita(double valor) {
		saldo += valor;
	}

	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}
}
