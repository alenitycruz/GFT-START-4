package resposta;

/*
Questão

Escreva um programa onde o usuário digite um valor inteiro e o
programa escreva a música do “Elefante incomoda” correspondente ao
valor digitado:
Exemplo: Usuário digitou o no 3
Saída: Incomoda Incomoda Incomoda muito mais
 */

import java.util.Scanner;

public class MusicaElefante {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int musica;

        System.out.println("Digite o valor 1, 2 ou 3 para escutar um trecho da musica do Elefantinho: ");
        musica = scan.nextInt();

        switch (musica) {
            case 1:
                System.out.println("Um Elefante ...");
                break;
            case 2:
                System.out.println("...Incomoda muita gente...");
                break;
            case 3:
                System.out.println("...dois Elefantes incomodam, incomodam muito mais!");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }


    }
}
