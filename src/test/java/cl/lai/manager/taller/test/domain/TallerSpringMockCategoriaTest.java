package cl.lai.manager.taller.test.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import cl.lai.manager.taller.App_tutorial_12;
import cl.lai.manager.taller.repository.CategoriaRepository;
import cl.lai.manager.taller.service.CategoriaCRUDService;
import cl.lai.manager.taller.vo.Categoria;
import cl.lai.manager.taller.vo.CategoriaEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@PropertySource("classpath:test-application.properties")
@SpringBootTest(classes = { App_tutorial_12.class })
public class TallerSpringMockCategoriaTest {
	
	@Mock
	private CategoriaRepository repository;

	@MockBean
	private CategoriaCRUDService service;

	@Spy
	private CategoriaCRUDService serviceReal;

	@Before
	public void setUp() { 
		
	}
	@Test
	public void when_sumarExitosamente() {	 
		Mockito.when(service.sumar(1,2)).thenReturn(3);	
		assertThat(service.sumar(1,2)).isEqualTo(3);
	}

	@Test
	public void when_sumarRealExitosamente() {	 
		//assertThat(serviceReal.sumar(1,2)).isEqualTo(new Integer(3));
		Integer result = serviceReal.sumar(1,2);
		assertThat(new Integer(3)).isEqualTo(result);
	}
	
	@Test
	public void when_insertarExitosamente() {	 
		Mockito.when(service.create("Taller", "Taller")).thenReturn(anyLong());	
		Categoria taller = new Categoria();
		taller.setCodigo("Taller");
		taller.setDescripcion("Taller");
		Mockito.when(service.get(new Long(1))).thenReturn(taller);
	    assertThat(service.create("Taller", "Taller")).isNotNull();
	    assertThat(service.get(new Long(1)).getCodigo()).isEqualTo("Taller");
	}

	@Test
	public void when_insertarExitosamenteReal() {	 


		CategoriaEntity e = new CategoriaEntity();
		e.setId(new Long(1));
		e.setCodigo("Taller");
		e.setDescripcion("Taller"); 

		Mockito.when(repository.save(any(CategoriaEntity.class))).thenReturn(e); 
		
		Long id = serviceReal.create("Taller", "Taller");
	    assertThat(id).isNotNull();
	}
}