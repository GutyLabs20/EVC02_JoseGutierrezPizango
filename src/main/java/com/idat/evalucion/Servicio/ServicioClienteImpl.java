package com.idat.evalucion.Servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.evalucion.DTO.ClienteDTORequest;
import com.idat.evalucion.DTO.ClienteDTOResponse;
import com.idat.evalucion.Model.Cliente;
import com.idat.evalucion.Repositorio.ClienteRepositorio;

public class ServicioClienteImpl implements ClienteServicio{

	@Autowired
	public ClienteRepositorio repositorio;
	
	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		
		repositorio.save(c);
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		repositorio.saveAndFlush(c);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		// TODO Auto-generated method stub
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c = null; 
		

		for (Cliente cliente :repositorio.findAll()) {
			c = new ClienteDTOResponse();
			
			c.setNormbreDTO(cliente.getNombre());
			c.setIdClienteDTO(cliente.getIdCliente());
			c.setDireccionDTO(cliente.getDireccion());
			c.setDniDTO(cliente.getDni());
	
			
			lista.add(c);
			
		}
		return lista;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub
		Cliente cliente = repositorio.findById(id).orElse(null);
		ClienteDTOResponse c = new ClienteDTOResponse();
		c.setNormbreDTO(cliente.getNombre());
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setDireccionDTO(cliente.getDireccion());
		c.setDniDTO(cliente.getDni());
		return c;
	}
	
}
