package cl.lai.manager.taller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.ApplicationContext;

import cl.lai.manager.taller.repository.CategoriaRepository;
import cl.lai.manager.taller.vo.CategoriaEntity;



/**
 * @author chunhaulai
 *
 */
@SpringBootApplication(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class })
public class App_tutorial_07 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
		ApplicationContext applicationContext = SpringApplication.run(App_tutorial_07.class, args);
    	
     
    	//Leer la clase
    	CategoriaRepository service = applicationContext.getBean(CategoriaRepository.class);
    	
    	//crear la categoria
    	
    	CategoriaEntity c = new CategoriaEntity();
    	c.setCodigo("LIBRERIA");
    	c.setDescripcion("Lapiz / Papel");
    	service.save(c);
    	System.out.println(service.findById(c.getId()));
    	System.out.println(service.findByCodigo(c.getCodigo()));
    	//eliminar la categoria
    	service.delete(c);
    	 
    }
}
