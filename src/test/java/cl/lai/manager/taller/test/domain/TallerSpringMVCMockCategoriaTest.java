package cl.lai.manager.taller.test.domain;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import cl.lai.manager.taller.App_tutorial_14;
import cl.lai.manager.taller.service.CategoriaCRUDService;
import cl.lai.manager.taller.vo.Categoria;

@RunWith(SpringRunner.class)
@PropertySource("classpath:test-application.properties")
@SpringBootTest(classes = { App_tutorial_14.class },webEnvironment=WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class TallerSpringMVCMockCategoriaTest {
	
	@LocalServerPort
    private int port;

	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private CategoriaCRUDService service;
	    
	    

    @Test
    public void debeRetornarMensajePorDefecto() throws Exception {
    	when(service.get(new Long(1))).thenReturn(new Categoria(1,"Taller","Taller"));
    	when(service.get(new Long(2))).thenReturn(new Categoria(2,"Taller 2","Taller 2"));
    	when(service.get(new Long(3))).thenReturn(new Categoria(2,"Taller 3","Taller 3"));
    	when(service.create("Taller 4","Taller 4")).thenReturn(new Long(4));


        this.mockMvc.perform(get("/categoria/1")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Taller")));
        this.mockMvc.perform(get("/categoria/2")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Taller 2")));
        this.mockMvc.perform(get("/categoria/3")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Taller 3")));
        this.mockMvc.perform(post("/categoria").param("codigo", "Taller 4").param("descripcion", "Taller 4")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("Categoria registrada")));

        this.mockMvc.perform(post("/categoria").param("codigo", "Taller 4").param("descripcion", "Taller 4")).andDo(print()).andExpect(status().isOk()).andExpect(content().json("{\"estado\":1,\"mensaje\":\"Categoria registrada\"}"));
        this.mockMvc.perform(post("/categoria").param("codigo", "Taller 4").param("descripcion", "Taller 4")).andDo(print()).andExpect(status().isOk()).andExpect(content().json("{'estado':1,'mensaje':'Categoria registrada'}"));
        this.mockMvc.perform(post("/categoria").param("codigo", "Taller 4").param("descripcion", "Taller 4")).andDo(print()).andExpect(status().isOk()).andExpect(content().json("{'mensaje':'Categoria registrada','estado':1}"));
    }
}