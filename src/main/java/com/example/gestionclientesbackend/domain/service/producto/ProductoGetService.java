package com.example.gestionclientesbackend.domain.service.producto;


import com.example.gestionclientesbackend.domain.entities.Producto;
import java.util.List;

public interface ProductoGetService {
  Producto getProdcuto(String idproducto);
  List<Producto> getListProducto();

}
