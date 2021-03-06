/*create table CLIENTE(
	id INT NOT NULL auto_increment,
    nombre VARCHAR(20) default NULL,
    apellido VARCHAR(20) default NULL,
    dni VARCHAR(20) DEFAULT NULL UNIQUE,
    
    correo VARCHAR(50) default NULL UNIQUE,
    contraseña VARCHAR(20) default NULL, 
    
	PRIMARY KEY (id)
);*/
CREATE DATABASE gimnasio; 

create table ROL(
	id INT NOT NULL auto_increment,
	nombre VARCHAR(20),
	clave VARCHAR(20) default NULL,
	PRIMARY KEY (id)
);


INSERT INTO ROL (id, nombre, clave)
VALUES (1, 'administrador', '0402'), (2, 'entrenador', '1234'), (3, 'cliente', null), (4, 'mantenimiento', null);




create table USUARIO(
	id INT NOT NULL auto_increment,
	DNI VARCHAR(10) NOT NULL UNIQUE,
    nombre VARCHAR(15),
    apellido VARCHAR(20),  
    correo VARCHAR(40) default NULL UNIQUE,
    contraseña VARCHAR(20) default NULL,
    fecha DATE default NULL,
    salario FLOAT default NULL,
    rutaImg VARCHAR(120) default '',
    peso INT default 0,
    altura FLOAT default 0,
    notas VARCHAR(200),
    id_rol INT default 3,
    
	PRIMARY KEY (id),
	CONSTRAINT FK_UsuarioRol FOREIGN KEY (id_rol) REFERENCES ROL(id)
);


INSERT INTO USUARIO (DNI, nombre, apellido, correo, contraseña, fecha, salario, rutaImg, id_rol) VALUES
('45380203F', 'Alberto', 'Barba', 'juanalbertobarba1997@gmail.com', null, '1997-12-23', 1500,'', 1 ),
('46785479D', 'Miguel Angel', 'Bolivar', 'mabolivar@gmail.es', null, '1980-03-22', 1200,'', 2),
('38789868G', 'Marisa', 'Garrido', 'marisa@hotmail.com', null, '1988-04-11', 1100,'', 4),
('49650746S', 'Antonio', 'Serrano', 'admin1@yahoo.com', null, '1976-12-13', 1500,'', 1 ),
('39576918A', 'Primer Cliente', 'xd', 'cliente1@gmail.com', contraseña, '1976-12-13', null,'', 3 ),
('49896715B', 'Segundo cliente', 'xd', 'cliente2@gmail.com', null, '1976-12-13', null,'', 3 );



create table CLASE(
	id INT NOT NULL auto_increment,
    nombre VARCHAR(15) NOT NULL UNIQUE,
    aforo_maximo INT NOT NULL,  
    rutaImg VARCHAR(80) default '',
    descripcion VARCHAR(300) default '',
    
	PRIMARY KEY (id)
	
);

create table HORARIO(
	id INT NOT NULL auto_increment UNIQUE,
	id_clase INT NOT NULL,
	id_entrenador INT NOT NULL,
	hora TIME NOT NULL,
	dia INT NOT NULL,

	PRIMARY KEY (hora,dia,id_entrenador),
	CONSTRAINT FK_clase_horario FOREIGN KEY (id_clase) REFERENCES CLASE(id),
	CONSTRAINT FK_entrenador_horario FOREIGN KEY (id_entrenador) REFERENCES USUARIO(id)

);

//El UNIQUE lo interpreta como prymary key tmbn, sin UNIQUE no furunda

create table EJERCICIO(
	id INT NOT NULL auto_increment UNIQUE,
	nombre VARCHAR(40) UNIQUE,
	descripcion VARCHAR(200),
	tipo VARCHAR(20),
	rutaImg VARCHAR(80),
	rutaVideo VARCHAR(80),

	PRIMARY KEY (id)

);

create table MUSCULO(
	id INT NOT NULL auto_increment UNIQUE,
	nombre VARCHAR(40) UNIQUE,

	PRIMARY KEY (id)
)

create table EJERCICIO_MUSCULO_MTM(
	id_ejercicio INT not null,
	id_musculo INT not null,

	PRIMARY KEY(id_ejercicio,id_musculo),
	FOREIGN KEY (id_ejercicio) REFERENCES EJERCICIO(id) ON DELETE CASCADE, 
    FOREIGN KEY (id_musculo) REFERENCES MUSCULO(id) ON DELETE CASCADE	

);



// Consulta para filtrar por 3 campos: SELECT e.id, e.nombre, e.descripcion, e.tipo, e.rutaImg, e.rutaVideo from ejercicio e INNER JOIN ejercicio_musculo_mtm em ON e.id=em.id_ejercicio INNER JOIN musculo m ON m.id=em.id_musculo WHERE m.nombre LIKE '%espalda%'AND e.tipo LIKE '%%' AND e.nombre LIKE '%dominada%' GROUP BY e.nombre;


create table EJ_TABLA_MTM(
	id_ejercicio INT not null,
	id_tabla INT not null,
	dia INT not null,
	series INT DEFAULT 0,
	repeticiones INT DEFAULT 0,
	tiempo VARCHAR(10) DEFAULT "",

	PRIMARY KEY(id_ejercicio,id_tabla,dia),
	FOREIGN KEY (id_ejercicio) REFERENCES EJERCICIO(id) ON DELETE CASCADE, 
    FOREIGN KEY (id_tabla) REFERENCES TABLA(id) ON DELETE CASCADE	

);

