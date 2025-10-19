package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_16 {
    static void main() {
        // "Amostragem" significa coletar várias medidas para análise.
        Scanner sc = new Scanner(System.in);
        String resultado;
        int contador = 1;

        do {
            System.out.print("Digite o resultado da amostra " + contador + " (A/R): ");
            resultado = sc.nextLine();

            if (resultado.equals("A") || resultado.equals("R")) {
                System.out.println("Amostra " + contador + " registrada como: " + resultado);
                contador++;
            } else {
                System.out.println("Valor inválido! Digite novamente");
            }

        } while (contador <= 10);

    }
}
