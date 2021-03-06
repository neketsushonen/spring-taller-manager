package cl.lai.manager.taller.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;

import cl.lai.manager.taller.dao.VendedorDao;
import cl.lai.manager.taller.vo.Vendedor; 

public class VendedorService implements IVendedorService {
	 
	//@Autowired
	//@Qualifier("vendedorDao")
	private VendedorDao vendedorDao;

	public VendedorDao getVendedorDao() {
		return vendedorDao;
	}

	public void setVendedorDao(VendedorDao vendedorDao) {
		this.vendedorDao = vendedorDao;
	}

	public int create(String nombre, String direccion, String rut, String nick, String telefono, String password) {
		return this.vendedorDao.create(nombre, direccion, rut, nick, telefono, password);
	}

	public void update(int id, String nombre, String direccion, String rut, String nick, String telefono,String password) {
		 this.vendedorDao.update(id, nombre, direccion, rut, nick, telefono, password);	
	}

	public void delete(int codigo) {
		this.vendedorDao.delete(codigo);
	}

	public Vendedor get(int id) {
		return this.vendedorDao.get(id);
	}
	 
}