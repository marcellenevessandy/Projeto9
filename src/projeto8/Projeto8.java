package projeto8;

import java.util.Scanner;

public class Projeto8 {

    public static void main(String[] args) {
        int mes;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        mes = ler.nextInt();

        if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("O mês informado é verão!");
        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("O mês informado é outono!");
        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("O mês informado é inverno!");
        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("O mês informado é primavera!");
        } else {

            System.out.println("O mês infomado é inválido!");

        }

    }

}
