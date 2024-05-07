package csijprExamenED.Servicios;

import java.util.Scanner;

/**
 * Clase que implementa la cabecera de los metodos menu
 * @author jpr-7/5/2024
 */
public class MenuImplemenetacion implements MenuInterfaz {
	
	public int menuPrincipal(Scanner sc) {
		System.out.println("----------------------------");
		System.out.println("Opcion 0. Cerrar Menu");
		System.out.println("Opcion 1. Version empleado");
		System.out.println("Opcion 2. Version cliente");
		System.out.println("----------------------------");
		System.out.println("Elija una opcion");
		int opcion = sc.nextInt();
		return opcion;
	}

	public int menuCliente(Scanner sc) {
		System.out.println("----------------------------");
		System.out.println("Opcion 0. Volver");
		System.out.println("Opcion 1. Registro de cliente");
		System.out.println("Opcion 2. Solicitud de cita medica");
		System.out.println("Opcion 3. Consultar citas medicas para un tiempo");
		System.out.println("----------------------------");
		System.out.println("Elija una opcion");
		int opcion = sc.nextInt();
		return opcion;
	}

	public int menuEmpleado(Scanner sc) {
		System.out.println("----------------------------");
		System.out.println("Opcion 0. Volver");
		System.out.println("Opcion 1. Validar Cliente");
		System.out.println("Opcion 2. Imprimir citas medicas");
		System.out.println("----------------------------");
		System.out.println("Elija una opcion");
		int opcion = sc.nextInt();
		return opcion;
	}
}
