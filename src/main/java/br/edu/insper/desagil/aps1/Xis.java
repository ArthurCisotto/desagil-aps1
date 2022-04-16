package br.edu.insper.desagil.aps1;

public class Xis {

	public String constroi(int n) {
		n -= 1;
		int numeroCaracteres = (2*n)+1;
		String xis = "";
		
		//Primeira metade do Xis
		for(int i = 0; i < n; i++) {
			int numeroEspacosAntes = i;
			while(numeroEspacosAntes>0) {
				xis += " ";
				numeroEspacosAntes -= 1;
			}
			numeroEspacosAntes = i;
			xis += "X";
			int numeroEspacosMeio = numeroCaracteres - (2 * numeroEspacosAntes) - 2;
			while(numeroEspacosMeio>0) {
				xis += " ";
				numeroEspacosMeio -= 1;
			}
			xis += "X\n";
		}
		
		//Centro do Xis
		int numeroEspacosCentro = n;
		while(numeroEspacosCentro>0) {
			xis += " ";
			numeroEspacosCentro -= 1;
		}
		xis += "X\n";
		
		//Segunda metade do Xis
		for(int j = n-1; j>=0; j--) {
			int numeroEspacosAntes = j;
			while(numeroEspacosAntes>0) {
				xis += " ";
				numeroEspacosAntes -= 1;
			}
			numeroEspacosAntes = j;
			xis += "X";
			int numeroEspacosMeio = numeroCaracteres - (2 * numeroEspacosAntes) - 2;
			while(numeroEspacosMeio>0) {
				xis += " ";
				numeroEspacosMeio -= 1;
			}
			xis += "X\n";
		}
		return xis;
	}

}
