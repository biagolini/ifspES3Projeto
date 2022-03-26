package com.es3.vendas.dto;

import com.es3.vendas.entities.Pedido;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
public class PedidosDto {

    private Long id;
    private String email;
    private String descricao;
    private Double valor;

    public PedidosDto(@NotNull Pedido pedido) {
        this.id = pedido.getId();
        this.email = pedido.getEmail();
        this.descricao = pedido.getDescricao();
        this.valor = pedido.getValor();
    }
}



