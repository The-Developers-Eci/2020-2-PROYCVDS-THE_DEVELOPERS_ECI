package edu.eci.cvds.sample.services;

import edu.eci.cvds.sample.entities.Equipo;
import org.mybatis.guice.transactional.Transactional;

import java.util.List;

public interface ServiceEquipo {

    Equipo consultarEquipo(String nombre) throws ExcepcionServiceHistorialEquipos;

    List<Equipo> consultarEquipos() throws ExcepcionServiceHistorialEquipos;

    @Transactional
    void agregarEquipo(String nombre) throws ExcepcionServiceHistorialEquipos;

}