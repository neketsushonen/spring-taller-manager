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
public class App_tutorial_09 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
		ApplicationContext applicationContext = SpringApplication.run(App_tutorial_09.class, args);
    	//Abrir el postman e introduzca el siguiente link con método POST: http://localhost:8080/categoria?codigo=spring&descripcion=descripcion
      
    }
}
