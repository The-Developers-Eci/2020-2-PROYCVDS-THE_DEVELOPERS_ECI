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
    public Elemento consultarElemento(int numeroSerial) throws ExcepcionServiceHistorialEquipos {
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

    @Override
    public List<Elemento> consultarElementosEquipo(int equipo) throws ExcepcionServiceHistorialEquipos {
        try {
            return elementoDAO.consultarElementosEquipo(equipo);
        } catch (PersistenceException e) {
            throw new UnsupportedOperationException("No se pudo consultar los elementos ", e);
        }
    }

    @Override
    public List<Elemento> consultarElementosTipo(String tipo) throws ExcepcionServiceHistorialEquipos {
        try {
            return elementoDAO.consultarElementosTipo(tipo);
        } catch (PersistenceException e) {
            throw new UnsupportedOperationException("No se pudo consultar los elementos ", e);
        }
    }

    @Override
    public void asociarElemento(int equipoId, String marca, String referencia) throws ExcepcionServiceHistorialEquipos {
        try {
            elementoDAO.asociarElemento(equipoId,marca,referencia);
        } catch (PersistenceException e) {
            throw new UnsupportedOperationException("No se insertar el elemento ", e);
        }
    }

    @Override
    public void agregarElemento(String tipo, String marca, String referencia) throws ExcepcionServiceHistorialEquipos {
        try {
            elementoDAO.agregarElemento(tipo,marca,referencia);
        } catch (PersistenceException e) {
            throw new UnsupportedOperationException("No se insertar el elemento ", e);
        }
    }

    @Override
    public void asociarElementoEquipo(int equipo, int numeroserial, boolean disponible) throws ExcepcionServiceHistorialEquipos {
        try{
            elementoDAO.asociarElementoEquipo(equipo, numeroserial, disponible);
        }catch(Exception e){
            throw new UnsupportedOperationException("Error al asociar el elemento:"+e.getLocalizedMessage(), e);
        }
    }
}
