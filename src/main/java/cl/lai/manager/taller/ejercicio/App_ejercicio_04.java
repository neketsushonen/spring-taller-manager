package cl.lai.manager.taller.ejercicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_ejercicio_04 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//1. Duplicar la clase cl.lai.manager.taller.dao.BancoDao en cl.lai.manager.taller.dao.NuevoBancoDao
    	//2. Declarar la clase cl.lai.manager.taller.dao.NuevoBancoDao como "Component"
    	//3. Implementar cl.lai.manager.taller.service.BancoCRUDService definiendo NuevoBancoDao como propiedad
    	//4. Declarar cl.lai.manager.taller.service.BancoCRUDService como "Service"
    	//4. Implementar metodo create y delete el banco por NuevoBancoDao
    	//5. Ejecutar ambos metodos aqui
    }
}
