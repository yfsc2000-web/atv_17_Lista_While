package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_14 {
    static void main() {
        Scanner input = new Scanner(System.in);
        String codigo;
        int d01 = 0, d02 = 0, d03 = 0;

        do {
            System.out.print("Digite o código de defeito (D01, D02, D03) ou FIM para encerrar: ");
            codigo = input.nextLine();

            if (codigo.equals("D01")) {
                d01++;
            } else if (codigo.equals("D02")) {
                d02++;
            } else if (codigo.equals("D03")) {
                d03++;
            } else if (!codigo.equals("FIM")) {
                System.out.println("Código inválido. Digite novamente.");
            }

        } while (!codigo.equals("FIM"));

        System.out.println("Total de D01: " + d01);
        System.out.println("Total de D02: " + d02);
        System.out.println("Total de D03: " + d03);
    }
}
