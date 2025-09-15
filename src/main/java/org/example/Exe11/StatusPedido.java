package org.example.Exe11;

public enum StatusPedido {
    PENDENTE {
        @Override
        public void exibirMensagem() {
            System.out.println("O pedido está pendente.");
        }},
    PROCESSANDO {
        @Override
        public void exibirMensagem() {
            System.out.println("O pedido está sendo processado.");
        }},
    ENVIADO {
        @Override
        public void exibirMensagem() {
            System.out.println("O pedido foi enviado.");
        }},
    ENTREGUE {
        @Override
        public void exibirMensagem() {
            System.out.println("O pedido foi entregue.");
        }};
    public abstract void exibirMensagem();
}
