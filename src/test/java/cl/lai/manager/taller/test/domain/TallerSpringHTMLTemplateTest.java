package cl.lai.manager.taller.test.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import cl.lai.manager.taller.App_tutorial_12;
import cl.lai.manager.taller.App_tutorial_13;
import cl.lai.manager.taller.service.CategoriaCRUDService;
import cl.lai.manager.taller.vo.Categoria;

@RunWith(SpringRunner.class)
@PropertySource("classpath:test-application.properties")
@SpringBootTest(classes = { App_tutorial_13.class },webEnvironment=WebEnvironment.RANDOM_PORT)
public class TallerSpringHTMLTemplateTest {
	
	@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class)).contains("Categoria");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/taller?name=Taller", String.class)).contains("Taller");
    }
}