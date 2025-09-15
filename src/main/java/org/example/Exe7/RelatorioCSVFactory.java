package org.example.Exe7;

public class RelatorioCSVFactory implements RelatorioFactory {
    public Relatorio criarRelatorio() {
        return new RelatorioCSV();
    }
}
