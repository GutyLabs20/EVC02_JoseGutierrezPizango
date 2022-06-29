package com.idat.evalucion.Servicio;

import java.util.List;

import com.idat.evalucion.DTO.BodegaDTORequest;
import com.idat.evalucion.DTO.BodegaDTOResponse;

public interface BodegaServicio {
	public void guardarBodega(BodegaDTORequest bodega);
	public void editarBodega(BodegaDTORequest bodega);
	public void eliminarBodega(Integer id);
	public List<BodegaDTOResponse> listarBodega();
	public BodegaDTOResponse obtenerBodegaId(Integer id);
}
