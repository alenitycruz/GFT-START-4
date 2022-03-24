package resposta;

import java.util.Scanner;

/*
Questão

Utilizando laços de repetição crie uma aplicação que receba a idade e o
peso de 10 pessoas. Calcule e mostre as médias dos pesos das pessoas da
mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos,
de 21 a 30 anos e maiores de 31 anos.
 */

public class IdadePeso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        int peso;
        int somaPesoA = 0;
        int somaPesoB = 0;
        int somaPesoC = 0;
        int somaPesoD = 0;
        int mediaPesoA;
        int mediaPesoB;
        int mediaPesoC;
        int mediaPesoD;

        int contA = 0;
        int contB = 0;
        int contC = 0;
        int contD = 0;

        for (int i = 0 ; i <= 10 ; i++){
            System.out.println("Idade:");
            idade = scan.nextInt();

            System.out.println("Peso:");
            peso = scan.nextInt();

            if (idade <= 10){
                somaPesoA = somaPesoA + peso;
                contA = contA +1;
            }else if (idade <=11 && idade < 20){
                somaPesoB = somaPesoB + peso;
                contB = contB +1;
            }else if (idade >=21 && idade <= 30){
                somaPesoC = somaPesoC + peso;
                contC = contC +1;
            }else if (idade >= 31){
                somaPesoD = somaPesoD + peso;
                contC = contC +1;
            }else {
                System.out.println("Valor inválido!");
            }
        }

        mediaPesoA = somaPesoA/contA;
        mediaPesoB = somaPesoB/contB;
        mediaPesoC = somaPesoC/contC;
        mediaPesoD = somaPesoD/contD;

        System.out.println("Media de peso da faixa etária 1 a 10 anos: " + mediaPesoA);
        System.out.println("Media de peso da faixa etária 11 a 20 anos: " + mediaPesoB);
        System.out.println("Media de peso da faixa etária 21 a 30 anos: " + mediaPesoC);
        System.out.println("Media de peso da faixa etária maiores de 31 anos: " + mediaPesoD);

    }
}
