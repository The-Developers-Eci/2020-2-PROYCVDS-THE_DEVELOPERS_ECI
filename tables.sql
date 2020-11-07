CREATE TABLE IF NOT EXISTS usuarios(
    nombre varchar(50),
    contrasena varchar(10),
    estado varchar(15),
    correo varchar(30) not null constraint PK_usuarios primary key,
    rol varchar(15)
);


CREATE TABLE IF NOT EXISTS Elementos(
	id serial primary key,
	tipo varchar(50) not null,
	marca varchar(50) not null,
	referencia varchar(50) not null,
	equipo int null,
	FechaDeRegistro date not null,
	activo boolean not null	
);

CREATE TABLE IF NOT EXISTS Laboratorios(
	id serial primary key,
	marca varchar(50) not null,
	nombre varchar(50) unique not null,
	fechaDeCreacion date not null,
	fechaDeFinalizacion date not null,
	activo boolean not null
);

CREATE TABLE IF NOT EXISTS Roles(
	id serial primary key,
	nombre varchar(50) unique not null,
	descripcion varchar(400) not null
);

CREATE TABLE IF NOT EXISTS Actualizacion(
	id serial primary key,
	encargado int not null,
	elemento int not null,
	titulo varchar(50) not null,
	actualizacion varchar (400) not null,
	equipo int null,
	fecha date not null
);


CREATE TABLE IF NOT EXISTS Actualizacion(
	id serial primary key,
	encargado int not null,
	elemento int not null,
	titulo varchar(50) not null,
	actualizacion varchar (400) not null,
	equipo int null,
	fecha date not null
);
