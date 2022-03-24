package resposta;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu;
        int n1;
        int n2;
        int soma;
        float peso;
        float altura;
        float imc;
        System.out.println("=====MENU======");
        System.out.println("1. Soma");
        System.out.println("2. IMC");
        System.out.println("3. Sair");
        System.out.println("===============");
        menu = scan.nextInt();

        switch (menu){
            case 1:
                System.out.println("Primeiro valor: ");
                n1 = scan.nextInt();
                System.out.println("Segundo Valor");
                n2 = scan.nextInt();
                soma = n1 + n2;
                System.out.println(soma);
                break;
            case 2:
                System.out.println("Peso: ");
                peso = scan.nextFloat();
                System.out.println("Altura: ");
                altura = scan.nextFloat();
                imc = peso/(altura*altura);
                if(imc < 18.5){
                    System.out.println("Peso Abaixo do normal");
                }else if(imc >= 18.5 && imc <25){
                    System.out.println("Peso Normal");
                }else if(imc >=25 && imc < 30) {
                    System.out.println("Sobre Peso");
                }else if(imc >=30 && imc < 35){
                    System.out.println("Grau de obesidade I");
                }
                break;
            default:
                System.out.println("Sair!");
                break;
                


        }


    }
}
