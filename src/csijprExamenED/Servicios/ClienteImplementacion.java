package csijprExamenED.Servicios;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import csijprExamenED.Constructores.inicioApp;
import csijprExamenED.Dtos.CitasDto;
import csijprExamenED.Dtos.ClienteDto;


/**
 * Implementacion que implem,enta la interfaz cliente
 * @author jpr-7/5/2024
 */
public class ClienteImplementacion implements ClienteInterfaz {

	public void registroCliente(Scanner sc) throws Exception{
		long id = idAutomatico();
		System.out.println("Dame el DNI por favor");
		String dNIClienteString = sc.next();
		System.out.println("Dame el nombre por favor");
		String nombreCliente = sc.next();
		sc.nextLine();
		System.out.println("Dame los apellidos por favor");
		String apellidos =  sc.nextLine();
		sc.nextLine();
		
		ClienteDto client = new ClienteDto(id,nombreCliente,apellidos,dNIClienteString);
		inicioApp.listaCliente.add(client);
	}
	
	/**
	 * Metodo privado que hace el id automatico
	 * @author jpr-7/5/2024
	 * @return
	 */
	private long idAutomatico() throws Exception{
		int tamaño = inicioApp.listaCliente.size();
		long id;
		if(tamaño<=0){
			id = 1;
		}else {
			id = inicioApp.listaCliente.get(tamaño-1).getId() + 1;
		}
		return id;
		
	}


	public void solicitarCitaMedica(Scanner sc) throws Exception{
		
		if(inicioApp.listaCliente.size()>0) {
			System.out.println("Dame el DNI para solicitar una cita");
			String dNI = sc.next();
			
			for(ClienteDto ct : inicioApp.listaCliente) {
				if(ct.getdNICliente().equals(dNI) & ct.isVerificar()==true) {
					System.out.println("----------------------------");
					System.out.println("Opcion 1. Psicologia");
					System.out.println("Opcion 2. Traumatologia");
					System.out.println("Opcion 3. Fisioterapia");
					System.out.println("----------------------------");
					System.out.println("Elija una opcion");
					int opcion = sc.nextInt();
					do {
						CitasDto citasDto = new CitasDto();
						switch (opcion) {
						case 1: 
							citasDto.setDniClienteEnCitas(dNI);
							citasDto.setNombreYApellidosCliente(ct.getNombreCompletoCliente());
							citasDto.setIdCitas(idCitas());
							citasDto.setFechaCita(fechayHora(sc));
							citasDto.setEspecialidad("Psicologia");
							inicioApp.listaCitas.add(citasDto);
							break;
						case 2: 
							citasDto.setDniClienteEnCitas(dNI);
							citasDto.setNombreYApellidosCliente(ct.getNombreCompletoCliente());
							citasDto.setIdCitas(idCitas());
							citasDto.setFechaCita(fechayHora(sc));
							citasDto.setEspecialidad("Traumatologia");
							inicioApp.listaCitas.add(citasDto);
							break;
						case 3: 
							citasDto.setDniClienteEnCitas(dNI);
							citasDto.setNombreYApellidosCliente(ct.getNombreCompletoCliente());
							citasDto.setIdCitas(idCitas());
							citasDto.setFechaCita(fechayHora(sc));
							citasDto.setEspecialidad("Fisioterapia");
							inicioApp.listaCitas.add(citasDto);
							break;
						default:
							System.out.println("Volveras a elegir una opcion ya que no has escogido ninguna correcta");
							break;
						}
					}while(opcion<=0 | opcion>=4);
					
				}
			}
		}

		
	}
	
	/**
	 * Metodo que pide al usuario la fecha en string y la transforma en tipo fecha
	 * @author jpr-7/5/2024
	 * @param sc
	 * @return
	 */
	private LocalDateTime fechayHora(Scanner sc) throws Exception{
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	 System.out.println("Dame la fecha y la hora a la que quieres la cita, con este formato por favor dd/MM/yyyy HH:mm");
	 String fechaString = sc.nextLine();
	 sc.nextLine();
	 LocalDateTime fechaDateTime = LocalDateTime.parse(fechaString, formatter);
	 return fechaDateTime;
		
	}
	
	/**
	 * Metodo que hace el id automatico de las citas
	 * @author jpr-7/5/2024
	 * @return
	 */
	private long idCitas() throws Exception {
		int tamaño = inicioApp.listaCitas.size();
		long id;
		if(tamaño<=0){
			id = 1;
		}else {
			id = inicioApp.listaCitas.get(tamaño-1).getIdCitas() +1;
		}
		return id;
		
	}


	public void consultaCitaMedicaIntervalo(Scanner sc) throws Exception {
		System.out.println("Dame su Dni");
		String dniString = sc.next();
		System.out.println("Dame la fecha de inicio con el formato dd-MM-yyyy");
		LocalDate fechaInicio = pedirFecha(sc);
		System.out.println("Dame la fecha de fin con el formato dd-MM-yyyy");
		LocalDate fechaFin = pedirFecha(sc);
		LocalDate fechaLimiteDate = LocalDate.now();
		
		for(CitasDto cit : inicioApp.listaCitas) {
			if((cit.getFechaCita().getDayOfMonth()==fechaInicio.getDayOfMonth() | cit.getFechaCita().getMonth()==fechaInicio.getMonth() | cit.getFechaCita().getYear()==fechaInicio.getYear()) & (cit.getFechaCita().getDayOfMonth()==fechaFin.getDayOfMonth() | cit.getFechaCita().getMonth()==fechaFin.getMonth() | cit.getFechaCita().getYear()==fechaFin.getYear()) ) {
				System.out.println(cit.getFechaCita() + " " + cit.getEspecialidad());
				
			}
		}
		
		
	}
	
	private LocalDate pedirFecha(Scanner sc) throws Exception{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 String fechaString = sc.nextLine();
		 sc.nextLine();
		 LocalDate fechaDate = LocalDate.parse(fechaString, formatter);
		 return fechaDate;
			
		}
	
	

}
