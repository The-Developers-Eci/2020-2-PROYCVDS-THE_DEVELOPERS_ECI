package edu.eci.cvds.entities;

public class Usuario {
    private String nombre;
    private String contrasena;
    private String estado;
    private String correo;
    private String rol;

    public  Usuario (String nombre, String contrasena, String estado, String correo, String rol){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.estado = estado;
        this.correo = correo;
        this.rol = rol;
    }

    public void setNombre(String nombre){this.nombre = nombre;}

    public  void setContrasena(String contrasena){this.contrasena=contrasena;}

    public void setEstado(String estado){this.estado=estado;}

    public void setCorreo(String correo){this.correo=correo;}

    public void setRol(String rol){this.rol=rol;}

    public String getNombre(){return this.nombre;}

    public String getContrasena(){return this.contrasena;}

    public String getEstado(){return this.estado;}

    public String getCorreo(){return this.correo;}

    public String getRol(){return this.rol;}

    @Override
    public String toString() {
        return "Usuario [ nombre=" + nombre + ", contrasena=" + contrasena + ", estado=" + estado  +", email=" + correo
                    + ", rol=" + rol + " ]";
    }
}
