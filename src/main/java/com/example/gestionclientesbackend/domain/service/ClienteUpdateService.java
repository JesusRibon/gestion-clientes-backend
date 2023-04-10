package com.example.gestionclientesbackend.domain.service;

import com.example.gestionclientesbackend.domain.entities.Cliente;

public interface ClienteUpdateService {
  void updateCliente(Cliente cliente , String id);

}
