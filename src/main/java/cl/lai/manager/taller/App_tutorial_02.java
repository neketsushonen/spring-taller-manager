package cl.lai.manager.taller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.BancoService;
import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_tutorial_02 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//Leer la clase
    	BancoService service = applicationContext.getBean("bancoService",BancoService.class);
    	
    	//crear el banco
    	int idBanco = service.create("BCHICLRM","Banco Chile / Edwards");
    	System.out.println(service.get(idBanco) );
    	
    	//actualizar el banco
    	service.update(idBanco, "BCHICLRM", "Banco de Chile");
    	System.out.println(service.get(idBanco) );
    	
    	//eliminar el banco
    	service.delete(idBanco);
    }
}
