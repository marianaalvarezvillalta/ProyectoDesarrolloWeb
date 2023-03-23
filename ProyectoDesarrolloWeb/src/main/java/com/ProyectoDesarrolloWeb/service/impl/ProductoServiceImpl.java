package com.ProyectoDesarrolloWeb.service.impl;

import com.ProyectoDesarrolloWeb.dao.ProductoDao;
import com.ProyectoDesarrolloWeb.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl {
    @Autowired
    private ProductoDao productoDao;
    
    @Override
    public void save(Producto producto){
        productoDao.save(producto);
    }
    
    @Override
    public void delete(Producto producto){
        productoDao.delete(producto);
    }
    
    @Override
    public Producto getProducto(Producto producto){
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
}
