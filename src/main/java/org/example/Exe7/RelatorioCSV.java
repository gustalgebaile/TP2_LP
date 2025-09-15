package org.example.Exe7;

public class RelatorioCSV implements Relatorio {
    public void gerarCabecalho() { System.out.println("Cabeçalho CSV"); }
    public void gerarCorpo() { System.out.println("Corpo CSV"); }
    public void gerarRodape() { System.out.println("Rodapé CSV"); }
}
