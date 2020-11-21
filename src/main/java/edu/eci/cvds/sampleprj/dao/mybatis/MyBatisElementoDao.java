package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;

import edu.eci.cvds.sample.entities.Elemento;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.ElementoDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ElementoMapper;

import java.util.List;

public class MyBatisElementoDao implements ElementoDAO{

    @Inject
    private ElementoMapper elementoMapper;

    @Override
    public Elemento consultarElemento(String numeroSerial) throws PersistenceException {
        try
        {
            return elementoMapper.consultarElemento(numeroSerial);
        }catch(Exception e){
            throw new UnsupportedOperationException("Error al consultar el elemento:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public List<Elemento> consultarElementos() throws PersistenceException {
        try
        {
            return elementoMapper.consultarElementos();
        }catch(Exception e){
            throw new UnsupportedOperationException("Error al consultar los elementos:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarElemento(String numeroSerial, String tipo, String marca, String referencia, boolean disponible, String equipoAsociado) throws PersistenceException {
        try
        {
            elementoMapper.agregarElemento(numeroSerial,tipo,marca,referencia,disponible,equipoAsociado);
        }catch(Exception e){
            throw new UnsupportedOperationException("Error al insertar el elemento: "+e.getLocalizedMessage(), e);
        }
    }
}