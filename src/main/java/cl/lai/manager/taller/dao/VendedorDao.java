package cl.lai.manager.taller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import cl.lai.manager.taller.mapper.VendedorMapper;
import cl.lai.manager.taller.vo.Vendedor;

public class VendedorDao {
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int create(final String nombre,final String direccion, final String rut, final String nick,final String telefono,final String password) {
		final String SQL = "INSERT INTO sps_vendedor (sps_nombre_completo,sps_direccion,sps_rut,sps_nick,sps_telefono,sps_password,sps_privilegio) VALUES (?,?,?,?,?,?,1);";
		KeyHolder keyHolder = new GeneratedKeyHolder();
		template.update(
		    new PreparedStatementCreator() {
		       @Override
				public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {
					PreparedStatement ps =  connection.prepareStatement(SQL, new String[] {"sps_id"});
					ps.setString(1, nombre);
					ps.setString(2, direccion);
					ps.setString(3, rut);
					ps.setString(4, nick);
					ps.setString(5, telefono);
					ps.setString(6, password);
			        return ps;
				}
		    },
		    keyHolder);
		return keyHolder.getKey().intValue();
	}
	
	public void update(int id, String nombre,String direccion, String rut, String nick, String telefono,final String password) {
		String SQL = "update sps_vendedor set sps_nombre_completo=?,sps_direccion=?,sps_rut=?,sps_nick=?,sps_telefono=?,sps_password=? where sps_id=?;";
		template.update(SQL,nombre,direccion,rut,nick,telefono,password,id);
		return;
	}
	
	public void delete(int codigo) {
		String SQL = "delete from sps_vendedor where sps_id=?;";
		template.update( SQL, codigo);
		return;
	}
	
	public Vendedor get(int id) {
	      String SQL = "select * from sps_vendedor where sps_id = ?";
	      Vendedor categoria = this.template.queryForObject(SQL, new Object[]{id}, new VendedorMapper());
	      return categoria;
	}
	
	public List<Vendedor> list() {
	      String SQL = "select * from sps_vendedor where sps_privilegio=1  order by sps_id";
	      List <Vendedor> students = template.query(SQL, new VendedorMapper());
	      return students;
	}
	
	public List<Vendedor> list(String nick) {
	      String SQL = "select * from sps_vendedor where sps_nick=? and sps_privilegio=1 order by sps_id";
	      List <Vendedor> students = template.query(SQL, new Object[]{nick}, new VendedorMapper());
	      return students;
	}
}
