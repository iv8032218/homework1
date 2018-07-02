CREATE TABLE `test_club`.`countryinfo` (
  `city_id` INT NOT NULL AUTO_INCREMENT,
  `CountryName` VARCHAR(50) NULL,
  `CityName` VARCHAR(50) NULL,
  `Population` INT NULL,
  `isCapital` BIT(1) NULL,
  PRIMARY KEY (`city_id`));
  

CREATE TABLE `test_club`.`peopleinfo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(50) NULL,
  `Surname` VARCHAR(50) NULL,
  `city_id` INT NULL,
  `isOccupied` BIT(1) NULL,
  PRIMARY KEY (`id`));