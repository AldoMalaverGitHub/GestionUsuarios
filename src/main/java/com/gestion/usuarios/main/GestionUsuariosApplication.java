package com.gestion.usuarios.main;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import com.gestion.usuarios.negocio.usuario.UsuarioNegocio;
import com.gestion.usuarios.negocio.usuario.dto.UsuarioNegocioDTO;

@SpringBootApplication
@EntityScan(basePackages = "com.gestion.usuarios.datos.entidades")
@EnableJpaRepositories(basePackages = "com.gestion.usuarios.datos.repository")
@ComponentScan(basePackages = "com.gestion.usuarios")
public class GestionUsuariosApplication implements CommandLineRunner{

	@Autowired
	private UsuarioNegocio usuarioNegocio;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GestionUsuariosApplication.class);
		app.run();
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		//UsuarioNegocioDTO dto = new UsuarioNegocioDTO();
		//dto.setNombreUsuario("amalaver1");
		//dto.setUsuarioCreacion("root");
		//usuarioNegocio.guardarUsuario(dto);
		//System.out.println("ID GENERADO:::" + usuario.getId());
		
	}
	
	

}
