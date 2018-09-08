package cl.lai.manager.taller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.lai.manager.taller.service.CategoriaCRUDService;
import cl.lai.manager.taller.vo.Categoria;
import cl.lai.manager.taller.vo.ResultadoHTML;

@Controller
public class CategoriaCRUDController {
	
	 
	@Autowired
	CategoriaCRUDService categoriaService ;
	
	@GetMapping("/categoria/{id}")
    public @ResponseBody Categoria get (@PathVariable long id,   Model model) {		
		return this.categoriaService.get(id);
    }
	
	@PostMapping("/categoria")
    public @ResponseBody ResultadoHTML insert (
    		@RequestParam(name="codigo", required=true ) String codigo,
    		@RequestParam(name="descripcion", required=true ) String descripcion
    	) {
		categoriaService.create(codigo, descripcion);
    	
		ResultadoHTML result = new ResultadoHTML();
		result.setEstado(1);
		result.setMensaje("Categoria registrada");
        return result;
    }
	
}
