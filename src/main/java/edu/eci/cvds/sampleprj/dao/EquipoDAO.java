package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.sample.entities.Equipo;
import org.mybatis.guice.transactional.Transactional;

import java.util.List;

public interface EquipoDAO {

    public Equipo consultarEquipo(String nombre) throws PersistenceException;

    public List<Equipo> consultarEquipos() throws PersistenceException;

    @Transactional
    public void agregarEquipo(String nombre) throws PersistenceException;
}
