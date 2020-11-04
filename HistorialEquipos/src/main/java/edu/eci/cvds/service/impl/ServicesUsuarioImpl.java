package edu.eci.cvds.service.impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.persistence.PersistenciaException;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.service.ServicesUsuario;
import java.util.List;

public class ServicesUsuarioImpl implements ServicesUsuario {

    @Inject
    private  UsuarioDAO usuarioDAO;

    @Override
    public Usuario consultarUsuario(String correo) {
        try {
            return usuarioDAO.consultarUsuario(correo);
        } catch (PersistenciaException e) {
            return null;
        }
    }

    @Override
    public List<Usuario> consultarUsuarios() {
        try {
            return usuarioDAO.consultarUsuarios();
        } catch (PersistenciaException e) {
            return null;
        }
    }

    @Override
    public boolean login(String correo, String contrasena) {
        try {
            return usuarioDAO.login(correo,contrasena);
        } catch (PersistenciaException e) {
            return false;
    }

    }
}
