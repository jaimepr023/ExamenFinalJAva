package csijprExamenED.Servicios;

import java.util.Scanner;

/**
 * Interfaz que tiene la cabecera de los metodos menus
 * 
 * @author jpr-7/5/2024
 */
public interface MenuInterfaz {

	/**
	 * Imprime el menu principal y guarda la opcion del usuario
	 * 
	 * @author jpr-7/5/2024
	 * @param sc (Para pedir al usuario la opcion y guardarla)
	 * @return la opcion
	 */
	public int menuPrincipal(Scanner sc);

	/**
	 * Imprime el menu cliente y guarda la opcion del usuario
	 * 
	 * @author jpr-7/5/2024
	 * @param sc (Para pedir al usuario la opcion y guardarla)
	 * @return la opcion
	 */

	public int menuCliente(Scanner sc);

	/**
	 * Imprime el menu empleado y guarda la opcion del usuario
	 * 
	 * @author jpr-7/5/2024
	 * @param sc (Para pedir al usuario la opcion y guardarla)
	 * @return la opcion
	 */
	public int menuEmpleado(Scanner sc);	
	

}
