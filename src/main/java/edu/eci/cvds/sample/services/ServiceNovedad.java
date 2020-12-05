package edu.eci.cvds.sample.services;

import edu.eci.cvds.sample.entities.Novedad;
import org.mybatis.guice.transactional.Transactional;

import java.util.List;

public interface ServiceNovedad {

    List<Novedad> consultarNovedades() throws ExcepcionServiceHistorialEquipos;

    @Transactional
    void agregarNovedadRegistroElemento(String tipo, String detalle, String autor, int idElemento) throws ExcepcionServiceHistorialEquipos;
    @Transactional
    void registrarNovedad(Novedad novedad);
}