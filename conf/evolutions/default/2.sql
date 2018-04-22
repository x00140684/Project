# --- Sample dataset
 
# --- !Ups
 
delete from product;
delete from category;

insert into category (id,name) values ( 1,'RAM' );
insert into category (id,name) values ( 2,'Processors' );
insert into category (id,name) values ( 3,'Graphics Cards' );
insert into category (id,name) values ( 4,'Mother Boards' );
insert into category (id,name) values ( 5,'Solid State Discs' );
insert into category (id,name) values ( 6,'Power Supplies' );
insert into category (id,name) values ( 7,'Case Towers' ); 
insert into category (id,name) values ( 8,'Accesories' ); 
 
insert into product (id,name,description,stock,price) values ( 1,'Intel® Core™ i5-7400 Processor ','6M Cache, up to 3.50 GHz',15,199.99 );
insert into product (id,name,description,stock,price) values ( 2,'Intel® Core™ i7-6700K Processor ','8M Cache, up to 4.50 GHz',12,300.00 );
insert into product (id,name,description,stock,price) values ( 3,'Nividia® GTX 1080TI ','8GB Memory',5,1000.00 );
insert into product (id,name,description,stock,price) values ( 4,'MSI Geforce GTX 1050TI','4GB Memory, Frozr Technology',15,300.00 );
insert into product (id,name,description,stock,price) values ( 5,'HyperX FURY 8GB','DDR3-1600MHz CL10',5,99.00 );
insert into product (id,name,description,stock,price) values ( 6,'Kingston 4gb','DDR4-2400MHz CL10',12,77.00 );
insert into product (id,name,description,stock,price) values ( 7,'MSI G31-213','DVI-D, 4x SATA III',21,150.00 );
insert into product (id,name,description,stock,price) values ( 8,'AMD A320, AM4 Socket','1x PCIe 3.0/2.0 x16, 4x USB 3.0, 2x USB 2.0, 2x PS/2, RJ-45, mATX, 244 x 244 mm',5,500.00 );
insert into product (id,name,description,stock,price) values ( 9,'Samsung Evo','500GB 510M/s read, 490M/s write',15,150.00 );
insert into product (id,name,description,stock,price) values ( 10,'Kingston Technology','SSDNow UV400 120GB, 550/350 MB/s',50,100.00 );
insert into product (id,name,description,stock,price) values ( 11,'EVGA B Series 550W','80 PLUS certification - Bronze',25,125.00 );
insert into product (id,name,description,stock,price) values ( 12,'Cooler Master MasterBox Lite 3.1','Height: 381 MM Width: 208 MM',35,130.00 );
insert into product (id,name,description,stock,price) values ( 13,'Thermaltake View 27','Micro ATX, ATX, 2 x 3.5’’, 4 x 2.5"',13,115.00 );
insert into product (id,name,description,stock,price) values ( 14,'Acer K242HL 24" HDMI Full HD Monitor ','1080P HDMI Port',55,78.00 );
insert into product (id,name,description,stock,price) values ( 15,'Iiyama Brook 27"','HDMI , VGA ports',34,110.00 );

 

insert into category_product (category_id,product_id) values (1,5);
insert into category_product (category_id,product_id) values (1,6);
insert into category_product (category_id,product_id) values (3,3);
insert into category_product (category_id,product_id) values (3,4);
insert into category_product (category_id,product_id) values (8,14);
insert into category_product (category_id,product_id) values (8,15);
insert into category_product (category_id,product_id) values (6,11);
insert into category_product (category_id,product_id) values (7,12);  
insert into category_product (category_id,product_id) values (7,13);  
insert into category_product (category_id,product_id) values (4,7);  
insert into category_product (category_id,product_id) values (4,8);  
insert into category_product (category_id,product_id) values (5,9);  
insert into category_product (category_id,product_id) values (5,10);  
insert into category_product (category_id,product_id) values (2,1);  
insert into category_product (category_id,product_id) values (2,12);  


