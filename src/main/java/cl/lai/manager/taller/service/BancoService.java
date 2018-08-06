package cl.lai.manager.taller.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cl.lai.manager.taller.dao.BancoDao;
import cl.lai.manager.taller.vo.Banco; 

public class BancoService   {
	 
	@Autowired
	@Qualifier("bancoDao")
	private BancoDao bancoDao;
 

	public int create(  String codigo,  String descripcion) {
		return this.bancoDao.create(codigo, descripcion );
	}
	
	public void update(int id, String codigo,String descripcion){
		this.bancoDao.update(id, codigo, descripcion);
	}

	public void delete(int codigo) {
		this.bancoDao.delete(codigo);
	}

 	public Banco get(int id) {
		return this.bancoDao.get(id);
	}
}