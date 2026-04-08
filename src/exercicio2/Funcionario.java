package exercicio2;

public class Funcionario {

    private String name;
    private double salario;

    //Getters ans Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario, double tax) {
        this.salario = salario - tax;
    }


}
