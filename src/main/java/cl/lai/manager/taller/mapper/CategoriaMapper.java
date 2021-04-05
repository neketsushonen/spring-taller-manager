package cl.lai.manager.taller.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.lai.manager.taller.vo.Categoria;

public class CategoriaMapper implements RowMapper<Categoria> {

	public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categoria s = new Categoria();
		s.setId(rs.getInt("sps_id"));
		s.setCodigo(rs.getString("sps_codigo"));
		s.setDescripcion(rs.getString("sps_descripcion"));
		return s;
	}

}
