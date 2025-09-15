package org.example.Exe9;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
    private final Queue<String> mensagens = new LinkedList<>();

    public String verProximaMensagem() {
        return mensagens.peek();
    }

    public String removerProximaMensagem() {
        return mensagens.poll();
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    public boolean estaVazia() {
        return mensagens.isEmpty();
    }
}
