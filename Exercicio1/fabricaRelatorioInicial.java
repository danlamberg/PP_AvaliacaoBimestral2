package Exercicio1;

public class fabricaRelatorioInicial implements iFabricaRelatorio {
    
    @Override
    public iRelatorio criarRelatorio() {
        return new relatorioInicial();
    }
    
}
