package org.example.Exe7;

public class RelatorioPDF implements Relatorio {
    public void gerarCabecalho() { System.out.println("Cabeçalho PDF"); }
    public void gerarCorpo() { System.out.println("Corpo PDF"); }
    public void gerarRodape() { System.out.println("Rodapé PDF"); }
}

