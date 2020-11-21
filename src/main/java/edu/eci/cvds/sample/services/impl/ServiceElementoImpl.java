package edu.eci.cvds.sample.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Elemento;
import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.services.ServiceElemento;
import edu.eci.cvds.sampleprj.dao.ElementoDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;

import java.util.List;

public class ServiceElementoImpl implements ServiceElemento {
    @Inject
    private ElementoDAO elementoDAO;

    @Override
    public Elemento consultarElemento(String numeroSerial) throws ExcepcionServiceHistorialEquipos {
        try {
            return elementoDAO.consultarElemento(numeroSerial);
        } catch (PersistenceException e) {
            throw new UnsupportedOperationException("No se pudo consultar el elemento " + numeroSerial, e);
        }
    }

    @Override
    public List<Elemento> consultarElementos() throws ExcepcionServiceHistorialEquipos {
        try {
            return elementoDAO.consultarElementos();
        } catch (PersistenceException e) {
            throw new UnsupportedOperationException("No se pudo consultar los elementos ", e);
        }
    }
}
