package com.ProyectoDesarrolloWeb.dao;

import com.ProyectoDesarrolloWeb.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Long> {
    
}
