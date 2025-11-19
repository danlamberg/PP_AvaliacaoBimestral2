package Exercicio1;

public class fabricaRelatorioDiario implements iFabricaRelatorio {
    
    @Override
    public iRelatorio criarRelatorio() {
        return new relatorioDiario();
    }
    
}
