package cl.lai.manager.taller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import cl.lai.manager.taller.mapper.CategoriaMapper;
import cl.lai.manager.taller.vo.Categoria;
 
@Component
public class CategoriaDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public int create(final String codigo,final String descripcion) {
		final String SQL = "INSERT INTO sps_categoria (sps_codigo,sps_descripcion) VALUES (?,?);";
		KeyHolder keyHolder = new GeneratedKeyHolder();
		template.update(
		    new PreparedStatementCreator() {
		       @Override
				public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {
					PreparedStatement ps =  connection.prepareStatement(SQL, new String[] {"sps_id"});
					ps.setString(1, codigo);
					ps.setString(2, descripcion);
			        return ps;
				}
		    },
		    keyHolder);
		return keyHolder.getKey().intValue();
	}
	
	public void update(int id, String codigo,String descripcion) {
		String SQL = "update sps_categoria set sps_codigo=?,sps_descripcion=? where sps_id=?;";
		template.update( SQL,codigo,descripcion,id);
		return;
	}
	
	public void delete(int codigo) {
		String SQL = "delete from sps_categoria where sps_id=?;";
		template.update( SQL, codigo);
		return;
	}
	
	public Categoria get(int id) {
	      String SQL = "select * from sps_categoria where sps_id = ?";
	      Categoria categoria = this.template.queryForObject(SQL, new Object[]{id}, new CategoriaMapper());
	      return categoria;
	}
	
	public List<Categoria> list() {
	      String SQL = "select * from sps_categoria order by sps_id";
	      List <Categoria> students = template.query(SQL, new CategoriaMapper());
	      return students;
	}
	
	public List<Categoria> list(String cod) {
	      String SQL = "select * from sps_categoria where sps_codigo=? order by sps_id";
	      List <Categoria> students = template.query(SQL,new Object[]{cod}, new CategoriaMapper());
	      return students;
	}
}
