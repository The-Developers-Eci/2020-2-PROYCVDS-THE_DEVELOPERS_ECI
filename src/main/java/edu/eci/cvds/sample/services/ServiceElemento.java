package edu.eci.cvds.sample.services;

import edu.eci.cvds.sample.entities.Elemento;

import java.util.List;
import org.mybatis.guice.transactional.Transactional;

public interface ServiceElemento {
    Elemento consultarElemento(String numeroSerial) throws ExcepcionServiceHistorialEquipos;

    List<Elemento> consultarElementos() throws ExcepcionServiceHistorialEquipos;

    @Transactional
    void agregarElemento(String tipo, String marca, String referencia) throws ExcepcionServiceHistorialEquipos;
}