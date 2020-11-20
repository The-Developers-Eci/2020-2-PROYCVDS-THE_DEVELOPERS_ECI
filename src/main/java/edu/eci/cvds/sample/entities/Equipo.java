package edu.eci.cvds.sample.entities;
import java.io.Serializable;
public class Equipo implements Serializable{
    private int idEquipo;
    private String referencia;
    private String marca;
    private String serialEquipo;
    private Boolean disponible;
    private String laboratorioAsociado;
    private String idNovedad;

    public Equipo(int idEquipo, String referencia, String marca, String serialEquipo){
        this.idEquipo = idEquipo;
        this.referencia = referencia;
        this.marca = marca;
        this.serialEquipo = serialEquipo;
        this.disponible = disponible;
        this.laboratorioAsociado = laboratorioAsociado;
        this.idNovedad = idNovedad;
    }

    public Equipo() {
    }


    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerialEquipo() {
        return serialEquipo;
    }

    public void setSerialEquipo(String serialEquipo) {
        this.serialEquipo = serialEquipo;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getLaboratorioAsociado() {
        return laboratorioAsociado;
    }

    public void setLaboratorioAsociado(String laboratorioAsociado) {
        this.laboratorioAsociado = laboratorioAsociado;
    }

    public String getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(String idNovedad) {
        this.idNovedad = idNovedad;
    }
}
