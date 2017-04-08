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
public class ClassEs_04 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        int i = 1, x, soma = 0, y = 0;

        while (i <= 6) {
            System.out.print("Digite um número positivo: ");
            x = NN.nextInt();

            if (x > 0) {
                soma = soma + x;
                y = y + 1;
            } else {
                System.out.println("número invalido");
            }
            i++;
        }
        System.out.println("Total:" + soma + "\nNúmeros positivos: " + y);
    }
}
