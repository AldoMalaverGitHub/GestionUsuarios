CREATE DATABASE usuariosdb;

USE usuariosdb;

CREATE TABLE `usuariosdb`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombreUsuario` VARCHAR(50) NULL,
  `estado` BIT NULL,
  `usuarioCreacion` VARCHAR(50) NULL,
  `fechaCreacion` DATETIME NULL,
  `usuarioModificacion` VARCHAR(50) NULL,
  `fechaModificacion` DATETIME NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `usuariosdb`.`rol` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombreRol` VARCHAR(50) NULL,
  `estado` BIT NULL,
  `usuarioCreacion` VARCHAR(50) NULL,
  `fechaCreacion` DATETIME NULL,
  `usuarioModificacion` VARCHAR(50) NULL,
  `fechaModificacion` DATETIME NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `usuariosdb`.`opcion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombreOpcion` VARCHAR(50) NULL,
  `estado` BIT NULL,
  `usuarioCreacion` VARCHAR(50) NULL,
  `fechaCreacion` DATETIME NULL,
  `usuarioModificacion` VARCHAR(50) NULL,
  `fechaModificacion` DATETIME NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `usuariosdb`.`usuariorol` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `idUsuario` INT NULL,
  `idRol` INT NULL,
  `estado` BIT NULL,
  `usuarioCreacion` VARCHAR(50) NULL,
  `fechaCreacion` DATETIME NULL,
  `usuarioModificacion` VARCHAR(50) NULL,
  `fechaModificacion` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_USUARIOROL_1_idx` (`idUsuario` ASC) ,
  INDEX `FK_USUARIOROL_2_idx` (`idRol` ASC) ,
  CONSTRAINT `FK_USUARIOROL_1`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `usuariosdb`.`usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_USUARIOROL_2`
    FOREIGN KEY (`idRol`)
    REFERENCES `usuariosdb`.`rol` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
CREATE TABLE `usuariosdb`.`rolopcion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `idRol` INT NULL,
  `idOpcion` INT NULL,
  `estado` BIT NULL,
  `usuarioCreacion` VARCHAR(50) NULL,
  `fechaCreacion` DATETIME NULL,
  `usuarioModificacion` VARCHAR(50) NULL,
  `fechaModificacion` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `FK_ROLOPCION_1_idx` (`idRol` ASC),
  INDEX `FK_ROLOPCION_2_idx` (`idOpcion` ASC),
  CONSTRAINT `FK_ROLOPCION_1`
    FOREIGN KEY (`idRol`)
    REFERENCES `usuariosdb`.`rol` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_ROLOPCION_2`
    FOREIGN KEY (`idOpcion`)
    REFERENCES `usuariosdb`.`opcion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);