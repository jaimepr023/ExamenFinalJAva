package csijprExamenED.Dtos;

import java.time.LocalDateTime;

/**
 * Clase donde se encuentra los atributos de los clientes
 * 
 * @author jpr-7/5/2024
 */
public class ClienteDto {

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apelliCliente) {
		this.apellidoCliente = apelliCliente;
	}

	public String getdNICliente() {
		return dNICliente;
	}

	public void setdNICliente(String dNICliente) {
		this.dNICliente = dNICliente;
	}

	public LocalDateTime getFechaInstante() {
		return fechaInstante;
	}

	public void setFechaInstante(LocalDateTime fechaInstante) {
		this.fechaInstante = fechaInstante;
	}

	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}

	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}

	public boolean isVerificar() {
		return verificar;
	}

	public void setVerificar(boolean verificar) {
		this.verificar = verificar;
	}

	long id;
	String nombreCliente = "aaaaa";
	String apellidoCliente = "aaaaa";
	String dNICliente = "aaaaa";
	LocalDateTime fechaInstante = LocalDateTime.now();
	String nombreCompletoCliente = "aaaaa";
	boolean verificar = false;

	public ClienteDto(long id, String nombreCliente, String apellidoCliente, String dNICliente) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.dNICliente = dNICliente;
		this.fechaInstante = fechaInstante;
		this.nombreCompletoCliente = apellidoCliente + "," + nombreCliente;
		this.verificar = verificar;
	}

	public ClienteDto() {
		super();
	}

}
