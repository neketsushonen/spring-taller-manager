package cl.lai.manager.taller.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hamcrest.Matcher;

@Entity 
@Table(name="sps_categoria")
public class CategoriaEntity{
	
	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "sps_id")
	private Long id;
	
	
	@Column(name = "sps_codigo")
	private String codigo;
	
	@Column(name = "sps_descripcion")
	private String descripcion;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	

}
