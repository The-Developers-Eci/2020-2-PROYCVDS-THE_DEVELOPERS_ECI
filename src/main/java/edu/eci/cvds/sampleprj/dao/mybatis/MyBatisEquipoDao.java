package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Equipo;
import edu.eci.cvds.sampleprj.dao.EquipoDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.EquipoMapper;

import java.util.List;

public class MyBatisEquipoDao implements EquipoDAO {

    @Inject
    private EquipoMapper equipoMapper;

    @Override
    public Equipo consultarEquipo(String nombre) throws PersistenceException {
        try {
            return equipoMapper.consultarEquipo(nombre);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al consultar el equipo:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public List<Equipo> consultarEquipos() throws PersistenceException {
        try {
            return equipoMapper.consultarEquipos();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al consultar los equipos:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarEquipo(String nombre) throws PersistenceException {
        try {
            equipoMapper.agregarEquipo(nombre);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al agregar el equipo:"+e.getLocalizedMessage(), e);
        }
    }
}