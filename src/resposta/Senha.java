package resposta;

import java.util.Scanner;

/*
Questão

Desenvolva um programa que continue lendo uma senha até que ela seja
válida. Caso a senha estiver errada, escreva no console “Senha Inválida” e
ler novamente o próximo input. Quando ler a senha correta deve escrever
no console “Acesso garantido” e finalizar a aplicação. A senha correta é
2018.
 */

public class Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in );

        int senhaPadrao = 1111;
        int senha;

        System.out.println("Digite a sua senha: ");
        do {
            senha = scan.nextInt();
            if (senha == senhaPadrao ) {
                System.out.println("Acesso garantido");
            } else {
                System.out.println("Senha inválida");
                senha = scan.nextInt();
            }

        }while (senha != senhaPadrao);
    }
}
