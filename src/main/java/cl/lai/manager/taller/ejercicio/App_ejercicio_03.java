package cl.lai.manager.taller.ejercicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_ejercicio_03 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//1. Duplicar la clase cl.lai.manager.taller.dao.VendedorDao en cl.lai.manager.taller.dao.NuevoVendedorDao
    	//2. Declarar la clase cl.lai.manager.taller.dao.NuevoVendedorDao como "Component"
    	//3. Incorporar directamente NuevoVendedorDao en el cl.lai.manager.taller.service.VendedorService
    	//4. Cambiar la implementacion del metodo create y delete el vendedor por NuevoVendedorDao
    	//5. Ejecutar ambos metodos aqui
    }
}
