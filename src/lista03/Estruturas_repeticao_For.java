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
public class Estruturas_repeticao_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner NN = new Scanner(System.in);

        int x, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("digite o item " + i + ": ");
            x = NN.nextInt();
            soma = soma + x;
        }
        System.out.println("total: " + soma);
    }

}
