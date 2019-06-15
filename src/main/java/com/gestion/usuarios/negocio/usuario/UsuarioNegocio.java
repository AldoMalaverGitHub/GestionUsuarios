package com.gestion.usuarios.negocio.usuario;

import java.util.List;

import com.gestion.usuarios.negocio.usuario.dto.UsuarioDTO;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioNegocioDTO;

public interface UsuarioNegocio {
	
	void guardarUsuario(UsuarioNegocioDTO usuarioNegocioDTO);
	
	List<UsuarioDTO> listarUsuarios();

}
