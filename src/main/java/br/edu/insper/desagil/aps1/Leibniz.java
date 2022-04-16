package br.edu.insper.desagil.aps1;

public class Leibniz {

	public double pi(int n) {
		double resultado = 0.0;
		for(int i = 1; i <= n; i ++) {
			
			//define valor da divisão na posição i
			double divisor = 2*i-1;
			
			//testa o índice para decidir se realiza soma ou subtração do valor
			if(i%2 == 0) {
				resultado -= (1/(divisor));
			}
			if(i%2 != 0) {
				resultado += (1/(divisor));
			}
		}
		return 4*resultado;
	}

}
