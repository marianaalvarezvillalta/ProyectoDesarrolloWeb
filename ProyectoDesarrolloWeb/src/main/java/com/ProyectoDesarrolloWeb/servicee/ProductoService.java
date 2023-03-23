package com.ProyectoDesarrolloWeb.servicee;

import com.ProyectoDesarrolloWeb.domain.Producto;

public interface ProductoService {

    public void saveProducto(Producto producto);
    
    public void deleteProducto(Producto producto);
    
    public Producto getProducto(Producto producto);
}
