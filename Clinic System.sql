-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Vet_Clinic
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Vet_Clinic
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Vet_Clinic` DEFAULT CHARACTER SET utf8 ;
USE `Vet_Clinic` ;

-- -----------------------------------------------------
-- Table `Vet_Clinic`.`Owner`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Vet_Clinic`.`Owner` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `phone` VARCHAR(20) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `address` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Vet_Clinic`.`Pet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Vet_Clinic`.`Pet` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `animal_kind` VARCHAR(45) NOT NULL,
  `photo_path` VARCHAR(150) NOT NULL,
  `weight` FLOAT NOT NULL,
  `Owner_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_Pet_Owner_idx` (`Owner_id` ASC),
  CONSTRAINT `fk_Pet_Owner`
    FOREIGN KEY (`Owner_id`)
    REFERENCES `Vet_Clinic`.`Owner` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Vet_Clinic`.`Clinic`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Vet_Clinic`.`Clinic` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  `phone` VARCHAR(20) NOT NULL,
  `working days` ENUM('sat', 'sun', 'mon', 'tue', 'wen', '', 'thu', 'fri') NULL,
  `open_at` TIME NOT NULL,
  `close_at` TIME NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `url` VARCHAR(200) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Vet_Clinic`.`Doctor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Vet_Clinic`.`Doctor` (
  `idr` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `phone` VARCHAR(20) NOT NULL,
  `photo_path` VARCHAR(255) NULL,
  `bio_path` VARCHAR(255) NULL,
  `Clinic_id` INT NOT NULL,
  PRIMARY KEY (`idr`),
  UNIQUE INDEX `idr_UNIQUE` (`idr` ASC),
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC),
  INDEX `fk_Doctor_Clinic1_idx` (`Clinic_id` ASC),
  CONSTRAINT `fk_Doctor_Clinic1`
    FOREIGN KEY (`Clinic_id`)
    REFERENCES `Vet_Clinic`.`Clinic` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Vet_Clinic`.`Visit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Vet_Clinic`.`Visit` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date` TIMESTAMP NOT NULL,
  `Clinic_id` INT NOT NULL,
  `Doctor_idr` INT NOT NULL,
  `Pet_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_Visit_Clinic1_idx` (`Clinic_id` ASC),
  INDEX `fk_Visit_Doctor1_idx` (`Doctor_idr` ASC),
  INDEX `fk_Visit_Pet1_idx` (`Pet_id` ASC),
  CONSTRAINT `fk_Visit_Clinic1`
    FOREIGN KEY (`Clinic_id`)
    REFERENCES `Vet_Clinic`.`Clinic` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Visit_Doctor1`
    FOREIGN KEY (`Doctor_idr`)
    REFERENCES `Vet_Clinic`.`Doctor` (`idr`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Visit_Pet1`
    FOREIGN KEY (`Pet_id`)
    REFERENCES `Vet_Clinic`.`Pet` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
