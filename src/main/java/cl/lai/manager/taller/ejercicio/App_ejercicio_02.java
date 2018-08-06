package cl.lai.manager.taller.ejercicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_ejercicio_02 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//1. Implementar la clase  cl.lai.manager.taller.service.NuevoBancoService
    	//2. Declarar la clase NuevoBancoService en springApplicationContext.xml
    	//3. Incorporar directamente el objeto jdbcTemplate mediante Autowired y Qualifier
    	//4. Implementar el metodo crear banco y eliminar el banco
    	//5. Ejecutar ambos metodos aqui
    }
}
