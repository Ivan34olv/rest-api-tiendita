package com.mx.tiendita.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.tiendita.Entity.Productos;

@Repository

public interface ProductRepository extends JpaRepository<Productos, Long>{

}
