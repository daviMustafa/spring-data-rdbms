USE [master]
    GO
    IF (SELECT COUNT (*) FROM sys.databases WHERE Name = 'MyAppDb') = 0
BEGIN
CREATE DATABASE [MyAppDb]
    END
    GO

USE [MyAppDb]
    GO
    IF (SELECT COUNT (*) FROM sys.databases WHERE Name = 'MyAppDb') = 1
BEGIN
ALTER DATABASE [MyAppDb] SET RECOVERY Simple
ALTER DATABASE [MyAppDb] COLLATE Latin1_General_CI_AS;
ALTER DATABASE [MyAppDb] SET COMPATIBILITY_LEVEL = 130;
END
GO
