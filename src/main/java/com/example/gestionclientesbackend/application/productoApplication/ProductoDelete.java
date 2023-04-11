package com.example.gestionclientesbackend.application.productoApplication;


import com.example.gestionclientesbackend.domain.entities.Producto;
import com.example.gestionclientesbackend.domain.service.producto.ProductoDeleteService;
import com.example.gestionclientesbackend.domain.service.producto.ProductoGetService;
import com.example.gestionclientesbackend.expeciones.ClienteExeption;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDelete {
  private  final ProductoDeleteService productoDeleteService;
  private final ProductoGetService productoGetService;
  public void deleteProducto(String idproducto , Producto producto){
    Producto producto2 = productoGetService.getProdcuto(producto.getIdproducto());
    if(producto2 !=null){
      productoDeleteService.deleteProducto(idproducto);
      throw new ClienteExeption("Prodcuto elimanado exitosamente ");


    }else{

      throw new ClienteExeption("el producto que desea eliminar no existe " +producto.getIdproducto());

    }




  }

}
