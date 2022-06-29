package com.idat.evalucion.Servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.evalucion.DTO.ProductoDTORequest;
import com.idat.evalucion.DTO.ProductoDTOResponse;
import com.idat.evalucion.Model.Productos;
import com.idat.evalucion.Repositorio.ProductoRepositorio;

public class ProductoServicioImpl implements ProductoServicio{

	@Autowired
	public ProductoRepositorio repositorio;
	
	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		// TODO Auto-generated method stub
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdProducto(producto.getIdProductoDTO());
		p.setProducto(producto.getNombreProductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.save(p);
	}

	@Override
	public void editarProducto(ProductoDTORequest producto) {
		// TODO Auto-generated method stub
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdProducto(producto.getIdProductoDTO());
		p.setProducto(producto.getNombreProductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		// TODO Auto-generated method stub
		List<ProductoDTOResponse> lista = new ArrayList<ProductoDTOResponse>();
		ProductoDTOResponse p = null; 

		for (Productos producto :repositorio.findAll()) {
			p = new ProductoDTOResponse();
			
			p.setDescripcionDTO(producto.getDescripcion());
			p.setIdProductoDTO(producto.getIdProducto());
			p.setNombreProductoDTO(producto.getProducto());
			p.setPrecioDTO(producto.getPrecio());
			p.setStockDTO(producto.getStock());
			
			lista.add(p);
		
		}
		
		return lista;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		Productos producto = repositorio.findById(id).orElse(null);
		ProductoDTOResponse p = new ProductoDTOResponse();
		p.setDescripcionDTO(producto.getDescripcion());
		p.setIdProductoDTO(producto.getIdProducto());
		p.setNombreProductoDTO(producto.getProducto());
		p.setPrecioDTO(producto.getPrecio());
		p.setStockDTO(producto.getStock());
		return p;
	}
	
}
