package edu.eci.cvds.sample.services;

import edu.eci.cvds.sample.entities.User;
import java.util.List;

public interface ServiceHistorialEquipos {

    public abstract User consultarUsuario(String correo) throws ExcepcionServiceHistorialEquipos;

    public abstract List<User> consultarUsuarios() throws ExcepcionServiceHistorialEquipos;

}