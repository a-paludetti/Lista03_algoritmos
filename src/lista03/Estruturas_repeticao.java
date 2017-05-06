/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

/**
 *
 * @author aline.poliveira3
 */
public class Estruturas_repeticao {

    public static void main(String[] args) {
        for (int h = 0; h <= 23; h++) { // outer layer
            for (int m = 0; m <= 59; m++) { //mid layer
                for (int s = 0; s <= 59; s++) { // inner layer
                    System.out.printf("%d:%d,%s", h, m, s);
                    System.out.println("");
                    if (h == 23 && m == 55 & s == 13) {
                        System.out.print("asdfghjkl!!!");
                        break;
                    }
                }
                if (h == 23 && m == 55) {
                    break;
                }
            }
            if (h == 23) {
                break;
            }
        }
    }
}
