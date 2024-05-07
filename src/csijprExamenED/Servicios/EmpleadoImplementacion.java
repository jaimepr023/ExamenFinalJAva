package csijprExamenED.Servicios;

import java.util.Scanner;

import csijprExamenED.Constructores.inicioApp;
import csijprExamenED.Dtos.ClienteDto;

/**
 * Implementacion que implementa la interfaz empleado
 * @author jpr-7/5/2024
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {

	/**
	 * Metodo que valida  el cliente  
	 * @author jpr-7/5/2024
	 */
	public void validarCliente(Scanner sc) throws Exception {
		
		if (inicioApp.listaCliente.size() > 0) {
			for (ClienteDto ct : inicioApp.listaCliente) {
				if (ct.isVerificar() == false) {
					System.out.println(
							"DNI-->" + ct.getdNICliente() + " Nombre completo--> " + ct.getNombreCompletoCliente());
				}
			}

			System.out.println("Dame el DNi para validar su cliente");
			String dNICliente = sc.next();
			System.out.println("A continuacion recibira un mensaje de que se ha verificado, en caso contrario es que ese usuario no existe o se ha equivocado al darme el DNI");
			for (ClienteDto ct : inicioApp.listaCliente) {
				if(ct.getdNICliente().equals(dNICliente)) {
					ct.setVerificar(true);
					System.out.println("Se ha validado el usuario correctamente");
				}
			}
		}

	}

}
