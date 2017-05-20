/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aline.poliveira3
 */
public class RPG {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        String escolha, escolha2;

        JOptionPane.showInputDialog("escolha:\n"
                + "1 - x;"
                + "\n2 - y");
        escolha = NN.nextLine();

        switch (escolha.toLowerCase()) {
            case "1":
                JOptionPane.showInputDialog(null, "escolha:\n"
                        + "1 - x\n"
                        + "2 - y");
                escolha2 = NN.nextLine();
                break;
            case "2":
                JOptionPane.showInputDialog("escolha:\n"
                        + "1 - w\n"
                        + "2 - z");
                escolha2 = NN.nextLine();
                break;
            default:
                JOptionPane.showMessageDialog(null, "inválido");
        }
    }
}
