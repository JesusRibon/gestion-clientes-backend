package com.example.gestionclientesbackend.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class ProductoDto {
  private String nombreproducto;
  @Id
  private String idproducto;
  private int cantidad;
  private double precio;
}
