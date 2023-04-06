package com.example.gestionclientesbackend.domain.service;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import java.util.List;

public interface ClienteGetService {

  Cliente getCliente(String id);

  List<Cliente> getListCliente();
}
