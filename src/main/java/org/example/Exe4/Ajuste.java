package org.example.Exe4;

import java.math.BigDecimal;

public class Ajuste {

            private static final BigDecimal DESCONTO_FIXO = new BigDecimal("10.00");

            public Produto aplicarDesconto(Produto produto) {
                BigDecimal novoPreco = produto.getPreco().subtract(DESCONTO_FIXO);
                if (novoPreco.compareTo(BigDecimal.ZERO) < 0) {
                    novoPreco = BigDecimal.ZERO;
                }
                return produto.comPreco(novoPreco);
            }

            public AjusteDePreco calcular(Produto produto) {
                BigDecimal original = produto.getPreco();
                BigDecimal desconto = DESCONTO_FIXO.min(original);
                BigDecimal finalComDesconto = original.subtract(desconto);
                return new AjusteDePreco(original, desconto, finalComDesconto);
            }
        }
