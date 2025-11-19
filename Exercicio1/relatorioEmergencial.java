package Exercicio1;

public class relatorioEmergencial implements iRelatorio {
    @Override
    public void prepararRelatorio() {
        System.out.println("Preparando o relatório emergencial");
    }

    @Override
    public void formatarRelatorio() {
        System.out.println("Formatando o relatório emergencial");
    }
    
}
