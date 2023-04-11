package com.example.gestionclientesbackend.application.productoApplication;


import com.example.gestionclientesbackend.domain.entities.Producto;
import com.example.gestionclientesbackend.domain.service.producto.ProductoGetService;
import com.example.gestionclientesbackend.domain.service.producto.ProductoUpdateService;
import com.example.gestionclientesbackend.expeciones.ClienteExeption;
import com.example.gestionclientesbackend.infrastructure.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoUpdate implements ProductoUpdateService {
  private final ProductoRepository productoRepository;
  private final ProductoGetService productoGetService;


  @Transactional
  public void updateProducto(Producto producto , String idproducto) {
    Producto producto1 = productoGetService.getProdcuto(producto.getIdproducto());
    if(producto1 !=null){
      productoRepository.updateProducto(producto.getNombreproducto(),
          producto.getIdproducto(),
          producto.getCantidad(),
          producto.getPrecio());
    }else{
      throw new ClienteExeption("El producto que desea actualizazr , no existe con esa Id:"+ idproducto);
    }



  }
}
