package org.example.Exe7;

public class RelatorioPDFFactory implements RelatorioFactory {
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}

