package com.example.gestionclientesbackend.infrastructure.adapter;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.domain.service.ClienteSaveService;
import com.example.gestionclientesbackend.infrastructure.mapper.ClienteMapper;
import com.example.gestionclientesbackend.infrastructure.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteSaveAdapter implements ClienteSaveService {

  private final ClienteRepository clienteRepository;

  private final ClienteMapper clienteMapper;


  @Override
  public Cliente save(Cliente cliente) {
    return clienteMapper.toClienteEntity(clienteRepository.save(clienteMapper.toClienteDto(cliente)));
  }
}
