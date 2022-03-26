package com.es3.vendas.services;

import com.es3.vendas.dto.PedidosDto;
import com.es3.vendas.entities.Pedidos;
import com.es3.vendas.repository.PedidosRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class PedidosService {

    private PedidosRepository pedidosRepository;

    public PedidosDto findPedidosById(Long id) {
        Pedidos pedido = pedidosRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        PedidosDto pedidosDto = new PedidosDto(pedido);
        return pedidosDto;
    }

}
