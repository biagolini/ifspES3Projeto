package com.es3.vendas.services;

import com.es3.vendas.dto.PedidosDto;
import com.es3.vendas.entities.Pedido;
import com.es3.vendas.entities.repository.PedidosRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class PedidosService {

    private PedidosRepository pedidosRepository;

    public PedidosDto findPedidosById(Long id) {
        Pedido pedido = pedidosRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        PedidosDto pedidosDto = new PedidosDto(pedido);
        return pedidosDto;
    }

}
