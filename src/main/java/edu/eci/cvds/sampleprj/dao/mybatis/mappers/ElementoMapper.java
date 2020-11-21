package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.sample.entities.Elemento;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementoMapper {

    public Elemento consultarElemento(@Param("numser")String numeroSerial );

    public List<Elemento> consultarElementos();

}