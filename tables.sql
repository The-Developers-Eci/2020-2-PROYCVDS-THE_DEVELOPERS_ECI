CREATE TABLE IF NOT EXISTS usuarios(
    nombre varchar(50),
    contrasena varchar(10),
    estado varchar(15),
    correo varchar(30) not null constraint PK_usuarios primary key,
    rol varchar(15)
);