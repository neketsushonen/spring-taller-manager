package cl.lai.manager.taller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_tutorial_01 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//Leer la clase
    	IVendedorService service = applicationContext.getBean("vendedorService",VendedorService.class);
    	
    	//crear el vendedor
    	int idVendedor = service.create("Universidad del Biobio", "andres bello 720", "12345678-9","ubb","+56-422463000","ubb");
    	System.out.println(service.get(idVendedor) );
    	
    	//actualizar el vendeor
    	service.update(idVendedor, "Universidad del Bio-bio", "andres bello 720", "12345678-9","ubb","+56-422463000","ubb");
    	System.out.println(service.get(idVendedor) );
    	
    	//eliminar el vendedor
    	service.delete(idVendedor);
    }
}
