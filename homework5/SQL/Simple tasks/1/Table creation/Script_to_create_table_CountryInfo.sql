CREATE TABLE `test_club`.`countryinfo` (
  `city_id` INT NOT NULL AUTO_INCREMENT,
  `CountryName` VARCHAR(50) NULL,
  `CityName` VARCHAR(50) NULL,
  `Population` INT NULL,
  `isCapital` BIT(1) NULL,
  PRIMARY KEY (`city_id`));