package com.example.gestionclientesbackend.application.productoApplication;


import com.example.gestionclientesbackend.domain.entities.Producto;
import com.example.gestionclientesbackend.domain.service.producto.ProdcutoSaveService;
import com.example.gestionclientesbackend.domain.service.producto.ProductoGetService;
import com.example.gestionclientesbackend.expeciones.ClienteExeption;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j


public class ProductoSave {

  private final ProdcutoSaveService prodcutoSaveService;

  private final ProductoGetService productoGetService;


  public Producto saveProducto(Producto producto) {
    Producto producto1 = productoGetService.getProdcuto(producto.getIdproducto());

    if (producto1 != null) {
      throw new ClienteExeption("Producto ya existe  con id de prodcuto de: " + producto.getIdproducto());
    }else{
      log.info("Producto subido exitosamente");
      return prodcutoSaveService.save(producto);
    }

  }
}


