SELECT * FROM demo.demo;

Alter table demo
add unique unique_index (productCode);

Alter table demo
add index composite_index (productName, productPrice);
create view view_demo as 
select productCode,productName,productPrice,productStatus  from demo;

drop view view_demo;

Delimiter //
Create Procedure allrecords()
    BEGIN
    Select * from demo;
    END//
DELIMITER ;

Delimiter //
Create Procedure addrecord(
	in productcode varchar(45),
    in productname varchar(45),
    in productprice double,
    in productamount int
)
    BEGIN
    INSERT INTO `demo` (`productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) VALUES (productcode, productname, productprice, productamount, 'No Description', 'None');
    END//
DELIMITER ;

Create Procedure deleterecord(in iddelete int)
    BEGIN
    DELETE FROM `demo` WHERE (`id` = iddelete )

    END//
DELIMITER ;

