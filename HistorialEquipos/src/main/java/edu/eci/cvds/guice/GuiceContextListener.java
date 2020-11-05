package edu.eci.cvds.guice;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import edu.eci.cvds.persistence.UsuarioDAO;
import edu.eci.cvds.persistence.mybatisimpl.MyBatisUsuarioDAO;
import edu.eci.cvds.service.impl.ServicesUsuarioImpl;
import edu.eci.cvds.service.ServicesUsuario;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

public class GuiceContextListener {
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(((new XMLMyBatisModule() {
            protected void initialize() {
                this.install(JdbcHelper.PostgreSQL);
                this.setEnvironmentId("development");
                this.setClassPathResource("mybatis-config.xml");

                this.bind(ServicesUsuario.class).to(ServicesUsuarioImpl.class);

                // TODO Add service class associated to Stub implementation
                this.bind(UsuarioDAO.class).to(MyBatisUsuarioDAO.class);
            }
        })));
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute(Injector.class.getName(), injector);
    }
}