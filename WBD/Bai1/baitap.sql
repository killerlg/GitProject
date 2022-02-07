CREATE DATABASE QuanLyBanHang;
USE QuanLyBanHang;
CREATE TABLE Customer
(
    cID   INT AUTO_INCREMENT PRIMARY KEY,
    cName VARCHAR(60) NOT NULL,
    cAge INT NOT NULL
);
CREATE TABLE Orderr
(
    oID INT AUTO_INCREMENT PRIMARY KEY,
    cID INT ,
    oDate DATE NOT NULL,
    oTotalPrice DOUBLE NOT NULL,
    FOREIGN KEY (cID) REFERENCES Customer(cID)
);
CREATE TABLE Product
(
    pID INT AUTO_INCREMENT PRIMARY KEY,
    pName varchar(60),
    pPrice DOUBLE NOT NULL
);
CREATE TABLE OrderDetail
(
    oID INT,
    pID INT,
    odQTY INT NOT NULL,
    PRIMARY KEY(oID,pID)
<<<<<<< HEAD
);
=======
);
>>>>>>> 12b5ece94a32ae5c124a912e3aa68620faed0210
