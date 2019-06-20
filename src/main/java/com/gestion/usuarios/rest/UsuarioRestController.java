package com.gestion.usuarios.rest;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.usuarios.negocio.usuario.UsuarioNegocio;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioDTO;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioNegocioDTO;
import com.gestion.usuarios.rest.dto.GuardarUsuarioResponseDTO;

@RestController
public class UsuarioRestController {

	@Autowired
	private UsuarioNegocio usuarioNegocio;
	
	@PostMapping(value="/usuario", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public GuardarUsuarioResponseDTO guardarUsuario(@RequestBody UsuarioNegocioDTO usuarioNegocioDTO) {
		Integer idUsuario = usuarioNegocio.guardarUsuario(usuarioNegocioDTO);
		GuardarUsuarioResponseDTO responseDTO = new GuardarUsuarioResponseDTO();
		responseDTO.setIdUsuario(idUsuario.toString());
		responseDTO.setMensaje("Se guardo con exito");
		return responseDTO;
	}
	
	@GetMapping(value="/usuario", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<UsuarioDTO> listarUsuarios(){
		return usuarioNegocio.listarUsuarios();
	}
	
	@DeleteMapping(value="/usuario")
	public String eliminarUsuarios(@RequestBody Map<String, String> request) {
		usuarioNegocio.eliminarUsuarios(Integer.valueOf(request.get("idUsuario")));
		System.out.println(request.get("nombres"));
		return "Se elimino los usuarios";
	}
	
	@PutMapping(value="/usuario")
	public Map<String, String> actualizarUsuario(@RequestBody Map<String, String> request) {
		Map<String, String> response = new HashMap<>();
		try {
			usuarioNegocio.actualizarUsuarioPorId(request.get("nombreUsuario"), Integer.valueOf(request.get("idUsuario")));
		}catch(SQLException sql) {
			response.put("error", sql.getMessage());
		}
		response.put("mensaje", "Se actualizo con exito");
		return response;
	}
}
