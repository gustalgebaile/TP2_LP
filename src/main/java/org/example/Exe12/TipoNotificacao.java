package org.example.Exe12;

public enum TipoNotificacao {
    EMAIL {
        @Override
        public void enviar() {
            System.out.println("Enviando e-mail...");
        }
    },
    SMS {
        @Override
        public void enviar() {
            System.out.println("Enviando SMS...");
        }
    },
    PUSH {
        @Override
        public void enviar() {
            System.out.println("Enviando notificação push...");
        }
    };

    public abstract void enviar();
}

