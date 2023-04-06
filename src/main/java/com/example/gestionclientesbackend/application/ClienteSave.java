package com.example.gestionclientesbackend.application;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.domain.service.ClienteSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ClienteSave {

  private final ClienteSaveService clienteSaveService;

  public Cliente saveCliente(Cliente cliente){
    return clienteSaveService.save(cliente);

  }
}
