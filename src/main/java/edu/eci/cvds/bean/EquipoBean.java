package edu.eci.cvds.bean;
import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Equipo;
import edu.eci.cvds.sample.factory.ServiceFactory;
import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.services.ServiceElemento;
import edu.eci.cvds.sample.services.ServiceEquipo;
import edu.eci.cvds.sample.services.ServiceHistorialEquipos;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean(name = "equipoBean")
@RequestScoped
public class EquipoBean extends BasePageBean{

    @Inject
    private ServiceEquipo serviceEquipo;

    @Inject
    private ServiceElemento serviceElemento;

    //ATRIBUTOS
    public List<Equipo> equipos;
    public Equipo equipo;
    public String nombreEquipo;

    //OPERATIONS
    public List<Equipo> consultarEquipos() throws ExcepcionServiceHistorialEquipos{
        equipos = serviceEquipo.consultarEquipos();
        return equipos;
    }

    public void registrarEquipo(String mouse, String teclado, String pantalla, String torre) throws ExcepcionServiceHistorialEquipos{
        if(mouse=="" || teclado=="" || pantalla=="" || torre=="" || nombreEquipo==""){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, null, "Todos los campos se deben diligenciar."));
        }else{
            serviceEquipo.agregarEquipo(nombreEquipo);
            asociarElementosEquipo(mouse, teclado, pantalla, torre);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Equipo registrado satisfactoriamente."));
        }
    }

    public void asociarElementosEquipo(String mouse, String teclado, String pantalla, String torre) throws ExcepcionServiceHistorialEquipos {
        int idEquipo =  Integer.parseInt(serviceEquipo.consultarEquipo(nombreEquipo).getIdEquipo());
        String[] datosMouse = mouse.split("-", 0);
        serviceElemento.asociarElemento(idEquipo, datosMouse[0], datosMouse[1]);
        String[] datosTeclado = teclado.split("-", 0);
        serviceElemento.asociarElemento(idEquipo, datosTeclado[0], datosTeclado[1]);
        String[] datosPantalla = pantalla.split("-", 0);
        serviceElemento.asociarElemento(idEquipo, datosPantalla[0], datosPantalla[1]);
        String[] datosTorre = torre.split("-", 0);
        serviceElemento.asociarElemento(idEquipo, datosTorre[0], datosTorre[1]);
    }

    public String getNombreEquipo() { return this.nombreEquipo; }

    public void setNombreEquipo(String nombreEquipo){ this.nombreEquipo=nombreEquipo; }

    public void start(){}

    public void showMessage(String confirmacion) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje", confirmacion);
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
}