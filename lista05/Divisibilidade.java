package lista05;

import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
            System.out.println("Divisível por 3 e por 5.");
        else
            System.out.println("Não é divisível por 3 e por 5.");

        sc.close();
    }}
