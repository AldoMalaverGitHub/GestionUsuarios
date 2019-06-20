package com.gestion.usuarios.rest.dto;

public class GuardarUsuarioResponseDTO {
	
	private String idUsuario;
	private String codigoError;
	private String mensaje;
	private String error;
	
	public GuardarUsuarioResponseDTO() {
		
	}
	
	public GuardarUsuarioResponseDTO(String idUsuario, String codigoError, String mensaje, String error) {
		super();
		this.idUsuario = idUsuario;
		this.codigoError = codigoError;
		this.mensaje = mensaje;
		this.error = error;
	}
	
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getCodigoError() {
		return codigoError;
	}
	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	

}
