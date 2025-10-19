package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_03 {
    static void main() {
        //  (Identificação por Radiofrequência)
        //  é um sistema que utiliza etiquetas com microchips e antenas
        //  para identificar e rastrear objetos remotamente através de ondas de rádio
        Scanner input = new Scanner(System.in);
        String codigo;

        do {
            System.out.println("Digite o código para verificação:");
            codigo= input.nextLine();

        } while (codigo.length() != 8);;
            System.out.println("Código correto" );
        }
    }


