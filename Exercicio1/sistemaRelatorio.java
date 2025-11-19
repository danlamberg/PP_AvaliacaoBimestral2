package Exercicio1;

public class sistemaRelatorio {
    public static void main(String[] args) {
        iRelatorio relatorio1 = new relatorioInicial();
        relatorio1.prepararRelatorio();
        relatorio1.formatarRelatorio();

        iRelatorio relatorio2 = new relatorioDiario();
        relatorio2.prepararRelatorio();
        relatorio2.formatarRelatorio();

        iRelatorio relatorio3 = new relatorioEmergencial();
        relatorio3.prepararRelatorio();
        relatorio3.formatarRelatorio();
    }
}
