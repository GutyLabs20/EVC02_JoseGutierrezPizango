package com.idat.evalucion.Servicio;

import java.util.List;

import com.idat.evalucion.DTO.ClienteDTORequest;
import com.idat.evalucion.DTO.ClienteDTOResponse;

public interface ClienteServicio {
	public void guardarCliente(ClienteDTORequest cliente);
	public void editarCliente(ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerClienteId(Integer id);
}
