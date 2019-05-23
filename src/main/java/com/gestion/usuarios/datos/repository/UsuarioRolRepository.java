package com.gestion.usuarios.datos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.usuarios.datos.entidades.Usuariorol;

@Repository
public interface UsuarioRolRepository extends JpaRepository<Usuariorol, Integer>{

}
