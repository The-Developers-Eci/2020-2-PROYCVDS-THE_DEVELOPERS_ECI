package edu.eci.cvds.sample.entities;

import java.io.Serializable;
import java.sql.Date;

public class Novedad implements Serializable{

    private int idNovedad;
    private String tipo;
    private Date fecha;
    private String detalle;
    private String autor;
    private int idElemento;
    private int idEquipo;

    public Novedad(int idNovedad, String tipo, Date fecha, String detalle, String autor, int idElemento, int idEquipo){
        this.idNovedad = idNovedad;
        this.tipo = tipo;
        this.fecha = fecha;
        this.detalle = detalle;
        this.autor = autor;
        this.idElemento = idElemento;
        this.idEquipo = idEquipo;
    }

    public Novedad() { }

    public int getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(int idNovedad) {
        this.idNovedad = idNovedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdElemento() { return idElemento; }

    public void setIdElemento(int idElemento) {
        this.idElemento = idElemento;
    }

    public int getIdEquipo() { return idEquipo; }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public String toString() {
        return "Novedad "+idNovedad+": "+fecha+"  "+detalle;
    }
}
