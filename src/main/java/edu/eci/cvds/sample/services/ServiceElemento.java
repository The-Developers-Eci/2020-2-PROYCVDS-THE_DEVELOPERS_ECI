package edu.eci.cvds.sample.services;

import edu.eci.cvds.sample.entities.Elemento;

import java.util.List;

import edu.eci.cvds.sampleprj.dao.PersistenceException;
import org.mybatis.guice.transactional.Transactional;

public interface ServiceElemento {
    Elemento consultarElemento(int numeroSerial) throws ExcepcionServiceHistorialEquipos;

    List<Elemento> consultarElementos() throws ExcepcionServiceHistorialEquipos;

    List<Elemento> consultarElementosEquipo(int equipo) throws ExcepcionServiceHistorialEquipos;

    List<Elemento> consultarElementosTipo(String tipo) throws ExcepcionServiceHistorialEquipos;

    void asociarElemento(int equipoId, String marca, String referencia) throws ExcepcionServiceHistorialEquipos;

    @Transactional
    void agregarElemento(String tipo, String marca, String referencia) throws ExcepcionServiceHistorialEquipos;

    void asociarElementoEquipo(int equipo, int numeroserial, boolean disponible) throws ExcepcionServiceHistorialEquipos;
}