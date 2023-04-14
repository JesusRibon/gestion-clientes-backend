package com.example.gestionclientesbackend.application;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.domain.service.ClienteGetService;
import com.example.gestionclientesbackend.domain.service.ClienteUpdateService;
import com.example.gestionclientesbackend.expeciones.ClienteExeption;
import com.example.gestionclientesbackend.infrastructure.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteUpdate implements ClienteUpdateService {

  private final ClienteRepository clienteRepository;

  private final ClienteGetService clienteGetService;

  @Transactional
  public void updateCliente(Cliente cliente , String id) {
    Cliente cliente1 = clienteGetService.getCliente(cliente.getId());
    if(cliente1 !=null){
      clienteRepository.updateCliente(cliente.getId(),
          cliente.getNombre(),
          cliente.getApellido(),
          cliente.getEmail(),
          cliente.getTelefono(),
          cliente.getDireccion());

    }else{
      throw new ClienteExeption("El cliente que desea actualizar no existe con ese ID"+id);
    }

  }
}
