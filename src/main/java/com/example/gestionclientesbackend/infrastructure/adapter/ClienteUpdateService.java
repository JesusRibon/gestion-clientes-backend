package com.example.gestionclientesbackend.infrastructure.adapter;

import com.example.gestionclientesbackend.domain.entities.Cliente;

public interface ClienteUpdateService {
  void updateCliente(Cliente cliente , String id);

}
