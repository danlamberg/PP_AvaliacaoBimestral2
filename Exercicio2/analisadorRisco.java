package Exercicio2;

public class analisadorRisco {

    private iCalculoRisco calculoRisco;

    public analisadorRisco(iCalculoRisco calculoRisco) {
        this.calculoRisco = calculoRisco;
    }

    public double analisar() {
        return this.calculoRisco.calcularRisco();
    }
}
