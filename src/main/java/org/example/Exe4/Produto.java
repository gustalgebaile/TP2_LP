package org.example.Exe4;

import java.math.BigDecimal;
import java.util.Objects;

public final class Produto {
    private final String id;
    private final String nome;
    private final BigDecimal preco;

    public Produto(String id, String nome, BigDecimal preco) {
        this.id = Objects.requireNonNull(id, "id é obrigatório");
        this.nome = Objects.requireNonNull(nome, "nome é obrigatório");
        this.preco = Objects.requireNonNull(preco, "preço é obrigatório");
        if (preco.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("preço não pode ser negativo");
        }
    }
    public String getId() { return id; }
    public String getNome() { return nome; }
    public BigDecimal getPreco() { return preco; }

    public Produto comPreco(BigDecimal novoPreco) {
        return new Produto(this.id, this.nome, novoPreco);
    }
}

