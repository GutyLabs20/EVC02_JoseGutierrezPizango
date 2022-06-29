package com.idat.evalucion.Servicio;

import java.util.List;

import com.idat.evalucion.DTO.ProductoDTORequest;
import com.idat.evalucion.DTO.ProductoDTOResponse;

public interface ProductoServicio {
	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId(Integer id);
}
