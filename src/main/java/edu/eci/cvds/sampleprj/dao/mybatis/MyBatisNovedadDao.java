package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Novedad;
import edu.eci.cvds.sampleprj.dao.NovedadDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.NovedadMapper;

import java.util.List;

public class MyBatisNovedadDao implements NovedadDAO {

    @Inject
    private NovedadMapper novedadMapper;

    @Override
    public List<Novedad> consultarNovedades() throws PersistenceException {
        try {
            return novedadMapper.consultarNovedades();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al consultar las novedades:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarNovedadRegistroElemento(String tipo, String detalle, String autor, int idElemento) throws PersistenceException {
        try {
            novedadMapper.agregarNovedadRegistroElemento(tipo,detalle,autor,idElemento);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Error al agregar la novedad:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void registrarNovedad(Novedad novedad) {
        try{
            novedadMapper.registrarNovedad(novedad);

        }catch (Exception e){
            throw new UnsupportedOperationException("Error al agregar la novedad:"+e.getLocalizedMessage(), e);


        }
    }


}