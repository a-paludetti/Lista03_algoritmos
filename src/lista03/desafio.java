/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Scanner;

/**
 *
 * Aline Paludetti de Oliveira
 * Igor Leal Nodari
 */
public class desafio {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Dia do alarme: ");
        String dia = NN.nextLine();
        int dia2 = 0;
        switch (dia.toLowerCase()) {
            case "segunda":
                dia2 = 1;
                break;
            case "terça":
                dia2 = 2;
                break;
            case "quarta":
                dia2 = 3;
                break;
            case "quinta":
                dia2 = 4;
                break;
            case "sexta":
                dia2 = 5;
                break;
            case "sabado":
                dia2 = 6;
                break;
            case "domingo":
                dia2 = 7;
                break;
            default:
                System.out.println("invalido");
                break;
        }
        String dia3;

        System.out.print("Hora do alarme: ");
        int hora = Integer.parseInt(NN.nextLine());

        System.out.print("Minutos: ");
        int minuto = Integer.parseInt(NN.nextLine());

        System.out.print("Segundos: ");
        int segundo = Integer.parseInt(NN.nextLine());

        boolean opcao = false;

        do {
            for (int d = 1; d <= 7; d++) {
                switch (d) {
                    case 1:
                        dia3 = "Segunda";
                        break;
                    case 2:
                        dia3 = "Terça";
                        break;
                    case 3:
                        dia3 = "Quarta";
                        break;
                    case 4:
                        dia3 = "Quinta";
                        break;
                    case 5:
                        dia3 = "Sexta";
                        break;
                    case 6:
                        dia3 = "Sabado";
                        break;
                    case 7:
                        dia3 = "Domingo";
                        break;
                    default:
                        dia3 = "invalido";
                        break;
                }
                for (int h = 0; h <= 23; h++) {
                    for (int m = 0; m <= 59; m++) {
                        for (int s = 0; s <= 59; s++) {
                            System.out.printf("%S - %d:%d:%s", dia3, h, m, s);
                            System.out.println("");
                            if (d == dia2 && h == hora && m == minuto & s == segundo) {
                                System.out.print("asdfghjkl!!!\n");
                                break;
                            }
                        }
                        if (d == dia2 && h == hora && m == minuto) {
                            break;
                        }
                    }
                    if (d == dia2 && h == hora) {
                        break;
                    }
                }

                if (d == dia2) {
                    break;
                }
            }
            System.out.print("Deseja para o alarme (Y/N)? ");
            String opcao2 = NN.nextLine();
            switch (opcao2.toUpperCase()) {
                case "Y":
                    opcao = !opcao;
                    break;
                case "N":
                    opcao = opcao;
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        } while (opcao == false);
    }

}
