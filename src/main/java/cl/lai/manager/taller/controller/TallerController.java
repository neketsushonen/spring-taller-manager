package cl.lai.manager.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.lai.manager.taller.repository.CategoriaRepository;
import cl.lai.manager.taller.vo.CategoriaEntity;
import cl.lai.manager.taller.vo.ResultadoHTML;

@Controller
public class TallerController {
	
	@GetMapping("/taller")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "taller";
    }
	
	@Autowired
	CategoriaRepository service ;
	
	@GetMapping("/categoria")
    public @ResponseBody List<CategoriaEntity> listCategoria ( Model model) {
        return this.service.findAll();
    }
	
	@PostMapping("/categoria")
    public @ResponseBody ResultadoHTML insert (
    		@RequestParam(name="codigo", required=true ) String codigo,
    		@RequestParam(name="descripcion", required=true ) String descripcion
    	) {
		
		CategoriaEntity c = new CategoriaEntity();
    	c.setCodigo(codigo);
    	c.setDescripcion(descripcion);
    	service.save(c);
    	
		ResultadoHTML result = new ResultadoHTML();
		result.setEstado(1);
		result.setMensaje("Categoria registrada");
        return result;
    }
}
