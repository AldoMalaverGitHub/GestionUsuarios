package com.gestion.usuarios.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.usuarios.negocio.usuario.UsuarioNegocio;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioDTO;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioNegocioDTO;

@RestController
public class UsuarioRestController {

	@Autowired
	private UsuarioNegocio usuarioNegocio;
	
	@PostMapping(value="/usuario", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String guardarUsuario(@RequestBody UsuarioNegocioDTO usuarioNegocioDTO) {
		usuarioNegocio.guardarUsuario(usuarioNegocioDTO);
		return "se guardo";
	}
	
	@GetMapping(value="/usuario", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<UsuarioDTO> listarUsuarios(){
		return usuarioNegocio.listarUsuarios();
	}
}
