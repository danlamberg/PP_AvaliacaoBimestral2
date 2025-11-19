package Exercicio2;

public class plataformaAnalise {
    public static void main(String[] args) {
        
        analisadorRisco analiseConservadora = new analisadorRisco(new calculoConservador());
        System.out.println("\nSistema de Análise de Risco:");
        System.out.println("Risco Conservador: " + analiseConservadora.analisar());

        analisadorRisco analiseModerada = new analisadorRisco(new calcularRiscoModerado());
        System.out.println("Risco Moderado: " + analiseModerada.analisar());

        analisadorRisco analiseAgressiva = new analisadorRisco(new calculoAgressivo());
        System.out.println("Risco Agressivo: " + analiseAgressiva.analisar());
        
    }
}
