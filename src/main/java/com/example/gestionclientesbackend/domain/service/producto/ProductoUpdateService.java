package com.example.gestionclientesbackend.domain.service.producto;


import com.example.gestionclientesbackend.domain.entities.Producto;

public interface ProductoUpdateService {
  void updateProducto(Producto producto , String idproducto);

}
