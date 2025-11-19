package Exercicio1;

public class relatorioDiario implements iRelatorio {
    @Override
    public void prepararRelatorio() {
        System.out.println("Preparando o relatório diário");
    }

    @Override
    public void formatarRelatorio() {
        System.out.println("Formatando o relatório diário");
    }
    
}
