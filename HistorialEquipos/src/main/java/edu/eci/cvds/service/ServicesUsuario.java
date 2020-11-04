package edu.eci.cvds.service;

import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServicesUsuario {

    Usuario consultarUsuario(String correo);
    List<Usuario> consultarUsuarios();
    boolean login(String correo, String contrasena);

}
