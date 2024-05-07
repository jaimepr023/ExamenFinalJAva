package csijprExamenED.Servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import csijprExamenED.Constructores.inicioApp;
import csijprExamenED.Dtos.CitasDto;

/**
 * Clase de fichero para escribir y hacer operativas con ellos 
 * @author jpr-7/5/2024
 */
public class FicheroImplementacion implements FicheroInterfaz {
	
	public void imprimirEnFicheroLog(String mensaje, String fichero) {
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter(fichero,true));
			printWriter.println(mensaje);
			printWriter.close();
			
		} catch (IOException e) {
			System.out.println("Ha habido un error con el fichero log, tardata unos minutos");
		}
		
		
	}

	
	public void imprimirCitasMedicas(Scanner sc)  {
		try {
			LocalDate fechaEspecificada = fecha(sc) ;
			SimpleDateFormat desFormato = new SimpleDateFormat();
			String ficheroCitas = "informe-" + desFormato.format(fechaEspecificada)+".txt";
			PrintWriter pw = new PrintWriter(new FileWriter(ficheroCitas),true);
			System.out.println("A continuacion se le escribira en el fichero toda la informacion, si por un casual no hay informacion es que no hay informacion que mostrar");
			for(CitasDto ct : inicioApp.listaCitas) {
				if(ct.getFechaCita().getDayOfMonth()==fechaEspecificada.getDayOfMonth() | ct.getFechaCita().getMonth()==fechaEspecificada.getMonth() | ct.getFechaCita().getYear()==fechaEspecificada.getYear() ) {
					pw.println(ct.getDniClienteEnCitas()+";"+ct.getNombreYApellidosCliente()+";"+ct.getEspecialidad());
				}
			}
			pw.close();

		} catch (IOException e) {
		System.out.println("Ha ocurrido un error en el fichero que imprime las citas, por favor intentelo mas tarde");
		}
		
		
	}
	
	/**
	 * metodo privado que pide una fecha y la formatea de string a fecha
	 * @author jpr-7/5/2024
	 * @param sc
	 * @return
	 */
	private LocalDate fecha(Scanner sc) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 System.out.println("Dame la fecha a la que quieres ver el informe de las citas del dia, con este formato por favor dd-MM-yyyy");
		 String fechaString = sc.next();
		 LocalDate fechaDate = LocalDate.parse(fechaString, formatter);
		 return fechaDate;			
		}

}
