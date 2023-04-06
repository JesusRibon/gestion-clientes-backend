package com.example.gestionclientesbackend.application;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.domain.service.ClienteDeleteService;
import com.example.gestionclientesbackend.domain.service.ClienteGetService;
import com.example.gestionclientesbackend.expeciones.ClienteExeption;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteDelete {
    private  final ClienteDeleteService clienteDeleteService;

    private final ClienteGetService clienteGetService;

    public  void deleteCliente(String id , Cliente clinete){
        Cliente cliente1 = clienteGetService.getCliente(id);
        if(cliente1 !=null){
            clienteDeleteService.deleteCliente(id);
        }
        else{
            throw  new ClienteExeption("El cliente que desea eliminar con el ID "+id +"no existe");
        }

    }




}
