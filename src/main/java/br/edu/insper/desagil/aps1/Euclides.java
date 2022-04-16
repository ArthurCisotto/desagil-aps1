package br.edu.insper.desagil.aps1;

public class Euclides {

    public int mdc(int a, int b) {
        int numeroA = a;
        int numeroB = b;
        int maior;
        int menor;

        while (numeroA != 0 && numeroB != 0) {
            // Define quem é o maior e menor a cada loop
            if (numeroA > numeroB ) {
                maior = numeroA;
                menor = numeroB;
            } else {
                maior = numeroB;
                menor = numeroA;
            }

            // Subtrai o maior do menor
            maior -= menor;

            // Reatribui A e B e aqui a ordem tanto faz, por causa do if lá no começo do loop
            numeroA = menor;
            numeroB = maior;
        }

        if (numeroA == 0) {
            return numeroB;
        } else {
            return numeroA;
        }

    }

}
