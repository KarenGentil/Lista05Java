import java.util.Scanner;

public class ParidadePositividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Número par.");
        else
            System.out.println("Número ímpar.");

        if (num > 0)
            System.out.println("Número positivo.");
        else if (num < 0)
            System.out.println("Número negativo.");
        else
            System.out.println("Número zero.");

        sc.close();
    }
}
