package com.es3.vendas.dto;

import com.es3.vendas.entities.Pedidos;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
public class PedidosDto {

    private Long id;
    private String email;
    private String descricao;
    private Double valor;

    public PedidosDto(@NotNull Pedidos pedidos) {
        this.id = pedidos.getId();
        this.email = pedidos.getEmail();
        this.descricao = pedidos.getDescricao();
        this.valor = pedidos.getValor();
    }
}



