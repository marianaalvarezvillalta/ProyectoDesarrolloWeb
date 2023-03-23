package com.ProyectoDesarrolloWeb.dao;

import com.ProyectoDesarrolloWeb.domain.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
