package br.edu.insper.desagil.aps1;

public class Numero {

	public boolean perfeito(int n) {
		int somaDivisores = 0;
		
		// Verifica se o número é divisível por i, se for, soma i a soma de divisores
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				somaDivisores += i;
			}
		}
		
		// Se a soma de divisores for igual ao número, o número é perfeito
		if (somaDivisores == n) {
			return true;
		} else {
			return false;
		}
	}

}
