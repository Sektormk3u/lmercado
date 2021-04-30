package ar.unrn.edu.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cumpleanos {

	private ServicioEmailEmpleado servicioEmail;
	private RepositorioArchivo repoArchivo;

	public Cumpleanos(ServicioEmailEmpleado servicioEmail, RepositorioArchivo repoArchivo) {
		this.servicioEmail = servicioEmail;
		this.repoArchivo = repoArchivo;
	}

	public void enviarEmailSiEsSuCumplea�os(String tituloEmail, String cuerpoEmail) {
		ArrayList<Empleado> lista = this.repoArchivo.devolverColeccionEmpleados();
		for (Empleado empleado : lista) {
			if (empleado.esSuCumplea�os()) {
				this.servicioEmail.enviarEmailEmpleado(empleado.devolverEmail(), tituloEmail, cuerpoEmail); // enviar
																											// datos de
																											// mail
			}
		}

	}

}
