package edu.eci.cvds.sample.services;

import edu.eci.cvds.sample.entities.Elemento;

import java.util.List;
import org.mybatis.guice.transactional.Transactional;

public interface ServiceElemento {
    Elemento consultarElemento(String numeroSerial) throws ExcepcionServiceHistorialEquipos;

    List<Elemento> consultarElementos() throws ExcepcionServiceHistorialEquipos;

    @Transactional
    void agregarElemento(String numeroSerial, String tipo, String marca, String referencia, boolean disponible, String equipoAsociado) throws ExcepcionServiceHistorialEquipos;
}