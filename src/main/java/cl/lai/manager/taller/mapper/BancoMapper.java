package cl.lai.manager.taller.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.lai.manager.taller.vo.Banco;

 
public class BancoMapper implements RowMapper<Banco> {

	@Override
	public Banco mapRow(ResultSet rs, int rowNum) throws SQLException {
		Banco s = new Banco();
		s.setId(rs.getInt("sps_id"));
		s.setCodigo(rs.getString("sps_bancocod"));
		s.setDescripcion(rs.getString("sps_banconombre"));
		return s;
	}

}
