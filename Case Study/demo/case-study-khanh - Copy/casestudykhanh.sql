CREATE DATABASE CASESTUDYKHANH;
USE CASESTUDYKHANH;

CREATE TABLE USER(
ID_USER INT AUTO_INCREMENT,
FULLNAME VARCHAR(50),
ADDRESS VARCHAR(500),
PHONENUMBER INT(10),
USERNAME VARCHAR(30) NOT NULL,
PASSWORD VARCHAR(8) NOT NULL,
PRIMARY KEY (ID)
);
DROP TABLE POST;
CREATE TABLE POST(
ID_POST INT AUTO_INCREMENT,
URL_IMAGE VARCHAR(800) NOT NULL,
TEXT_POST VARCHAR(3000) NOT NULL, 
PRIMARY KEY(ID_POST)
);
DROP DATABASE `STUDENT-MANAGEMENT`;