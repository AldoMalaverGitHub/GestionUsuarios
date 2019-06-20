package com.gestion.usuarios.datos.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gestion.usuarios.datos.entidades.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("Select u From Usuario u where u.estado = :estado")
	List<Usuario> listarUsuarioPorEstado(Boolean estado);
	
	@Query("Update Usuario u set u.nombreUsuario = :nombreUsuario where u.id = :idUsuario")
	@Modifying
	@Transactional
	void actualizarUsuarioPorId(@Param("nombreUsuario") String nombreUsuario, @Param("idUsuario") Integer idUsuario);

}
