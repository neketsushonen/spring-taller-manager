package cl.lai.manager.taller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.lai.manager.taller.dao.CategoriaDao;
import cl.lai.manager.taller.repository.CategoriaRepository;
import cl.lai.manager.taller.vo.Categoria;
import cl.lai.manager.taller.vo.CategoriaEntity; 

@Service
public class CategoriaCRUDService   {
	 
	@Autowired
	private CategoriaRepository repository;
	
	public Long create(  String codigo,  String descripcion) {
		CategoriaEntity c = new CategoriaEntity();
    	c.setCodigo(codigo);
    	c.setDescripcion(descripcion);
    	c = repository.save(c);    	
		return c.getId() ;
	}
	
	public void update(Long id, String codigo,String descripcion){
		CategoriaEntity c = new CategoriaEntity();
    	c.setCodigo(codigo);
    	c.setDescripcion(descripcion);
    	c.setId(id);
    	c = repository.save(c);
	}

	public void delete(int codigo) {
		
		this.repository.deleteById(new Long(codigo));
	}

 	public Categoria get(Long id) {
 		CategoriaEntity c = this.repository.findById( id).get();
 		Categoria categoria = new Categoria();
 		categoria.setId(c.getId().intValue());
 		categoria.setCodigo(c.getCodigo());
 		categoria.setDescripcion(c.getDescripcion());
 		return categoria;
	}
}