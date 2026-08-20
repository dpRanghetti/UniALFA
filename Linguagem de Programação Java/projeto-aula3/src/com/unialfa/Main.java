package com.unialfa;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Olá UniALFA! "); // sem argumentos
        imprimir("Olá UniALFA! " + args[2]); // com argumentos
        int numeros[] = new int[2];
        numeros[0] = 2;
        numeros[1] = 3;

        int total = somar(numeros);
        imprimir("O resultado da soma é: " + total);

    }
     private static void imprimir(String conteudo){
         System.out.println(conteudo);
     }

    private static int somar(int[] numeros){
        return numeros[0] + numeros[1];
    }
}
