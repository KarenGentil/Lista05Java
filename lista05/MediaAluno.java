import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 60) {
            System.out.println("Classificação: Aprovado.");
        } else if (media >= 40) {
            System.out.println("Classificação: Recuperação.");
        } else {
            System.out.println("Classificação: Reprovado.");
        }

        sc.close();
    }
}
