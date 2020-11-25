package edu.eci.cvds.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;

import edu.eci.cvds.sample.entities.Equipo;
import edu.eci.cvds.sample.services.ServiceElemento;
import org.primefaces.PrimeFaces;

import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.entities.Elemento;
import edu.eci.cvds.sample.factory.ServiceFactory;

import java.util.stream.Collectors;
import java.util.List;

@ManagedBean(name = "Elemento")
@ViewScoped
//@ApplicationScoped

public class ElementoBean {

    private final ServiceElemento serviceElemento;

    public List<Elemento> elementos;//Todos los Elementos
    public List<Elemento> elementosEquipo;//Elementos que Pertenecen a un Equipo
    public List<Elemento> torres;
    public List<Elemento> mouses;
    public List<Elemento> teclados;
    public List<Elemento> pantallas;
    public Elemento elemento;//Elemento en Específico

    //GET y SET
    public List<Elemento> getElementos() {
        return elementos;
    }

    public List<Elemento> getElementos2() {return elementosEquipo;}

    public Elemento getElemento() {return elemento;}

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    //OPERATIONS
    public Elemento consultarElemento(int numeroSerial) throws ExcepcionServiceHistorialEquipos {
        elemento = serviceElemento.consultarElemento(numeroSerial);
        return elemento;
    }

    public List<Elemento> consultarElementos() throws ExcepcionServiceHistorialEquipos {
        elementos = serviceElemento.consultarElementos();
        return elementos;
    }

    public List<Elemento> consultarElementosEquipo(int equipo) throws ExcepcionServiceHistorialEquipos {
        elementosEquipo = serviceElemento.consultarElementosEquipo(equipo);
        return elementosEquipo;
    }

    public List<Elemento> consultarTorres() throws ExcepcionServiceHistorialEquipos {
        torres = serviceElemento.consultarElementosTipo("torre");
        return torres;
    }

    public List<Elemento> consultarMouses() throws ExcepcionServiceHistorialEquipos {
        mouses = serviceElemento.consultarElementosTipo("mouse");
        return mouses;
    }

    public List<Elemento> consultarTeclados() throws ExcepcionServiceHistorialEquipos {
        teclados = serviceElemento.consultarElementosTipo("teclado");
        return teclados;
    }

    public List<Elemento> consultarPantallas() throws ExcepcionServiceHistorialEquipos {
        pantallas = serviceElemento.consultarElementosTipo("pantalla");
        return pantallas;
    }

    public void agregarElemento(String tipo, String marca, String referencia) throws ExcepcionServiceHistorialEquipos {
        serviceElemento.agregarElemento(tipo,marca,referencia);
    }

    //DEFAULT
    public ElementoBean(){
        serviceElemento = ServiceFactory.getInstance().getServiceElemento();
        try{
            elementos = serviceElemento.consultarElementos();
        }catch(ExcepcionServiceHistorialEquipos e){
        }
    }

    public void start(){ }

    public void showMessage(String confirmacion) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje", confirmacion);
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }
}