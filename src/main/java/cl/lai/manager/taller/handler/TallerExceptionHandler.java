package cl.lai.manager.taller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import cl.lai.manager.taller.excepcion.TallerExcepcion;
import cl.lai.manager.taller.vo.ResultadoHTML;

@ControllerAdvice
public class TallerExceptionHandler extends ResponseEntityExceptionHandler {
		
	@ExceptionHandler(TallerExcepcion.class)
	public final ResponseEntity<ResultadoHTML> handleUserNotFoundException(TallerExcepcion ex, WebRequest request) {
		ResultadoHTML resultado = new ResultadoHTML( );
		resultado.setEstado(500);
		resultado.setMensaje(ex.getMessage());
		return new ResponseEntity<ResultadoHTML>(resultado, HttpStatus.I_AM_A_TEAPOT);
	}
}
