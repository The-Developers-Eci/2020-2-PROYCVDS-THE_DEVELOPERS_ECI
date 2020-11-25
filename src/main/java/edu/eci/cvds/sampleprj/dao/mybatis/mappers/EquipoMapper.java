package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.sample.entities.Equipo;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.guice.transactional.Transactional;

public interface EquipoMapper {

    public Equipo consultarEquipo(@Param("nom")String nombre);

    public List<Equipo> consultarEquipos();

    @Transactional
    public void agregarEquipo(@Param("nom")String nombre);
}