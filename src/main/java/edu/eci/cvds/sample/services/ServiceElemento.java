package edu.eci.cvds.sample.services;

import edu.eci.cvds.sample.entities.Elemento;

import java.util.List;

public interface ServiceElemento {
    Elemento consultarElemento(String numeroSerial) throws ExcepcionServiceHistorialEquipos;

    List<Elemento> consultarElementos() throws ExcepcionServiceHistorialEquipos;
}