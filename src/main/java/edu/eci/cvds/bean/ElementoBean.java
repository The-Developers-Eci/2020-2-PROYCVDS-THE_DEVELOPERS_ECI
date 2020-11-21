package edu.eci.cvds.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import edu.eci.cvds.sample.services.ServiceElemento;
import org.primefaces.PrimeFaces;

import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.entities.Elemento;
import edu.eci.cvds.sample.factory.ServiceFactory;

import java.util.List;

@ManagedBean(name = "Elemento")
@ApplicationScoped

public class ElementoBean {

    private final ServiceElemento serviceElemento;

    public List<Elemento> elementos;

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> usuarios) {
        this.elementos = usuarios;
    }

    public void agregarElemento(String numeroSerial, String tipo, String marca, String referencia, boolean disponible, String equipoAsociado) throws ExcepcionServiceHistorialEquipos {
        serviceElemento.agregarElemento(numeroSerial,tipo,marca,referencia,disponible,equipoAsociado);
    }

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