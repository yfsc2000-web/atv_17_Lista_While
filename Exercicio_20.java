package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_20 {
    static void main() {
        // O inventário cíclico em um sistema AS/RS é uma técnica de auditoria de estoque
        // que realiza contagens regulares e parciais dos produtos, sem a necessidade de parar toda a operação
        Scanner sc = new Scanner(System.in);
        int total, cont = 0, etiqueta;

        System.out.print("Informe o total de prateleiras: ");
        total = sc.nextInt();

        do {
            System.out.print("Leia etiqueta da prateleira " + (cont + 1) + ": ");
            etiqueta = sc.nextInt();
            cont++;
        } while (cont < total);

        System.out.println("Inventário concluído");
        }
}
