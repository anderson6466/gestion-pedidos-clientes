package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.PedidoResponse;
import com.example.demo.model.PedidoRequest;
import com.example.demo.model.Producto;

@Service
public class PedidoService {
	public PedidoResponse procesarPedido(PedidoRequest pedido) {
        if (pedido.productos() == null || pedido.productos().isEmpty()) {
            throw new IllegalArgumentException("El pedido debe contener al menos un producto.");
        }

        double total = 0;

        for (Producto p : pedido.productos()) {
            if (p.cantidad() <= 0) {
                throw new IllegalArgumentException("La cantidad del producto '" + p.nombre() + "' debe ser mayor a 0.");
            }
            total += p.cantidad() * p.precioUnitario();
        }

        return new PedidoResponse(
            pedido.cliente().nombre(),
            pedido.cliente().email(),
            total,
            LocalDateTime.now()
        );
    }
}
