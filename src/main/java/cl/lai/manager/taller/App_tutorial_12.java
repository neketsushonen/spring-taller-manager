package cl.lai.manager.taller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


/**
 * @author chunhaulai
 *
 */
@SpringBootApplication(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class })
public class App_tutorial_12 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
		ApplicationContext applicationContext = SpringApplication.run(App_tutorial_12.class, args);
		 
     	//Abrir el browser e introduzca el siguiente link: http://localhost:8080
      
    }
}
