package com.example.gestionclientesbackend.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ClienteDto {

  @Id
  /*@GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIcrementable la id*/
  private String id;

  private String nombre;

  private String apellido;

  private String email;

  private int telefono;

  private String direccion;
}
