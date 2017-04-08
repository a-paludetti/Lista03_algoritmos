/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Estruturas_repeticao_DoWhile {

    public static void main(String[] args) {
        //
        Scanner NN = new Scanner(System.in);
        int i = 0, j = 2, soma = 0;
        do {
            System.out.println(i + " ainda é menor que " + j);
            i++;
        } while (i < j);

        do {
            System.out.println("digite um número: ");
            int x = NN.nextInt();
            if (x < 0) {
                System.err.println("número invalido");
            }
            soma = soma + x;
            i++;
        } while (i <= 5);
        System.out.println(soma);
    }
}
