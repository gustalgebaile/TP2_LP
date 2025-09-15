package org.example.Exe3;

public class ClienteReal implements Cliente {
    private final String nome;

    public ClienteReal(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
