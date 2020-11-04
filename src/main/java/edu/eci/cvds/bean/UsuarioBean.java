package edu.eci.cvds.bean;

import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.service.ServicesUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.util.List;

import com.google.inject.Inject;

@SuppressWarnings("deprecation")
@ManagedBean(name = "usuarioBean")
@SessionScoped

public class UsuarioBean extends BasePageBean{

    @Inject
    private  ServicesUsuario servicesUsuario;

    public List<Usuario> getUsuarios(){
        return servicesUsuario.consultarUsuarios();
    }
}