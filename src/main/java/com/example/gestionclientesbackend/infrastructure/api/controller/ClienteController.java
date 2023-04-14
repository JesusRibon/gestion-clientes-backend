package com.example.gestionclientesbackend.infrastructure.api.controller;

import com.example.gestionclientesbackend.application.ClienteDelete;
import com.example.gestionclientesbackend.application.ClienteGet;
import com.example.gestionclientesbackend.application.ClienteSave;
import com.example.gestionclientesbackend.application.ClienteUpdate;
import com.example.gestionclientesbackend.domain.entities.Cliente;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping(path = "/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {



  private final ClienteSave clienteSave;

  private final ClienteGet clienteGet;

  private final ClienteUpdate clienteUpdate;

  private final ClienteDelete clienteDelete;

  @PostMapping("/clientes")
  public  ResponseEntity<Cliente>saveCliente( @RequestBody Cliente cliente){
    return new   ResponseEntity<>(clienteSave.saveCliente(cliente) , HttpStatus.CREATED);
  }


  @GetMapping("/clientes")
  public  ResponseEntity<List<Cliente>> getAllCliente(){
    return ResponseEntity.ok(clienteGet.getListCliente());
  }

  @GetMapping("/clientes/{id}")
  public ResponseEntity<Cliente> getCliente(@PathVariable String id , Cliente cliente){
    return ResponseEntity.ok(clienteGet.getCliente(id, cliente));
  }

  @PutMapping("/clientes/{id}")
  public  void updateCliente(@PathVariable String id , @RequestBody Cliente cliente){
    clienteUpdate.updateCliente(cliente,id);

  }

  @DeleteMapping("/clientes/{id}")
  public void deleteCliente(@PathVariable String id , Cliente cliente){
    clienteDelete.deleteCliente(id, cliente);
  }

}
