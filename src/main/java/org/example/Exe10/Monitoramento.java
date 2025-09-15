package org.example.Exe10;

import java.util.concurrent.atomic.AtomicInteger;

public class Monitoramento {
    private final AtomicInteger contadorAcessos = new AtomicInteger(0);

    public int getContadorAcessos() {
        return contadorAcessos.get();
    }

    public void registrarAcesso() {
        contadorAcessos.incrementAndGet();
    }
}

