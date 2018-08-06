package cl.lai.manager.taller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.BancoService;
import cl.lai.manager.taller.service.CategoriaService;
import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_tutorial_03 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//Leer la clase
    	CategoriaService service = applicationContext.getBean("categoriaService",CategoriaService.class);
    	
    	//crear la categoria
    	int id = service.create("LIBRERIA","Lapiz / Papel");
    	System.out.println(service.get(id) );
    	
    	//actualizar la categoria
    	service.update(id, "LIBRERIA","Lapices / Papeles");
    	System.out.println(service.get(id) );
    	
    	//eliminar la categoria
    	service.delete(id);
    }
}
