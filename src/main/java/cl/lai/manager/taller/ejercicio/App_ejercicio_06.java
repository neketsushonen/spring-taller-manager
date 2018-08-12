package cl.lai.manager.taller.ejercicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.lai.manager.taller.service.IVendedorService;
import cl.lai.manager.taller.service.VendedorService;

/**
 * @author chunhaulai
 *
 */
public class App_ejercicio_06 {
    public static void main( String[] args ){
    	//leer el archivo del contexto
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
    	
    	//1. Definir las siguientes propiedades en el archivo config.properties 
    	/*
    	 
    	 	database2.driverClassName=com.mysql.jdbc.Driver
		  	database2.url=jdbc:mysql://localhost:3306/taller
			database2.username=root
			database2.password=
			
    	 */
    	//2. Implementar IoC de esas proiedades en cl.lai.manager.taller.config.ConfigProperty (con nuevos atributos)
    	/*
    	 
    	 	en cl.lai.manager.taller.config.ConfigProperty, agregar la inyeccion de los atributos:
			driverClassName2, url2, username2, password2
		 
    	 */
    	//3. Implementar la instanciacion del bean dataSource2 con las nuevas propiedades
    	
    	//4. Implementar  la instanciacion de "jdbcTemplate" con nuevo dataSource2 en cl.lai.manager.taller.config.ConfigProperty (y borrarlo desde springApplitactionContext)
    	
    }
}
