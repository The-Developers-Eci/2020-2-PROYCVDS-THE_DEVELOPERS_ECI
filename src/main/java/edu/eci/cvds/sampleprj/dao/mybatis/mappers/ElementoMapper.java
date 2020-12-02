package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.sample.entities.Elemento;
import java.util.List;

import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import org.apache.ibatis.annotations.Param;
import org.mybatis.guice.transactional.Transactional;

public interface ElementoMapper {

    public Elemento consultarElemento(@Param("numser")int numeroSerial );

    public List<Elemento> consultarElementos();

    public List<Elemento> consultarElementosEquipo(@Param("equipo")int equipo);

    public List<Elemento> consultarElementosTipo(@Param("tipo")String tipo);
    void asociarElemento(@Param("eqid") int equipoId, @Param("marc") String marca, @Param("ref") String referencia) throws ExcepcionServiceHistorialEquipos;

    @Transactional
    public void agregarElemento(@Param("tip")String tipo, @Param("marc")String marca, @Param("ref")String referencia);

    void asociarElementoEquipo(@Param("equipo") int equipo, @Param("numeroserial") int numeroserial, @Param("disponible") boolean disponible);
}