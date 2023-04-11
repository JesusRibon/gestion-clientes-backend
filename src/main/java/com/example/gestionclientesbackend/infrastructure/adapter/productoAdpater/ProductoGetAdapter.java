package com.example.gestionclientesbackend.infrastructure.adapter.productoAdpater;


import com.example.gestionclientesbackend.domain.entities.Producto;
import com.example.gestionclientesbackend.domain.service.producto.ProductoGetService;
import com.example.gestionclientesbackend.infrastructure.dto.ProductoDto;
import com.example.gestionclientesbackend.infrastructure.mapper.ProductoMapper;
import com.example.gestionclientesbackend.infrastructure.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGetAdapter implements ProductoGetService {
private final ProductoRepository productoRepository;
private final ProductoMapper productoMapper;
  @Override
  public Producto getProdcuto(String idproducto) {
    Optional<ProductoDto>  productoDto = productoRepository.findById(idproducto);
    return productoDto.map(this::buildProducto).orElse(null);
  }

  @Override
  public List<Producto> getListProducto() {
    List<ProductoDto>  productosDto = productoRepository.findAll();
    return productosDto.stream().map(productoMapper::toProductoEntity).toList();
  }
  
  private Producto buildProducto(ProductoDto producto){
    return new Producto(producto.getNombreproducto(),producto.getIdproducto(),producto.getCantidad(),producto.getPrecio());

  }
}

