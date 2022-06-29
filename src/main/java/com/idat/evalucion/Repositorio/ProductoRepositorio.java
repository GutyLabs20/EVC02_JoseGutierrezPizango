package com.idat.evalucion.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.evalucion.Model.Productos;

@Repository
public interface ProductoRepositorio extends JpaRepository<Productos, Integer>{

}
