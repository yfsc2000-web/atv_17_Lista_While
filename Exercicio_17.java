package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_17 {
    static void main() {
        // Níveis de RMS (Raiz Média Quadrada) são uma forma de medir a potência média contínua
        // de um sinal de áudio, como a saída de um alto-falante em oposição a um pico instantâneo.
        Scanner sc = new Scanner(System.in);
        double nivel;
        int consecutivas = 0;
        int total = 0;

        do {
            System.out.print("Digite o nível RMS de vibração: ");
            nivel = sc.nextDouble();
            total++;

            if (nivel < 2.5) {
                consecutivas++;
            } else {
                consecutivas = 0;
            }

        } while (consecutivas < 3);

        System.out.println("Leituras totais: " + total);
    }
}
