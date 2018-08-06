package cl.lai.manager.taller.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.lai.manager.taller.vo.Vendedor;

public class VendedorMapper implements RowMapper<Vendedor> {

	@Override
	public Vendedor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vendedor s = new Vendedor();
		s.setId(rs.getInt("sps_id"));
		s.setNombre(rs.getString("sps_nombre_completo"));
		s.setDireccion(rs.getString("sps_direccion"));
		s.setRut(rs.getString("sps_rut"));
		s.setNick(rs.getString("sps_nick"));
		s.setTelefono(rs.getString("sps_telefono"));
		s.setPassword(rs.getString("sps_password"));
		return s;
	}

}
