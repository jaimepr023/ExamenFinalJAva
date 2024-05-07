package csijprExamenED.Servicios;

import java.util.Scanner;

/**
 * Interfaz donde se encuentra las cabeceras de los metodos cliente
 */
public interface ClienteInterfaz {
	
	/**
	 * metodo que registra el cliente y lo guarda en una lista
	 * @author jpr-7/5/2024
	 * @param sc
	 */
	public void registroCliente(Scanner sc) throws Exception;
	
	/**
	 * metodo que solicita la cita medica y la guarda en la lista de citas
	 * @author jpr-7/5/2024
	 * @param sc
	 */
	public void solicitarCitaMedica(Scanner sc) throws Exception; 
	
	/**
	 * Metodo que muestra por pantalla todas las citas medicas entre un intervalo de tiempo especifico
	 * @author jpr-7/5/2024
	 * @param sc
	 * @throws Exception
	 */
	public void consultaCitaMedicaIntervalo(Scanner sc) throws Exception;
		
	

}
