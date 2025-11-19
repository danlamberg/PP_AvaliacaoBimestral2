package Exercicio1;

public class sistemaRelatorio {

    public static void processarRelatorio(iFabricaRelatorio fabrica) {
       
        iRelatorio relatorio = fabrica.criarRelatorio();        
        System.out.println("\nCriando Relatório");
        relatorio.prepararRelatorio();
        relatorio.formatarRelatorio();
    }

    public static void main(String[] args) {
        iFabricaRelatorio fabricaInicial = new fabricaRelatorioInicial();
        processarRelatorio(fabricaInicial);

        iFabricaRelatorio fabricaDiario = new fabricaRelatorioDiario();
        processarRelatorio(fabricaDiario);

        iFabricaRelatorio fabricaEmergencial = new fabricaRelatorioEmergencial();
        processarRelatorio(fabricaEmergencial);
    }
}