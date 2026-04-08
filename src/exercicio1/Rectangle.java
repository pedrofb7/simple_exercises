package exercicio1;

public class Rectangle {

    private double base;
    private double altura;

    //GETTERS
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    //SETTERS
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //METHODS
    double calculaArea() {
        return base * altura;
    }
    double calculaPerimetro() {
        return (2*base + 2*altura);
    }
    double calculaDiagonl() {
        return Math.sqrt(base*base + altura*altura);
    }
}

