package cl.lai.manager.taller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.repository.CategoriaRepository;
import cl.lai.manager.taller.vo.CategoriaEntity;



/**
 * @author chunhaulai
 *
 */
public class App_tutorial_05 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
     
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
