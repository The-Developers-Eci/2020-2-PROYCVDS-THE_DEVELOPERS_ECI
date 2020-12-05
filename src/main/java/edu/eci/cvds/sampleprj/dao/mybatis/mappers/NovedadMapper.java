package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.sample.entities.Novedad;
import org.apache.ibatis.annotations.Param;
import org.mybatis.guice.transactional.Transactional;

import java.util.List;

public interface NovedadMapper {

        public List<Novedad> consultarNovedades();

        @Transactional
        public void agregarNovedadRegistroElemento(@Param("tip")String tipo, @Param("det")String detalle, @Param("aut")String autor,
                                   @Param("idel")int idElemento);

        void registrarNovedad(@Param("novedad")Novedad novedad);
}