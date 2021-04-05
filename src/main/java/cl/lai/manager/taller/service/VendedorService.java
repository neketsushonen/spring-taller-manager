package cl.lai.manager.taller.service;


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