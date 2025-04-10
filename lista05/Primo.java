package lista05;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();
        boolean primo =true;

        if(num <=1){
            primo = false;
        } else {
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    primo = false;
                    break;
                }
            }
        }
    }
}
