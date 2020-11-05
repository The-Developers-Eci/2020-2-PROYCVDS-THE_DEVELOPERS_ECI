package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.persistence.PersistenciaException;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.entities.Usuario;
import org.apache.ibatis.exceptions.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.UsuarioMapper;
import java.util.List;


public class MyBatisUsuarioDAO implements UsuarioDAO {
    @Inject
    private UsuarioMapper usuarioMapper;

    public Usuario consultarUsuario(String correo) throws PersistenciaException{
        try {
            Usuario usuario = usuarioMapper.consultarUsuario(correo);
            return usuario;
        } catch (PersistenceException e){
            throw new PersistenciaException("No se pudo consultar el usuario");
        }
    }

    public List<Usuario> consultarUsuarios() throws PersistenciaException{
        try {
            return usuarioMapper.consultarUsuarios();
        }catch (PersistenceException e){
            throw new PersistenciaException("No se pudo consultar los usuarios");
        }
    }

    public boolean login(String correo, String contrasena) throws PersistenciaException{
        try{
            Usuario usuario = usuarioMapper.login(correo, contrasena);
            return true;
        }catch (PersistenceException e){
            throw new PersistenciaException("Usuario invaalido");
        }
    }
}