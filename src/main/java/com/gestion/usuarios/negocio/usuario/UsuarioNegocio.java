package com.gestion.usuarios.negocio.usuario;

import java.sql.SQLException;
import java.util.List;

import com.gestion.usuarios.negocio.usuario.dto.UsuarioDTO;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioNegocioDTO;

public interface UsuarioNegocio {
	
	Integer guardarUsuario(UsuarioNegocioDTO usuarioNegocioDTO);
	
	List<UsuarioDTO> listarUsuarios();
	
	void eliminarUsuarios(Integer idUsuario);
	
	void actualizarUsuarioPorId(String nombreUsuario, Integer idUsuario) throws SQLException;

}
