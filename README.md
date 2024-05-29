<h1>CREACION DE LA TABLA Y SUS DATOS EN LA BASE DE DATOS</h1>

CREATE TABLE DIETAS(
ID INT AUTO_INCREMENT PRIMARY KEY,
EMPLEADO VARCHAR(300),
DEPARTAMENTO VARCHAR(300),
CANTIDAD_EUROS INT,
CONCEPTO VARCHAR(300)
);  

INSERT INTO DIETAS VALUE 
(1,"Antonio","Informática", 40,""),
(2,"Manolo","Ventas", 25,""),
(3,"Juan Alberto","Informática", 34,""),
(4,"Dionisio","Recursos Humanos", 10,""),
(5,"Carmen","Ventas", 60,""),
(6,"Laura","Informática", 11,""),
(7,"Estefania","Recursos Humanos", 20,""),
(8,"Clara","Ventas", 50,""),
(9,"Gabriel","Recursos Humanos", 28,""),
(10,"Jose","Informática", 30,"");
