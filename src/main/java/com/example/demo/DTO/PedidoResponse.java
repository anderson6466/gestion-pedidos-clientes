package com.example.demo.DTO;

import java.time.LocalDateTime;

public record PedidoResponse(
	    String nombreCliente,
	    String emailCliente,
	    double total,
	    LocalDateTime fechaCreacion
	) {}