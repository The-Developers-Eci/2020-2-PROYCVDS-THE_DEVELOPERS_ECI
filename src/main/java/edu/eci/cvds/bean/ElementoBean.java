package edu.eci.cvds.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.google.inject.Inject;
import edu.eci.cvds.sample.entities.Equipo;
import edu.eci.cvds.sample.services.ServiceElemento;
import edu.eci.cvds.sample.services.ServiceEquipo;
import edu.eci.cvds.sample.services.ServiceNovedad;
import org.primefaces.PrimeFaces;

import edu.eci.cvds.sample.services.ExcepcionServiceHistorialEquipos;
import edu.eci.cvds.sample.entities.Elemento;
import edu.eci.cvds.sample.factory.ServiceFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

@ManagedBean(name = "Elemento")
@RequestScoped
//@ApplicationScoped

public class ElementoBean {

    @Inject
    private ServiceElemento serviceElemento;

    @Inject
    private ServiceNovedad serviceNovedad;

    public List<Elemento> elementos;//Todos los Elementos
    public List<Elemento> elementosEquipo;//Elementos que Pertenecen a un Equipo
    public List<Elemento> torres;
    public List<Elemento> mouses;
    public List<Elemento> teclados;
    public List<Elemento> pantallas;
    public Elemento elemento;//Elemento en Específico

    private Map<String, String> elementosMap;
    private String selectedElemento;

    //GET y SET
    public List<Elemento> getElementos() {
        return elementos;
    }

    public List<Elemento> getElementos2() {return elementosEquipo;}

    public Elemento getElemento() {return elemento;}

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public List<String> getMarcas() {
        List<String> marcas = null;
        for (Elemento e:elementos){
            marcas.add(e.getMarca());
        }
        return marcas;
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
        if(tipo=="" || marca=="" || referencia==""){
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN, null, "Todos los campos se deben diligenciar."));
        }else{
            serviceElemento.agregarElemento(tipo,marca,referencia);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Elemento registrado satisfactoriamente."));
            serviceNovedad.agregarNovedadRegistroElemento("Registro",
                    "El elemento: "+marca+" "+referencia+", ha sido registrado.","admin",maxNumSerial());
        }
    }

    public int maxNumSerial() throws ExcepcionServiceHistorialEquipos {
        List<Elemento> refrescar= consultarElementos();
        List<String> numSeriales = null;
        int temp = 0;
        int max = 0;
        for (Elemento i:elementos){
            temp=Integer.parseInt(i.getNumeroSerial());
            if(max<temp) {
                max = temp;
            }
        }
        return max;
    }

    public void asociarElementoEquipo(String elemento, String equipo) throws ExcepcionServiceHistorialEquipos {
        System.out.println(elemento);
        System.out.println(equipo);
        int idElemento = Integer.parseInt(elemento);
        int idEquipo = Integer.parseInt(equipo);
        int idElementoEliminar = 0;
        Elemento elementoTemp = serviceElemento.consultarElemento(idElemento);
        ArrayList<Elemento> elementosTemp = (ArrayList<Elemento>) serviceElemento.consultarElementosEquipo(idEquipo);
        for(Elemento elemento1 : elementosTemp){
            if (elementoTemp.getTipo().equalsIgnoreCase(elemento1.getTipo())){
                idElementoEliminar = Integer.parseInt(elemento1.getNumeroSerial());
            }
        }
        serviceElemento.asociarElementoEquipo(idEquipo, idElemento, false);
        System.out.println(idElementoEliminar);
        serviceElemento.asociarElementoEquipo(0, idElementoEliminar, true);
    }

    //DEFAULT
    public ElementoBean(){
        serviceElemento = ServiceFactory.getInstance().getServiceElemento();
        serviceNovedad = ServiceFactory.getInstance().getServiceNovedad();
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

    public Map<String, String> getElementosMap() throws ExcepcionServiceHistorialEquipos {
        ArrayList<Elemento> elementosTmp = (ArrayList<Elemento>) consultarElementos();
        elementosMap = new LinkedHashMap<String, String>();
        for (Elemento elemento : elementosTmp){
            if (elemento.getDisponible()){
                elementosMap.put(elemento.getMarca() + "-" + elemento.getReferencia(), elemento.getNumeroSerial());
            }
        }
        return elementosMap;
    }

    public void setElementosMap(Map<String, String> elementosMap) {
        this.elementosMap = elementosMap;
    }

    public String getSelectedElemento() {
        return selectedElemento;
    }

    public void setSelectedElemento(String selectedElemento) {
        this.selectedElemento = selectedElemento;
    }
}