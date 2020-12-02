package edu.eci.cvds.sample.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Novedad;
import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.services.ServiceNovedad;
import edu.eci.cvds.sampleprj.dao.NovedadDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;

import java.util.List;

public class ServiceNovedadImpl implements ServiceNovedad {

    @Inject
    private NovedadDAO novedadDAO;

    @Override
    public List<Novedad> consultarNovedades() throws ExcepcionServiceHistorialEquipos {
        try {
            return novedadDAO.consultarNovedades();
        } catch (PersistenceException ex) {
            throw new UnsupportedOperationException("No se pudo consultar las novedades: ", ex);
        }
    }

    @Override
    public void agregarNovedadRegistroElemento(String tipo, String detalle, String autor, int idElemento) throws ExcepcionServiceHistorialEquipos {
        try {
            novedadDAO.agregarNovedadRegistroElemento(tipo,detalle,autor,idElemento);
        } catch (PersistenceException ex) {
            throw new UnsupportedOperationException("No se pudo agregar la novedad: ", ex);
        }
    }
}