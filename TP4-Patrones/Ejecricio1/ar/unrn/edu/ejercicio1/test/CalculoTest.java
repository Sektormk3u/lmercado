package ar.unrn.edu.ejercicio1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.unrn.edu.ejercicio1.Director;
import ar.unrn.edu.ejercicio1.Empleado;
import ar.unrn.edu.ejercicio1.EmpleadoRegular;
import ar.unrn.edu.ejercicio1.Empresa;
import ar.unrn.edu.ejercicio1.Gerente;
import ar.unrn.edu.ejercicio1.LiderDeProyecto;
import ar.unrn.edu.ejercicio1.MandosMedios;

class CalculoTest {

	@Test
	void calculoTestComposite() {
		// setup
		Empleado regular1 = new EmpleadoRegular();
		Empleado regular2 = new EmpleadoRegular();
		Empleado lider = new LiderDeProyecto();
		Empleado mandoMedio = new MandosMedios();
		Empleado gerente = new Gerente();
		Empleado director = new Director();
		lider.aņadirEmpleado(regular1);
		lider.aņadirEmpleado(regular2);
		mandoMedio.aņadirEmpleado(lider);
		gerente.aņadirEmpleado(mandoMedio);
		director.aņadirEmpleado(gerente);
		// excercise
		int resultado = director.montoTotalSalarial();
		// assert
		assertEquals(310, resultado);
	}

	@Test
	void calculoTestEmpresa() {
		// setup
		Empresa empresa = new Empresa();
		Empleado director1 = new Director();
		Empleado director2 = new Director();
		Empleado gerente1 = new Gerente();
		Empleado gerente2 = new Gerente();
		Empleado mandoMedio1 = new MandosMedios();
		Empleado mandoMedio2 = new MandosMedios();
		Empleado lider1 = new LiderDeProyecto();
		Empleado lider2 = new LiderDeProyecto();
		Empleado regular1 = new EmpleadoRegular();
		Empleado regular2 = new EmpleadoRegular();
		Empleado regular3 = new EmpleadoRegular();
		Empleado regular4 = new EmpleadoRegular();
		Empleado regular5 = new EmpleadoRegular();
		Empleado regular6 = new EmpleadoRegular();
		lider1.aņadirEmpleado(regular1);
		lider1.aņadirEmpleado(regular2);
		lider2.aņadirEmpleado(regular3);
		lider2.aņadirEmpleado(regular4);
		mandoMedio1.aņadirEmpleado(lider1);
		mandoMedio2.aņadirEmpleado(lider2);
		gerente1.aņadirEmpleado(mandoMedio1);
		gerente2.aņadirEmpleado(mandoMedio2);
		director1.aņadirEmpleado(gerente1);
		director2.aņadirEmpleado(gerente2);
		empresa.agregarEmpleado(director1);
		empresa.agregarEmpleado(director2);
		empresa.agregarEmpleado(regular5);
		empresa.agregarEmpleado(regular6);
		// excercise
		int monto = empresa.calcularMonto();
		// assert
		assertEquals(680, monto);
	}

}
