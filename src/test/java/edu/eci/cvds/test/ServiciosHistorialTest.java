/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.test;

import com.google.inject.Inject;
import edu.eci.cvds.sample.factory.ServiceFactory;
import edu.eci.cvds.sample.services.ServiceHistorialEquipos;

public class ServiciosHistorialTest {
    
    @Inject
    private final ServiceHistorialEquipos ServicioHE;

    public ServiciosHistorialTest() {
        ServicioHE = ServiceFactory.getInstance().getServiceHistorialEquipos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}