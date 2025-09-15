package org.example.Exe3;

public class Pedido {
    private final Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = (cliente != null) ? cliente : new ClienteNulo();
    }
    public String getNomeCliente() {
        return cliente.getNome();
    }
}
