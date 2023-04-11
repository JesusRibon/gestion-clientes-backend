package com.example.gestionclientesbackend.infrastructure.repository;


import com.example.gestionclientesbackend.infrastructure.dto.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoDto, String> {
  @Query(nativeQuery = true , value = "update producto_dto set nombreproducto = :nombreproducto , cantidad = :cantidad , precio = :precio where idproducto = :idproducto")
  @Modifying
  void updateProducto(@Param("nombreproducto") String nombreproducto,
                      @Param("idproducto" )String idproducto,
                       @Param("cantidad") int cantidad,
                       @Param("precio") double precio);

}
