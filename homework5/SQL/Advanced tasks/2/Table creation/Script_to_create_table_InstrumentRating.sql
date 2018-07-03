CREATE TABLE `test_club_task2`.`instument_rating` (
  `InstumentRatingId` INT NOT NULL AUTO_INCREMENT,
  `ReportingContextId` INT NOT NULL,
  `EffectiveStartTimestamp` VARCHAR(50) NULL,
  `EffectiveEndStartTimestamp` VARCHAR(50) NULL,
  `InstrumentId` VARCHAR(50) NULL,
  `RatingId` VARCHAR(50) NULL,
  `ECAICredirQualityStep` VARCHAR(50) NULL,
  `ReferenceDataSnapshotId` VARCHAR(50) NULL,
  `ProcessExecutionId` VARCHAR(50) NULL,
  `InstumentRatingcol` VARCHAR(45) NULL,
  PRIMARY KEY (`InstumentRatingId`, `ReportingContextId`));