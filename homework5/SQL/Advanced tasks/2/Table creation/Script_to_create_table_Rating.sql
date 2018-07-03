CREATE TABLE `test_club_task2`.`rating` (
  `RatingId` INT NOT NULL AUTO_INCREMENT,
  `ReportingContextId` INT NOT NULL,
  `EffectiveStartTimestamp` VARCHAR(50) NULL,
  `EffectiveEndTimestamp` VARCHAR(50) NULL,
  `RatingAgencyID` VARCHAR(50) NULL,
  `RatingTypeId` VARCHAR(50) NULL,
  `RatingValue` VARCHAR(50) NULL,
  `Ranking` VARCHAR(50) NULL,
  `ECAICreditQualityStep` VARCHAR(50) NULL,
  `IsInferredData` VARCHAR(50) NULL,
  `ReferenceDataSnapshotId` VARCHAR(50) NULL,
  `ProcessExecutionId` VARCHAR(50) NULL,
  PRIMARY KEY (`RatingId`, `ReportingContextId`));