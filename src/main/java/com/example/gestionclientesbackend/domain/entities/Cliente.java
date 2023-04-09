package com.example.gestionclientesbackend.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
  @Id
  /*@GeneratedValue(strategy = GenerationType.IDENTITY) //AutoIcrementable la id*/
  private String id;

  private String nombre;

  private String apellido;

  private String email;

  private int telefono;

  private String direccion;
}
