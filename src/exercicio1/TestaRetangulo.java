package exercicio1;

import java.util.Scanner;
public class TestaRetangulo {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retângulo:");
        rec.setBase(sc.nextDouble());
        sc.nextLine();

        System.out.println("Digite a altura do retângulo:");
        rec.setAltura(sc.nextDouble());
        sc.nextLine();

        System.out.println("Area do retângulo:" + rec.calculaArea());
        System.out.println("Perímetro do retangulo:" + rec.calculaPerimetro());
        System.out.println("Diagonal do rectangulo:" + rec.calculaDiagonl());

    }
}
