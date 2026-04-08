package exercicio3;

import java.util.Scanner;
public class Negativos {
    public static void main(String[] args){

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números");
        n = sc.nextInt();
        sc.nextLine();

        int[] numbers = new int[n];

        for(int i = 0; i < n; i++) {

            System.out.println("Digite o numero:");
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Estes são os números negativos:");
        for(int i = 0; i < n; i++) {

            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
