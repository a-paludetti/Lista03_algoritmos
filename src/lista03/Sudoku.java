/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Random;

/**
 *
 * @author aline.poliveira3
 */
public class Sudoku {

    public static void main(String[] args) {
        int[][] sdk = new int[4][4];

        Random N1 = new Random();
        int N2 = N1.nextInt(4)+1;

        for (int i = 0; i < sdk.length; i++) {
            for (int j = 0; j < sdk[i].length; j++) {
                sdk[i][j] = N2;
                System.out.print(sdk[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
