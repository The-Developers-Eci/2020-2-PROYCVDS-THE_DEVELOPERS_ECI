package edu.eci.cvds.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Usuario;

public interface UsuarioDAO {
    /**
     * Consultar un usuario en específico
     */
    public Usuario consultarUsuario(String correo) throws PersistenciaException;

    /**
     * metodo que consulta todos los usuarios en la base de datos
     */
    public List<Usuario> consultarUsuarios() throws PersistenciaException;


    public boolean login(String correo, String contrasena) throws PersistenciaException;

}