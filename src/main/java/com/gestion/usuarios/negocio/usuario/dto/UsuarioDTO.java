package com.gestion.usuarios.negocio.usuario.dto;

public class UsuarioDTO {

	private String id;
	private String nombreUsuario;
	
	public UsuarioDTO(String id, String nombreUsuario) {
	
		this.id = id;
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	
}
