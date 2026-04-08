package exercicio2;

import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario fun = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario");
        fun.setName(sc.nextLine());

        System.out.println("Digite o salario do funcionario");
        double sal = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o imposto devido");
        double imp = sc.nextDouble();
        sc.nextLine();

        fun.setSalario(sal, imp);

        System.out.printf("Empregado: %s, $ %.2f \n", fun.getName(), fun.getSalario());

        System.out.println("Aumentar o salario do funcionario?");
        double per = sc.nextDouble();
        fun.setSalario(sal*(1 + sc.nextDouble()/100), imp);

        System.out.printf("Empregado: %s, $ %.2f ", fun.getName(), fun.getSalario());
    }
}
