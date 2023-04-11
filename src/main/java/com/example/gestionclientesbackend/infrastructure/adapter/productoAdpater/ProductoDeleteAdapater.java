package com.example.gestionclientesbackend.infrastructure.adapter.productoAdpater;


import com.example.gestionclientesbackend.domain.service.producto.ProductoDeleteService;
import com.example.gestionclientesbackend.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDeleteAdapater implements ProductoDeleteService {
  private final ProductoRepository productoRepository;

  @Override
  public void deleteProducto(String idproducto) {
    productoRepository.deleteById(idproducto);

  }
}
