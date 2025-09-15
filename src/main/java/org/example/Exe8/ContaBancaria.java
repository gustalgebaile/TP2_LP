package org.example.Exe8;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean podeComprar(double valor) {
        return saldo >= valor;
    }

    public boolean realizarCompra(double valor) {
        if (podeComprar(valor)) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}

