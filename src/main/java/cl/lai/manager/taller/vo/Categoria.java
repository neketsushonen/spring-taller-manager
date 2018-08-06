package cl.lai.manager.taller.vo;

public class Categoria extends VO{
	
	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	private String codigo,descripcion;
	
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
}
