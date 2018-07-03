CREATE TABLE `test_club_task2`.`rating_type` (
  `RatingTypeId` INT NOT NULL AUTO_INCREMENT,
  `ReportingContextId` INT NOT NULL,
  `EffectiveStartTimestamp` VARCHAR(50) NULL,
  `EffectiveEndStartTimestamp` VARCHAR(50) NULL,
  `RatingTypeCode` VARCHAR(50) NULL,
  `RatingTypeName` VARCHAR(50) NULL,
  `IsInferredData` VARCHAR(50) NULL,
  `ReferenceDataSnapshotId` VARCHAR(50) NULL,
  `ProcessExecutionId` VARCHAR(50) NULL,
  PRIMARY KEY (`RatingTypeId`, `ReportingContextId`));