package projeto8;

import java.util.Scanner;

public class Projeto8 {

    public static void main(String[] args) {
        int mes;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        mes = ler.nextInt();

        switch (mes) {

            case 1:
            case 2:
            case 12:
                System.out.println("O mês informado é verão!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("O mês informado é outono!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("O mês informado é inverno!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("O mês informado é primavera!");
                break;
            default:
                System.out.println("O mês infomado é inválido!");

        }

    }

}
