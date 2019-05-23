package com.gestion.usuarios.negocio.usuario.impl;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.usuarios.datos.entidades.Usuario;
import com.gestion.usuarios.datos.repository.UsuarioRepository;
import com.gestion.usuarios.negocio.usuario.UsuarioNegocio;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioNegocioDTO;

@Service
public class UsuarioNegocioImpl implements UsuarioNegocio {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional
	public void guardarUsuario(UsuarioNegocioDTO usuarioNegocioDTO) {
		
		Usuario usuario = new Usuario(usuarioNegocioDTO.getNombreUsuario(), true, usuarioNegocioDTO.getUsuarioCreacion(), new Date(), 
				usuarioNegocioDTO.getUsuarioCreacion(), new Date());
		usuarioRepository.save(usuario);

	}

}
