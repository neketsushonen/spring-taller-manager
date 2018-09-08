package cl.lai.manager.taller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.ApplicationContext;


/**
 * @author chunhaulai
 *
 */
@SpringBootApplication(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class })
public class App_tutorial_10 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
		ApplicationContext applicationContext = SpringApplication.run(App_tutorial_10.class, args);
		//Abrir el browser e introduzca el siguiente link: http://localhost:8080
      
    }
}
