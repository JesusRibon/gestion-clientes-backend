package com.example.gestionclientesbackend.infrastructure.adapter;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.domain.service.ClienteGetService;
import com.example.gestionclientesbackend.infrastructure.dto.ClienteDto;
import com.example.gestionclientesbackend.infrastructure.mapper.ClienteMapper;
import com.example.gestionclientesbackend.infrastructure.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGetAdapter implements ClienteGetService {

  private final ClienteRepository clienteRepository;

  private final ClienteMapper clienteMapper;

  @Override
  public Cliente getCliente(String id) {
    Optional<ClienteDto> clienteDto = clienteRepository.findById(id);
    return clienteDto.map(this::buildCliente).orElse(null);
  }

  @Override
  public List<Cliente> getListCliente() {
    List<ClienteDto> clientesDto = clienteRepository.findAll();
    return clientesDto.stream().map(clienteMapper::toClienteEntity).toList();
  }



  private Cliente buildCliente(ClienteDto cliente){
    return new Cliente(cliente.getId(),cliente.getNombre(),cliente.getApellido(),cliente.getEmail(),cliente.getTelefono(),cliente.getDireccion());
  }
}
