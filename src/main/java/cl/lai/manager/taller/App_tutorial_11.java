package cl.lai.manager.taller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;


/**
 * @author chunhaulai
 *
 */
@SpringBootApplication(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class })
public class App_tutorial_11 {
    public static void main( String[] args ){
    	//1) Abrir la clase TallerSpringDomainCategoriaTest en carpeta /test
		//2) Ejecutar la prueba
    }
}
