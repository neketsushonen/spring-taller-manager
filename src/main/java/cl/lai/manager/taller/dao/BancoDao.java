package cl.lai.manager.taller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import cl.lai.manager.taller.mapper.BancoMapper;
import cl.lai.manager.taller.vo.Banco;
 

public class BancoDao {
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int create(final String codigo,final String descripcion) {
		final String SQL = "INSERT INTO sps_banco (sps_bancocod,sps_banconombre) VALUES (?,?);";
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
		String SQL = "update sps_banco set sps_bancocod=?,sps_banconombre=? where sps_id=?;";
		template.update( SQL,  codigo,descripcion,id);
		return;
	}
	
	public void delete(int codigo) {
		String SQL = "delete from sps_banco where sps_id=?;";
		template.update( SQL, codigo);
		return;
	}
	
	public Banco get(int id) {
	      String SQL = "select * from sps_banco where sps_id = ?";
	      Banco categoria = this.template.queryForObject(SQL, new Object[]{id}, new BancoMapper());
	      return categoria;
	}
	
	public List<Banco> list() {
	      String SQL = "select * from sps_banco order by sps_id";
	      List <Banco> students = template.query(SQL, new BancoMapper());
	      return students;
	}
	
	public List<Banco> list(String cod) {
	      String SQL = "select * from sps_banco where sps_bancocod=? order by sps_id";
	      List <Banco> students = template.query(SQL,new Object[]{cod}, new BancoMapper());
	      return students;
	}
}
