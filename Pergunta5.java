//5) Escreva um programa que inverta os caracteres de um string.
//
//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua
//preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class Pergunta5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a palavra a ser invertida: ");
        String palavra = leitor.next();

        String invertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + invertida);
    }
}


