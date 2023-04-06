package com.example.gestionclientesbackend.application;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.domain.service.ClienteGetService;
import com.example.gestionclientesbackend.expeciones.ClienteExeption;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ClienteGet {

  private final ClienteGetService clienteGetService;

  public Cliente getCliente(String id , Cliente cliente){
    Cliente cliente1 = clienteGetService.getCliente(cliente.getId());
    if(cliente1 !=null){
      return clienteGetService.getCliente(id);
    }else{
      throw  new ClienteExeption("Cliente con el id :  "+ id +" no existe ");
    }


  }

  public List<Cliente> getListCliente(){
    return clienteGetService.getListCliente();
  }
}
