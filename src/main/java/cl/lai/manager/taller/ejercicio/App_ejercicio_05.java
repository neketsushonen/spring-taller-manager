package cl.lai.manager.taller.ejercicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_ejercicio_05 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//1. Implementar el objeto BancoEntity
    	//2. Implementar un repositorio para el BancoEntity
    	//3. Implementar la insercion del objeto BancoEntity
    	//4. Implementar la actualizacion del objeto BancoEntity
    	//5. Implementar la consulta del objeto BancoEntity por el codigo del banco
    	//6. Implementar la eliminacion del objeto BancoEntity
    	//  Ejecutar ambos metodos aqui
    }
}
