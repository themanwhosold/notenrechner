-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Admin anlegen
-- -----------------------------------------------------
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON * . * TO 'admin'@'localhost';
FLUSH PRIVILEGES;


-- -----------------------------------------------------
-- Schema noten
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema noten
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `noten` DEFAULT CHARACTER SET latin1 ;
USE `noten` ;

-- -----------------------------------------------------
-- Table `noten`.`studiengang`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noten`.`studiengang` (
  `id` INT(11) NOT NULL COMMENT '',
  `studiengangsleiter` INT(11) NOT NULL COMMENT '',
  `bezeichnung` VARCHAR(100) CHARACTER SET 'utf8' NOT NULL COMMENT '',
  `anz_semester` INT NOT NULL COMMENT '',
  `grundstudiumBis` INT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noten`.`Personen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noten`.`Personen` (
  `idPersonen` INT NOT NULL COMMENT '',
  `Nachname` VARCHAR(100) NOT NULL COMMENT '',
  `Vorname` VARCHAR(100) NOT NULL COMMENT '',
  `bio_geschlecht` TINYINT(1) NOT NULL COMMENT '',
  `Geburtsdatum` DATE NOT NULL COMMENT '',
  `Passwort` VARCHAR(45) NOT NULL COMMENT '',
  `Rolle` TINYINT(3) NULL COMMENT '',
  `studiengang_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`idPersonen`)  COMMENT '',
  UNIQUE INDEX `idPersonen_UNIQUE` (`idPersonen` ASC)  COMMENT '',
  INDEX `fk_Personen_studiengang1_idx` (`studiengang_id` ASC)  COMMENT '',
  CONSTRAINT `fk_Personen_studiengang1`
    FOREIGN KEY (`studiengang_id`)
    REFERENCES `noten`.`studiengang` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `noten`.`studienfaecher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noten`.`studienfaecher` (
  `id` INT(11) NOT NULL COMMENT '',
  `studiengangID` INT(11) NOT NULL COMMENT '',
  `bezeichnung` VARCHAR(100) CHARACTER SET 'utf8' NOT NULL COMMENT '',
  `Semester` INT NOT NULL COMMENT '',
  `Dozent_ID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `studiengangID` (`studiengangID` ASC)  COMMENT '',
  INDEX `fk_studienfaecher_Personen1_idx` (`Dozent_ID` ASC)  COMMENT '',
  CONSTRAINT `studienfaecher_ibfk_1`
    FOREIGN KEY (`studiengangID`)
    REFERENCES `noten`.`studiengang` (`id`),
  CONSTRAINT `fk_studienfaecher_Personen1`
    FOREIGN KEY (`Dozent_ID`)
    REFERENCES `noten`.`Personen` (`idPersonen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noten`.`notenart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noten`.`notenart` (
  `notenart_id` INT NOT NULL COMMENT '',
  `studiengang_id` INT(11) NOT NULL COMMENT '',
  `bezeichnung` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`notenart_id`)  COMMENT '',
  INDEX `fk_notenart_studiengang1_idx` (`studiengang_id` ASC)  COMMENT '',
  CONSTRAINT `fk_notenart_studiengang1`
    FOREIGN KEY (`studiengang_id`)
    REFERENCES `noten`.`studiengang` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `noten`.`noten`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noten`.`noten` (
  `id` INT(11) NOT NULL COMMENT '',
  `studienfachID` INT(11) NOT NULL COMMENT '',
  `note` INT(11) NULL DEFAULT NULL COMMENT '',
  `Wunschnote` INT NULL COMMENT '',
  `Matrikelnr` INT NOT NULL COMMENT '',
  `notenart_id` INT NOT NULL COMMENT '',
  `einzelgewicht` INT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `studienfachID` (`studienfachID` ASC)  COMMENT '',
  INDEX `fk_noten_Personen1_idx` (`Matrikelnr` ASC)  COMMENT '',
  INDEX `fk_noten_notenart1_idx` (`notenart_id` ASC)  COMMENT '',
  CONSTRAINT `noten_ibfk_2`
    FOREIGN KEY (`studienfachID`)
    REFERENCES `noten`.`studienfaecher` (`id`),
  CONSTRAINT `fk_noten_Personen1`
    FOREIGN KEY (`Matrikelnr`)
    REFERENCES `noten`.`Personen` (`idPersonen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_noten_notenart1`
    FOREIGN KEY (`notenart_id`)
    REFERENCES `noten`.`notenart` (`notenart_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
