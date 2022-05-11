package com.aed.soft.ease;

public class Ease {

	/**
	 * Essa classe com mesmo nome do framework servira para configurar os valores
	 * dos diversos tamanhos para jaelas e ou componentes, para que os tamanhos se
	 * tornassem flexiveis para qualquer tamanho de tela, calculamos tudo em
	 * porcentagem, apesar disso outras aplicações podem ser encontradas para esta
	 * classe, como calculos diversos de porcentagem
	 * 
	 * @author Oscar Rodrigues
	 */

	static int Resultado;

	/**
	 * metodo calcula a porcentagem de qualquer valor dado, retorna apenas valores
	 * inteiros
	 * @param valor
	 * 
	 * @param percentual 
	 */
	public static int CalculaPorcentagem(double valor, double percentual) {

		double doubleResult = percentual / 100 * valor;
		int resultado = (int) Math.round(doubleResult);
		Resultado = resultado;
		return Resultado;
	}

	/**
	 * Metodo retorna percentual quando se tem o valor toatal e o valor obtido onde
	 * valor e valor obtido de uma porcentagem, e VT = valor integral antes da
	 * porcentagem
	 * @param valorTotal
	 * @param valor
	 */

	public static int CalculaPercentual(double valorTotal, double valor) {

		double doubleResult = 100 / valorTotal * valor;
		Resultado = (int) Math.round(doubleResult);
		return Resultado;

	}

	/**
	 * metodo abaixo retorna o valor total integral antes das operações de
	 * porcentagem, onde se tem o valor percentual usado em uma conversao, e o valor
	 * resultante do calculo dessa porcentagem
	 * @param percentual
	 * @param valor
	 */

	public static int calculaValorTotal(double percentual, double valor) {

		double doubleResult = percentual * 100 / valor;
		Resultado = (int) Math.round(doubleResult);

		return Resultado;

	}

}

