package cl.lai.manager.taller.service;

import java.io.IOException;

import org.springframework.dao.DataAccessException;

import cl.lai.manager.taller.vo.Vendedor;

public interface IVendedorService {
 	public int create(final String nombre,final String direccion, final String rut, final String nick,final String telefono,final String password);
 	public void update(int id, String nombre,String direccion, String rut, String nick, String telefono,final String password);
 	public void delete(int codigo) ;
 	public Vendedor get(int id);
}
