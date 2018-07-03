CREATE TABLE `test_club_task1`.`orders` (
  `OrderID` INT NOT NULL,
  `CustomerID` INT NULL,
  `Status` ENUM('Complete', 'In progress', 'Open') NULL,
  `Price` INT NULL,
  PRIMARY KEY (`OrderID`));