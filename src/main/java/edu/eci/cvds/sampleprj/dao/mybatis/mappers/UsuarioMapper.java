package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.sample.entities.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {

    public User consultarUsuario(@Param("corr")String correo );

    public List<User> consultarUsuarios();
    
}