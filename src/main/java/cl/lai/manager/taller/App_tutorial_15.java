package cl.lai.manager.taller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;


/**
 * @author chunhaulai
 *
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class App_tutorial_15 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
		ApplicationContext applicationContext = SpringApplication.run(App_tutorial_15.class, args);
		 
		//1) Entrar en el proyecto spring-taller-microservicio-eureka e iniciar la aplicacion AppEurekaserver
        //2) Entrar en el proyecto spring-taller-microservicio-consumer e iniciar la aplicacion App_tutorial_15
		//3) Inicializar la aplicación actual App_tutorial_15.
     	//4) Abrir el browser e introduzca el siguiente link: http://localhost:8260
     	//5) Abrir el browser e introduzca el siguiente link: http://localhost:8080/categoria

      
    }
}
