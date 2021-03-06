package com.es3.vendas.controller;

import com.es3.vendas.services.PedidosService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("pedidos")
public class PedidosController {

    private final PedidosService pedidosService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findPedidosById(@PathVariable Long id) {
        return ResponseEntity.ok(this.pedidosService.findPedidosById(id));
    }

}


