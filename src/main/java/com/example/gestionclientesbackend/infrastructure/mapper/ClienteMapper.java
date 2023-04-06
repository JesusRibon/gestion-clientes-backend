package com.example.gestionclientesbackend.infrastructure.mapper;

import com.example.gestionclientesbackend.domain.entities.Cliente;
import com.example.gestionclientesbackend.infrastructure.dto.ClienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

  ClienteDto toClienteDto(Cliente cliente);
  @Mapping(target = "id" , source = "id")
  @Mapping(target = "nombre" , source = "nombre")
  @Mapping(target = "apellido" , source = "apellido")
  @Mapping(target = "email" , source = "email")

 Cliente toClienteEntity(ClienteDto clienteDto);
}
