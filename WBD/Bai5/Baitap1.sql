SELECT * FROM demo.demo;

Alter table demo
add unique unique_index (productCode);

Alter table demo
add index composite_index (productName, productPrice);

create view view_demo as 
select productCode,productName,productPrice,productStatus  from demo;

drop view view_demo;