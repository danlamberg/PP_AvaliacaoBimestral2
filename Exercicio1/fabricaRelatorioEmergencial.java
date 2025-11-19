package Exercicio1;

public class fabricaRelatorioEmergencial implements iFabricaRelatorio {
    
    @Override
    public iRelatorio criarRelatorio() {
        return new relatorioEmergencial();
    }
    
}
