package com.idat.evalucion.Controllador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.evalucion.DTO.UsuarioRequestDTO;
import com.idat.evalucion.DTO.UsuarioResponseDTO;
import com.idat.evalucion.Seguridad.JwtUtil;
import com.idat.evalucion.Seguridad.UserDetailService;

@RestController
public class UsuarioControlador {
	@Autowired
	private JwtUtil util;

	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioRequestDTO dto){
		
		UserDetails detail = service.loadUserByUsername(dto.getUsuario());
		
		return ResponseEntity.ok(new UsuarioResponseDTO(util.generateToken(detail.getUsername())));
	}
}
