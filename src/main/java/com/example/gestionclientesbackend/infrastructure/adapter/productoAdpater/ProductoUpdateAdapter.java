package com.example.gestionclientesbackend.infrastructure.adapter.productoAdpater;


import com.example.gestionclientesbackend.domain.entities.Producto;
import com.example.gestionclientesbackend.domain.service.producto.ProductoUpdateService;
import com.example.gestionclientesbackend.infrastructure.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoUpdateAdapter implements ProductoUpdateService {
  private final ProductoRepository productoRepository;

  @Transactional
  public void updateProducto(Producto producto ,String idproducto) {


  }
}
