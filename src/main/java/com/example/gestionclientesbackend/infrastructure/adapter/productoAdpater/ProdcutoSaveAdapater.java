package com.example.gestionclientesbackend.infrastructure.adapter.productoAdpater;


import com.example.gestionclientesbackend.domain.entities.Producto;
import com.example.gestionclientesbackend.domain.service.producto.ProdcutoSaveService;
import com.example.gestionclientesbackend.infrastructure.mapper.ProductoMapper;
import com.example.gestionclientesbackend.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProdcutoSaveAdapater implements ProdcutoSaveService {
  private final ProductoRepository productoRepository;
  private final ProductoMapper productoMapper;


  @Override
  public Producto save(Producto producto){


    return productoMapper.toProductoEntity(productoRepository.save(productoMapper.toProductoDto(producto)));
  }
}
