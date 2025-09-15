package org.example.Exe3;

public class ClienteNulo implements Cliente {
    @Override
    public String getNome() {
        return "Cliente não cadastrado";
    }
}
