package edu.eci.cvds.sample.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Equipo;
import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.services.ServiceEquipo;
import edu.eci.cvds.sampleprj.dao.EquipoDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;

import java.util.List;

public class ServiceEquipolmpl implements ServiceEquipo {

    @Inject
    private EquipoDAO equipoDAO;

    @Override
    public Equipo consultarEquipo(String nombre) throws ExcepcionServiceHistorialEquipos {
        try {
            return equipoDAO.consultarEquipo(nombre);
        } catch (PersistenceException ex) {
            throw new UnsupportedOperationException("No se pudo consultar el equipo ", ex);
        }
    }

    @Override
    public List<Equipo> consultarEquipos() throws ExcepcionServiceHistorialEquipos {
        try {
            return equipoDAO.consultarEquipos();
        } catch (PersistenceException ex) {
            throw new UnsupportedOperationException("No se pudo consultar los equipos ", ex);
        }
    }

    @Override
    public void agregarEquipo(String nombre) throws ExcepcionServiceHistorialEquipos {
        try {
            equipoDAO.agregarEquipo(nombre);
        } catch (PersistenceException ex) {
            throw new UnsupportedOperationException("No se pudo agregar el equipo ", ex);
        }
    }
}