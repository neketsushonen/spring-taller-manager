package cl.lai.manager.taller.vo;

public class Banco extends VO{
	
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
	@Override
	public String toString() {
		return "Banco [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
}
