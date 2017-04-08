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
public class ClassEs_05 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Digite um número entre 2 e 1000: ");
        int N = NN.nextInt();
        int j = 1;

        do {
            System.out.println(j + " x " + N + " = " + (j * N));
            j++;
        } while (j <= 10);

    }
}
