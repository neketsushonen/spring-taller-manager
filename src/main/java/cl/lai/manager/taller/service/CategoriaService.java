package cl.lai.manager.taller.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cl.lai.manager.taller.dao.BancoDao;
import cl.lai.manager.taller.dao.CategoriaDao;
import cl.lai.manager.taller.vo.Banco;
import cl.lai.manager.taller.vo.Categoria; 

public class CategoriaService   {
	 
	@Autowired
	private CategoriaDao categoriaDao;
 

	public int create(  String codigo,  String descripcion) {
		return this.categoriaDao.create(codigo, descripcion );
	}
	
	public void update(int id, String codigo,String descripcion){
		this.categoriaDao.update(id, codigo, descripcion);
	}

	public void delete(int codigo) {
		this.categoriaDao.delete(codigo);
	}

 	public Categoria get(int id) {
		return this.categoriaDao.get(id);
	}
}