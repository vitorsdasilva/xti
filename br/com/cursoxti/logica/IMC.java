package br.com.cursoxti.logica;
/**
 * Calcular o IMC
 * IMC = pesokg / (alturaM * alturaM)
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {

		// imc = pesoKg/alturaM
		double imc, pesoKg, alturaM;

		/*
		 * Scanner s = new Scanner(System.in);
		 * System.out.println("Entre com a  Peso"); pesoKg =
		 * Double.parseDouble(s.nextLine());
		 * System.out.println("Entre com a  Altura"); alturaM =
		 * Double.parseDouble(s.nextLine());
		 */

		pesoKg = Double.parseDouble(JOptionPane
				.showInputDialog("Entre com o Peso"));
		alturaM = Double.parseDouble(JOptionPane
				.showInputDialog("Entre com a  Altura"));

		/*
		 * String peso = JOptionPane.showInputDialog("Entre com o Peso");
		 * pesoKg=Double.parseDouble(peso); String altura =
		 * JOptionPane.showInputDialog("Entre com a  Altura");
		 * alturaM=Double.parseDouble(altura);
		 */

		imc = pesoKg / (alturaM * alturaM);

		System.out.println("Seu IMC eh: " + imc);

		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal"
				: "Fora do Peso Ideal"; // utilizando o operador ternario
		System.out.println(msg);

		if (imc < 18.5) {
			// System.out.println("Magreza");
			JOptionPane.showMessageDialog(null, "Magreza");

		} else if ((imc >= 18.5) && (imc < 24.9)) {
			// System.out.println("Normal");
			JOptionPane.showMessageDialog(null, "Normal");
		} else if ((imc >= 25) && (imc < 29.9)) {
			// System.out.println("Sobrepeso");
			JOptionPane.showMessageDialog(null, "Sobrepeso");
		} else if ((imc >= 30) && (imc < 39.9)) {
			// System.out.println("Obesidade");
			JOptionPane.showMessageDialog(null, "Obesidade");
		} else
			// System.out.println("Obesidade Grave");
			JOptionPane.showMessageDialog(null, "Obesidade Grave");

	}

}