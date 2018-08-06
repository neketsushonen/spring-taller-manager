SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `taller` ;
CREATE SCHEMA IF NOT EXISTS `taller` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
USE `taller` ;


-- -----------------------------------------------------
-- Table `taller`.`sps_vendedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `taller`.`sps_vendedor` ;

CREATE  TABLE IF NOT EXISTS `taller`.`sps_vendedor` (
  `sps_id` INT NOT NULL AUTO_INCREMENT ,
  `sps_nombre_completo` VARCHAR(45) NULL ,
  `sps_direccion` VARCHAR(45) NULL ,
  `sps_rut` VARCHAR(45) NULL ,
  `sps_nick` VARCHAR(45) NULL ,
  `sps_telefono` VARCHAR(45) NULL ,
  `sps_password` VARCHAR(1000) NULL ,
  `sps_privilegio` INT NULL COMMENT '1: vendeor\n2: bodeguero\n3: administrador general\n4: Patron' ,
  `sps_idioma` VARCHAR(45) NULL DEFAULT 'zh_CN' ,
  `sps_correo` VARCHAR(100) NULL ,
  PRIMARY KEY (`sps_id`) )
ENGINE = InnoDB;
 
