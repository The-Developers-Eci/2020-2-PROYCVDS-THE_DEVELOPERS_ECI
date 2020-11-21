package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.sample.entities.Elemento;
import java.util.List;

public interface ElementoDAO {

    public Elemento consultarElemento(String numeroSerial ) throws PersistenceException;

    public List<Elemento> consultarElementos() throws PersistenceException;

}