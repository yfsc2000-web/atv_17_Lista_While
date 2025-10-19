package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_06 {
    static void main() {
        Scanner input = new Scanner(System.in);
        String resultado;
        int aprovadas = 0;
        int reprovadas = 0;

        do {
            System.out.print("Resultado da inspeção (A = aprovada, R = reprovada, FIM = encerrar): ");
            resultado = input.nextLine().toUpperCase(); // transforma em maiúscula

            if (resultado.equals("A")) {
                aprovadas++;
            } else if (resultado.equals("R")) {
                reprovadas++;
            }

        } while (!resultado.equals("FIM")); // repete até digitar FIM

        System.out.println("Total de aprovadas: " + aprovadas);
        System.out.println("Total de reprovadas: " + reprovadas);

    }
}
