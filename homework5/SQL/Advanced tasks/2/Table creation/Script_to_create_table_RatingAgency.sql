CREATE TABLE `test_club_task2`.`rating_agency` (
  `RatingAgencyID` INT NOT NULL AUTO_INCREMENT,
  `ReportingContextId` INT NOT NULL,
  `EffectiveStartTimestamp` VARCHAR(50) NULL,
  `EffectiveEndTimestamp` VARCHAR(50) NULL,
  `RatingAgencyCode` VARCHAR(50) NULL,
  `RatingAgencyName` VARCHAR(50) NULL,
  `IsInternalAgency` VARCHAR(50) NULL,
  `IsInferredData` VARCHAR(50) NULL,
  `ReferenceDataSnapshotId` VARCHAR(50) NULL,
  `ProcessExecutionId` VARCHAR(50) NULL,
  PRIMARY KEY (`RatingAgencyID`, `ReportingContextId`));