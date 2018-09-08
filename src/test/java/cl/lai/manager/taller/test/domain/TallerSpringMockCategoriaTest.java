package cl.lai.manager.taller.test.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import cl.lai.manager.taller.App_tutorial_12;
import cl.lai.manager.taller.service.CategoriaCRUDService;
import cl.lai.manager.taller.vo.Categoria;

@RunWith(SpringJUnit4ClassRunner.class)
@PropertySource("classpath:test-application.properties")
@SpringBootTest(classes = { App_tutorial_12.class })
public class TallerSpringMockCategoriaTest {
	
	@MockBean
	private CategoriaCRUDService service;
	 
	@Before
	public void setUp() { 
		Mockito.when(service.create("Taller", "Taller")).thenReturn(new Long(1));	
		Categoria taller = new Categoria();
		taller.setCodigo("Taller");
		taller.setDescripcion("Taller");
		Mockito.when(service.get(new Long(1))).thenReturn(taller);
	}
	
	@Test
	public void when_insertarExitosamente() {	 
	    assertThat(service.create("Taller", "Taller")).isEqualTo(new Long(1));
	    assertThat(service.get(new Long(1)).getCodigo()).isEqualTo("Taller");
	}
}