package com.example.demo.model;

import java.util.List;

public record PedidoRequest(Cliente cliente, List<Producto> productos) {}