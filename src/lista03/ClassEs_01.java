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
public class ClassEs_01 {

    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 100) {
            if (j % 2 == 0) {
                System.out.println(j);
            };
            j++;
            i++;
        }
    }
}
