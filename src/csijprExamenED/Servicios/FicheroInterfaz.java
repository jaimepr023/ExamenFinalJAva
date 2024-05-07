package csijprExamenED.Servicios;

import java.util.Scanner;

/**
 * Interfaz que tiene los metodos de los ficheros
 * @author jpr-7/5/2024
 */
public interface FicheroInterfaz {
	
	
	/**
	 * Escribe en el fichero log todo los pasos
	 * @author jpr-7/5/2024
	 * @param mensaje
	 * @param fichero
	 */
	public void imprimirEnFicheroLog(String mensaje,  String fichero);
	
	/**
	 * metodo que imprime las citas en un fichero especifico
	 * @author jpr-7/5/2024
	 * @param sc
	 */
	public void imprimirCitasMedicas(Scanner sc) ;

}
