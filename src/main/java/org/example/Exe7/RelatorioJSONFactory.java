package org.example.Exe7;

public class RelatorioJSONFactory implements RelatorioFactory {
    public Relatorio criarRelatorio() {
        return new RelatorioJSON();
    }
}
