package com.example.gestionclientesbackend.infrastructure.adapter;

import com.example.gestionclientesbackend.domain.service.ClienteDeleteService;
import com.example.gestionclientesbackend.infrastructure.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteDeleteAdapter implements ClienteDeleteService {

  private final ClienteRepository clienteRepository;

  @Override
  public void deleteCliente(String id) {
    clienteRepository.deleteById(id);

  }
}
