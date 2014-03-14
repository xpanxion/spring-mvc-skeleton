USE master
GO

IF EXISTS(select * from sys.databases where name='test')
DROP DATABASE test
GO

CREATE DATABASE test
CONTAINMENT = PARTIAL
GO

CREATE LOGIN testuser with password='test', CHECK_POLICY = OFF
GO

USE test;
GO

CREATE USER testuser;
GO

GRANT ALTER, CONTROL TO testuser;
GO




