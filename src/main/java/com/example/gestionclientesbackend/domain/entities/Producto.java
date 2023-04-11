package com.example.gestionclientesbackend.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
  private String nombreproducto;
  @Id
  private String idproducto;
  private int cantidad;
  private double precio;
}
