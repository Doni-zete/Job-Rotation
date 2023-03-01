// 2)Dado a sequência de Fibonacci,onde se inicia por 0 e 1 e o próximo valor sempre será
// a soma dos 2 valores anteriores(exemplo:0,1,1,2,3,5,8,13,21,34...),escreva um programa
// na linguagem que desejar onde,informado um número,ele calcule a sequência de Fibonacci
// e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
// IMPORTANTE:
// Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class Pergunta2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int fibonacci = 0, fibonacc1 = 0, fibonacc2 = 1, numero;

        System.out.print("Informe um número:");
        numero = leitor.nextInt();

        while (fibonacci < numero) {
            fibonacci = fibonacc1 + fibonacc2;
            fibonacc1 = fibonacc2;
            fibonacc2 = fibonacci;
        }

        if (fibonacci == numero) {
            System.out.println("O número informado pertence a sequência fibonacci");
        } else {
            System.out.println(" O número infromado NÃO pertence a sequência de Fibonacci");
        }

    }

}
