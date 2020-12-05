package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.sample.entities.Novedad;
import org.mybatis.guice.transactional.Transactional;

import java.util.List;

public interface NovedadDAO {

        public List<Novedad> consultarNovedades() throws PersistenceException;

        @Transactional
        public void agregarNovedadRegistroElemento(String tipo, String detalle, String autor, int idElemento) throws PersistenceException;

        @Transactional
        void registrarNovedad(Novedad novedad);
}