create table TABLA(
	id INT not null auto_increment UNIQUE,
	nombre VARCHAR(25) DEFAULT "",
	dias INT not null,
	tabla_base boolean DEFAULT false,
	PRIMARY KEY(id)

);

create table TABLA_USUARIO_MTM(
	id_tabla INT not null,
	id_usuario INT not null,

	PRIMARY KEY(id_tabla,id_usuario),
	FOREIGN KEY (id_tabla) REFERENCES TABLA(id) ON DELETE CASCADE, 
    FOREIGN KEY (id_usuario) REFERENCES USUARIO(id) ON DELETE CASCADE	

);


create table RESERVA_USU_HORARIO(
    id INT NOT NULL auto_increment UNIQUE,
    id_usuario INT not null,
    id_horario INT not null,
    fecha DATE default CURRENT_DATE,

    PRIMARY KEY(id_usuario,id_horario),
    FOREIGN KEY (id_horario) REFERENCES HORARIO(id) ON DELETE CASCADE, 
    FOREIGN KEY (id_usuario) REFERENCES USUARIO(id) ON DELETE CASCADE	

);





//Registar ejercicios con musculos mtm 
INSERT INTO ejercicio (nombre,descripcion,tipo, rutaImg, rutaVideo) VALUES ('Press de Banca', 'Levantar una barra con peso tumbado horizontalmente en un banco', 'musculacion', '','');
Select id From ejercicio where nombre='press de banca';
//(Con todos los musculos:
SELECT id FROM musculo WHERE nombre='pecho';
insert into ejercicio_musculo_mtm (id_ejercicio,id_musculo) VALUES (8,4)


//Mismo pero con tablas y ejercicios

INSERT INTO tabla(nombre, dias, tabla_Base) VALUES ('Full body', 3, true);
Select id From tabla where nombre='full body';
insert into ej_tabla_mtm (id_ejercicio,id_tabla, dia,series, repeticiones,tiempo) VALUES (1,0,1,3,8,'8 minutos')








/////////// LA MIERDA INICIAL
create table CLASE(
	id INT NOT NULL auto_increment,
    nombre VARCHAR(15),
    aforo_maximo INT,  
    ruta_foto VARCHAR(80) default NULL,
    id_profesor VARCHAR(10), 
    
	PRIMARY KEY (id),
	CONSTRAINT FK_ClaseProfesor FOREIGN KEY (id_profesor) REFERENCES USUARIO(DNI)
);

create table reserva_sala_musculacion(
	id INT NOT NULL auto_increment,
	hora TIME,
	dia INT,
	id_cliente VARCHAR(10),

	PRIMARY KEY (id),
	CONSTRAINT FK_ClienteReservaSala FOREIGN KEY (id_cliente) REFERENCES USUARIO(DNI)

);


create table cliente_clase_MTM(
	id_cliente VARCHAR(10),
	id_clase INT,
	hora TIME,
	dia INT,

	PRIMARY KEY(id_cliente,id_clase),
	 FOREIGN KEY (id_cliente) REFERENCES USUARIO(DNI), 
    FOREIGN KEY (id_clase) REFERENCES CLASE(id)	

);

create table TABLA(
	id INT NOT NULL auto_increment,
	nombre VARCHAR(20),
	n_dias INT default 3,
	
	PRIMARY KEY (id)

);

create table EJERCICIO(
	id INT NOT NULL auto_increment,
	nombre VARCHAR(20),
	descripcion VARCHAR(20),
	ruta_foto VARCHAR(80),

	PRIMARY KEY (id)

);

create table HORARIO(
	id INT NOT NULL auto_increment,
	dia INT,
	hora TIME,

	PRIMARY KEY (id)

);

create table cliente_tabla_MTM(
	id_cliente VARCHAR(10),
	id_tabla INT,
	fecha DATE DEFAULT GETDATE(),

	PRIMARY KEY(id_cliente,id_tabla),
	 FOREIGN KEY (id_cliente) REFERENCES USUARIO(DNI), 
    FOREIGN KEY (id_tabla) REFERENCES TABLA(id)	

);


create table tabla_ejercicio_MTM(
	id_ejercicio INT,
	id_tabla INT,
	dia int,
	repeticiones int default null,
	tiempo time default null,

	PRIMARY KEY(id_ejercicio,id_tabla),
	FOREIGN KEY (id_ejercicio) REFERENCES EJERCICIO(id), 
    FOREIGN KEY (id_tabla) REFERENCES TABLA(id)	

);


create table horario_clase_MTM(
	id_clase INT,
	id_horario INT,

	PRIMARY KEY(id_clase,id_horario),
	FOREIGN KEY (id_clase) REFERENCES CLASE(id), 
    FOREIGN KEY (id_horario) REFERENCES HORARIO(id)	

);



-- PROCEDURES

DELIMITER //
DROP PROCEDURE IF EXISTS registrarContraseña//
CREATE PROCEDURE cambiarLocalidad(IN CORREO VARCHAR(40),
                                  in NUEVA_CONTRASEÑA VARCHAR(20), 
                                  INOUT CAMBIADO BOOLEAN)

BEGIN
    SELECT LOC INTO OLD_NOM_DEPART FROM DEPARTAMENTOS WHERE DEPT_NO=NUM_DEP;
    UPDATE DEPARTAMENTOS SET LOC=NEW_NOM_DEPART where dept_no=num_dep;
END//;
DELIMITER ;













