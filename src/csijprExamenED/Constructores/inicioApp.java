package csijprExamenED.Constructores;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import csijprExamenED.Dtos.CitasDto;
import csijprExamenED.Dtos.ClienteDto;
import csijprExamenED.Servicios.ClienteImplementacion;
import csijprExamenED.Servicios.ClienteInterfaz;
import csijprExamenED.Servicios.EmpleadoImplementacion;
import csijprExamenED.Servicios.EmpleadoInterfaz;
import csijprExamenED.Servicios.FicheroImplementacion;
import csijprExamenED.Servicios.FicheroInterfaz;
import csijprExamenED.Servicios.MenuImplemenetacion;
import csijprExamenED.Servicios.MenuInterfaz;

/**
 * Clase donde se encuentra el metodo main
 * @author jpr-7/5/2024
 */
public class inicioApp {
	
	public static List<ClienteDto> listaCliente = new ArrayList<ClienteDto>();
	public static List<CitasDto> listaCitas = new ArrayList<CitasDto>();

	/**
	 * Metodo main donde se encuentra todo el procedimineto del programa
	 * @author jpr-7/5/2024
	 * @param args
	 */
	public static void main(String[] args) {
		// Copias de las clases
		MenuInterfaz mi = new MenuImplemenetacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		ClienteInterfaz ci = new ClienteImplementacion();
		EmpleadoInterfaz ep = new EmpleadoImplementacion();

		LocalDate fechaHoyDate = LocalDate.now();
		SimpleDateFormat desFormato = new SimpleDateFormat();
		String ficheroLogString = "log-" + desFormato.format(fechaHoyDate)+".txt";
		
		Scanner sc = new Scanner(System.in);
		int opcionMenuPrincipal;
		int opcionMenuEmpleados;
		int opcionMenuClientes;
		boolean cerrarMenu = false;

		String mensajeString;
		try {
	do {
				switch (opcionMenuPrincipal = mi.menuPrincipal(sc)) {
				case 0:
					mensajeString ="Opcion 0. Cerrar Menu";
					fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
					cerrarMenu = true;
					break;
				case 1:
					mensajeString ="Opcion 1. Version Empleado";
					fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
					// Version empleado
					switch (opcionMenuEmpleados = mi.menuEmpleado(sc)) {
					case 0:
						mensajeString ="Opcion 1.0. Volver al menu principal";
						fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
						break;
					case 1:
						mensajeString ="Opcion 1.1. Validar Cliente";
						fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
						ep.validarCliente(sc);
						break;
					case 2:
						mensajeString ="Opcion 1.2. Imprimir citas medicas";
						fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
						fi.imprimirCitasMedicas(sc);
						break;
					default:
						System.out.println("No has elegido la opcion correctamente,  volvera al inicio de la aplicacion.");
						break;
					}
					break;
				
				case 2:
					
					// Version cliente
					mensajeString ="Opcion 2. Version Cliente";
					fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
					switch (opcionMenuClientes = mi.menuCliente(sc)) {
					case 0:
						mensajeString ="Opcion 2.0. Volver al menu principal";
						fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
						break;
					case 1:
						mensajeString ="Opcion 2.1. Registrar Cliente";
						fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
						ci.registroCliente(sc);
						break;
					case 2:
						mensajeString ="Opcion 2.2. Solicitar citas medicas";
						fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
						ci.solicitarCitaMedica(sc);
						break;
					case 3:
						//Extra
						mensajeString ="Opcion 2.3. Consultar citas en un intervalo de tiempo";
						fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
						ci.consultaCitaMedicaIntervalo(sc);
						break;
					default:
						System.out.println("No has elegido la opcion correctamente, volvera al inicio de la aplicacion.");
						break;
					}
					break;
				default:
					System.out.println("No has elegido la opcion correctamente, vuelve a intentarlo de nuevo.");
					break;
				}

			} while (!cerrarMenu);
		} catch (Exception e) {
			System.out.println(
					"Lo sieno por las molestias, pero ha habido un error en la aplicacion, intentelo de nuevo mas tarde.");
			mensajeString = e.getMessage();
			fi.imprimirEnFicheroLog(mensajeString, ficheroLogString);
		}

	}

}
