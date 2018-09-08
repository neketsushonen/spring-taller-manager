package cl.lai.manager.taller.test.domain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cl.lai.manager.taller.App_tutorial_11;
import cl.lai.manager.taller.repository.CategoriaRepository;
import cl.lai.manager.taller.vo.CategoriaEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations="classpath:test-application.properties")
@SpringBootTest(classes = { App_tutorial_11.class } )
public class TallerSpringDomainCategoriaTest {
	
	@Autowired
	private CategoriaRepository categoryRepository ;

	List<Long> ids = new ArrayList<Long>();
	
	@Test
	public void testInsercionCategoria() {
		CategoriaEntity c = new CategoriaEntity();
    	c.setCodigo("LIBRERIA");
    	c.setDescripcion("Lapiz / Papel");
    	c = categoryRepository.save(c);
    	ids.add(c.getId());
    	//probar la insercion
    	assertEquals("LIBRERIA", categoryRepository.findById(c.getId()).get().getCodigo());    	
	 }
	
	@Test
	public void testActualizacionCategoria() {
		CategoriaEntity c = new CategoriaEntity();
    	c.setCodigo("LIBRERIA");
    	c.setDescripcion("Lapiz / Papel");
    	c = categoryRepository.save(c);
    	ids.add(c.getId());
    	
    	c.setCodigo("LIBRERIA II");
    	c = categoryRepository.save(c);
    	
    	//probar la insercion
    	assertEquals("LIBRERIA II", categoryRepository.findById(c.getId()).get().getCodigo());    	
	 }
	
	@Test
	public void testEliminarCategoria() {
		CategoriaEntity c = new CategoriaEntity();
    	c.setCodigo("LIBRERIA");
    	c.setDescripcion("Lapiz / Papel");
    	c = categoryRepository.save(c);
    	categoryRepository.delete(c);
    	
    	//probar la insercion
    	assertEquals(false, categoryRepository.findById(c.getId()).isPresent());    	
	 }
	
	@After
	public void after(){
		//eliminar los datos desde la base de datos
		for(Long id: ids)
			categoryRepository.deleteById(id);
	}
}
