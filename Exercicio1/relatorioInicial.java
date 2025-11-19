package Exercicio1;

public class relatorioInicial implements iRelatorio {
    @Override
    public void prepararRelatorio() {
        System.out.println("Preparando o relatório inicial");
    }

    @Override
    public void formatarRelatorio() {
        System.out.println("Formatando o relatório inicial");
    }
    
}
