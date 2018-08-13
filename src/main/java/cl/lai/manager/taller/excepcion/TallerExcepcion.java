package cl.lai.manager.taller.excepcion;



public class TallerExcepcion extends RuntimeException {
	
	public TallerExcepcion() {
	}

	public TallerExcepcion(String arg0) {
		super(arg0);
	}

	public TallerExcepcion(Throwable arg0) {
		super(arg0);
	}

	public TallerExcepcion(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
}
