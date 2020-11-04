package edu.eci.cvds.service;

import  com.google.inject.Guice;
import com.google.inject.Injector;
import edu.eci.cvds.persistence.*;
import edu.eci.cvds.persistence.mybatisimpl.*;
import edu.eci.cvds.service.impl.ServicesUsuarioImpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

public class ServicesHistorialEquiposProyectoFactory {

    private  static ServicesHistorialEquiposProyectoFactory instance = new ServicesHistorialEquiposProyectoFactory();
    private static Injector injector;
    private  static Injector testInjector;

    public ServicesHistorialEquiposProyectoFactory(){
        injector = Guice.createInjector(new XMLMyBatisModule() {
            protected void initialize() {
                this.install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                this.setClassPathResource("mybatis-config.xml");
                this.bind(ServicesUsuario.class).to(ServicesUsuarioImpl.class);
            }
        });
    }

    public  static ServicesHistorialEquiposProyectoFactory getInstance(){return instance;}
    public  ServicesUsuario getServicesUsuario(){return injector.getInstance(ServicesUsuario.class);}

}