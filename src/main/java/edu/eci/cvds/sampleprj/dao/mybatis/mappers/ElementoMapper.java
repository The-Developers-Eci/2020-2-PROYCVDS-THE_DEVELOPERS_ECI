package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.sample.entities.Elemento;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.guice.transactional.Transactional;

public interface ElementoMapper {

    public Elemento consultarElemento(@Param("numser")String numeroSerial );

    public List<Elemento> consultarElementos();

    @Transactional
    public void agregarElemento(@Param("numser")String numeroSerial,@Param("tip")String tipo,@Param("marc")String marca,
                                    @Param("ref")String referencia,@Param("disp")boolean disponible,@Param("equipaso")String equipoAsociado);
}