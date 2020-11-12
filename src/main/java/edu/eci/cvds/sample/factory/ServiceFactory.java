package edu.eci.cvds.sample.factory;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.cvds.sample.services.ServiceHistorialEquipos;
import edu.eci.cvds.sample.services.impl.ServiceHistorialEquiposImpl;

import edu.eci.cvds.sampleprj.dao.UsersDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.MyBatisUsuarioDao;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private static Injector injector;
    
    public ServiceFactory(){
        injector = createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize(){
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config.xml");
                bind(ServiceHistorialEquipos.class).to(ServiceHistorialEquiposImpl.class);
                bind(UsersDAO.class).to(MyBatisUsuarioDao.class);

            }
        }
        );
    }

    public ServiceHistorialEquipos getServiceHistorialEquipos(){
        return injector.getInstance(ServiceHistorialEquipos.class);
    }

    public static ServiceFactory getInstance(){
        return instance;
    }
}