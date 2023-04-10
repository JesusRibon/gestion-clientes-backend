package com.example.gestionclientesbackend.infrastructure.adapter;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.domain.service.ClienteUpdateService;
import com.example.gestionclientesbackend.infrastructure.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteUpdateAdpater implements ClienteUpdateService {

    private final ClienteRepository clienteRepository;

  @Transactional
  public void updateCliente(Cliente Cliente , String id) {

  }
}
