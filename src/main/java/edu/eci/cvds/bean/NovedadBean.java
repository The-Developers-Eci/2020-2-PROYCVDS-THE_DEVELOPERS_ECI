package edu.eci.cvds.bean;

import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Elemento;
import edu.eci.cvds.sample.entities.Equipo;
import edu.eci.cvds.sample.entities.Novedad;
import edu.eci.cvds.sample.factory.ServiceFactory;
import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.services.ServiceNovedad;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean(name = "Novedad")
@RequestScoped

public class NovedadBean{

    @Inject
    private ServiceNovedad serviceNovedad;

    public List<Novedad> novedades;

    //OPERATIONS
    public List<Novedad> consultarNovedades() throws ExcepcionServiceHistorialEquipos {
        novedades = serviceNovedad.consultarNovedades();
        return novedades;
    }

    //GET & SET
    public List<Novedad> getNovedades() {
        return novedades;
    }

    public void setNovedades(List<Novedad> novedades) {
        this.novedades = novedades;
    }

    public void agregarNovedadRegistroElemento() throws ExcepcionServiceHistorialEquipos {
        serviceNovedad.agregarNovedadRegistroElemento("Registro","Hola",
                "admin@eci.com",94);
    }

    //DEFAULT
    public NovedadBean(){
        serviceNovedad = ServiceFactory.getInstance().getServiceNovedad();
        try{
            novedades = serviceNovedad.consultarNovedades();
        }catch(ExcepcionServiceHistorialEquipos e){
        }
    }

    public void start(){ }

    public void showMessage(String confirmacion) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje", confirmacion);
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }
}