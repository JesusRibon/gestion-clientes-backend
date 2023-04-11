package com.example.gestionclientesbackend.application.productoApplication;


import com.example.gestionclientesbackend.domain.entities.Producto;
import com.example.gestionclientesbackend.domain.service.producto.ProductoGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGet {
  private final ProductoGetService productoGetService;

  public Producto getProducto(String idproducto){
    return productoGetService.getProdcuto(idproducto);
  }

  public List<Producto> getListProducto(){
    return productoGetService.getListProducto();
  }



}
