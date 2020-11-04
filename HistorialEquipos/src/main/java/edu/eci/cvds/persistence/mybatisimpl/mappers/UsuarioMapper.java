package edu.eci.cvds.persistence.mybatisimpl.mappers;

import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UsuarioMapper {

    Usuario consultarUsuario(@Param("correo")String correo);

    List<Usuario> consultarUsuarios();

    Usuario login(@Param("correo")String var1, @Param("contrasena") String var2);

    void insertarUsuario(@Param("usuario") Usuario var1);

}