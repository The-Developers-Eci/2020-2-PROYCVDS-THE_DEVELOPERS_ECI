package edu.eci.cvds.sample.factory;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.cvds.sample.services.ServiceEquipo;
import edu.eci.cvds.sample.services.ServiceHistorialEquipos;
import edu.eci.cvds.sample.services.impl.ServiceEquipolmpl;
import edu.eci.cvds.sample.services.impl.ServiceHistorialEquiposImpl;

import edu.eci.cvds.sampleprj.dao.UsersDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.MyBatisUsuarioDao;

import edu.eci.cvds.sampleprj.dao.EquipoDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.MyBatisEquipoDao;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

public class ServiceFactory {

    private static ServiceFactory instance = new ServiceFactory();
    private static Injector injector;
    
    public ServiceFactory(){
        injector = createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize(){
                //install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");
                bind(ServiceHistorialEquipos.class).to(ServiceHistorialEquiposImpl.class);
                bind(ServiceEquipo.class).to(ServiceEquipolmpl.class);
                bind(UsersDAO.class).to(MyBatisUsuarioDao.class);
                bind(EquipoDAO.class).to(MyBatisEquipoDao.class);

            }
        });
    }

    public ServiceHistorialEquipos getServiceHistorialEquipos(){
        return injector.getInstance(ServiceHistorialEquipos.class);
    }

    public  ServiceEquipo getServiceEquipo(){
        return  injector.getInstance(ServiceEquipo.class);
    }

    public static ServiceFactory getInstance(){
        return instance;
    }
}